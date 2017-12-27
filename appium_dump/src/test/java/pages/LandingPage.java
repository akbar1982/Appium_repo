package pages;

import configurations.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LandingPage extends BaseAction {

    @AndroidFindBy(id = "com.hcom.android:id/btnPositive")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open drawer menu']")
    //UiSelector().className(android.widget.LinearLayout).clickable(true))");
    private MobileElement mainMenu;

    @AndroidFindBy(id = "com.hcom.android:id/drawer_header_sign_in")
    private MobileElement signInButton;

    public void tapOnYesButton() {
        tapOn(yesButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public void tapOnSignInButton() {
        tapOn(signInButton);
    }
}
