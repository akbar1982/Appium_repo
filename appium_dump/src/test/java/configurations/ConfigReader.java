package configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ConfigReader {

    private  String nodeExecutablePath;
    private  String appiumExecutablePath;
    private  String appLocation;
    private  String platformVersion;
    private  String platformName;
    private  String ipAddress;
    private  String portNumber;
    private  String deviceName;


    public ConfigReader(){
    Properties prop = new Properties();
    InputStream input = null;

        try {

        input = new FileInputStream("config.properties");

        // load a properties file
        prop.load(input);

        // get the property value and print it out
        this.nodeExecutablePath = prop.getProperty("NODE_EXECUTABLE");
        this.appiumExecutablePath = prop.getProperty("APPIUM_EXECUTABLE");
        this.appLocation = prop.getProperty("APP_Location");
        this.platformVersion = prop.getProperty("Platform_version");
        this.platformName = prop.getProperty("Platform_name");
        this.ipAddress = prop.getProperty("IP_ADDRESS");
        this.portNumber = prop.getProperty("PORT_NUMBER");
        this.deviceName = prop.getProperty("Device_Name");

    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        if (input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

    public  String getNodeExecutablePath() {
        return nodeExecutablePath;
    }

    public  String getAppiumExecutablePath() {
        return appiumExecutablePath;
    }

    public  String getDeviceName() {
        return deviceName;
    }

    public  String getAppLocation() {
        return appLocation;
    }

    public  String getPlatformVersion() {
        return platformVersion;
    }

    public  String getPlatformName() {
        return platformName;
    }

    public  String getIpAddress() {
        return ipAddress;
    }

    public  int getPortNumber() {
        return Integer.parseInt(portNumber);
    }
}
