package configurations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class AppiumWrapper extends ConfigReader {


    /**
     * Singleton design pattern to have only 1 appium driver object
     */
    private static AppiumDriverLocalService service;
    private static AndroidDriver appiumDriver;



    /**
     * This method initializes the appium driver object on default mobile device specified in the config file
     *
     * @throws MalformedURLException
     */
    private static void intializeAppiumDriver() throws MalformedURLException {
        appiumDriver = buildAppiumDriver();

        // This is used in cases where fluent wait is not applied (fluentWait() at BaseWebPage class)
//        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeTest
    public static AppiumDriverLocalService startAppium(){
        ConfigReader configReader = new ConfigReader();
//       CommandLine cmd = new CommandLine("/home/akbar/oldfiles/genymotion/genymotion -avd Samsung Galaxy S7 - 7.1.0 - API 25 - 1440x2560");
//
//
//        DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
//        DefaultExecutor executor = new DefaultExecutor();
//
//        try {
//            executor.execute(cmd,handler);
//
//            Thread.sleep(30000);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//         catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if(SystemUtils.IS_OS_LINUX){
//            String command = "/home/akbar/Android/Sdk/tools emulator -avd Nexus_6_API_25";
//            try {
//                Process pb = Runtime.getRuntime().exec(command);
//                Thread.sleep(30000);
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }
//        }





        try {

            service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                .usingDriverExecutable(new File(configReader.getNodeExecutablePath()))
//                .withAppiumJS(new File(configReader.getAppiumExecutablePath()))
                .withIPAddress(configReader.getIpAddress())
                .usingPort(configReader.getPortNumber()));
            service.start();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return service;
    }



    public static AndroidDriver buildAppiumDriver() {

        ConfigReader configReader = new ConfigReader();


        DesiredCapabilities capabilities = new DesiredCapabilities();

//        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Hotels.com");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, configReader.getPlatformName());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//        capabilities.setCapability("avd","Nexus_6_API_25");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configReader.getPlatformVersion());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, configReader.getDeviceName());
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, configReader.getAppLocation());//Hotels.com
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15000);



    try {
        appiumDriver = new AndroidDriver(startAppium().getUrl(),capabilities);
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//    } catch (MalformedURLException e) {
//        e.printStackTrace();
//    }

    return appiumDriver;
    }


    /**
     * This method is used to quit the Appium driver if it is not null
     */

    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            System.out.println("Quitting Appium..");
            appiumDriver.quit();
            System.out.println("Quitting Appium - Done");
            appiumDriver = null;
            if(service!=null){
                service.stop();
            }

        }
    }

    /**
     * This will start an Appium server and return an Appium driver (or initialize it if it's not initialized)
     * Only 1 driver and server will be started/initialized per run
     *
     * @return Appium driver
     */
    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            try {
                // Initialize the appium server the first time the driver is created

                // the start appium server may be called mulitple times, since only 1 instance is created
                intializeAppiumDriver();
            } catch (MalformedURLException e) {
                Assert.fail("Unable to initialize Appium driver due to invalid Server URL or there server is already in use");

            }
        }

        return appiumDriver;
    }
}
