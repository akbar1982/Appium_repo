package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginScreen;

public class TestInvalidLogin {
    LandingPage landingPage = new LandingPage();
    LoginScreen loginScreen = new LoginScreen();

    @When("^i press OK button from pop Up screen$")
    public void i_press_OK_button_from_pop_Up_screen()  {
        landingPage.tapOnYesButton();
    }

    @When("^I press corner Menu button$")
    public void i_press_corner_Menu_button()  {
        landingPage.tapOnMainMenuButton();
    }

    @When("^I choose sign in from menu$")
    public void i_choose_sign_in_from_menu()  {
        landingPage.tapOnSignInButton();
    }

    @When("^I enter \"([^\"]*)\" into email textfield$")
    public void i_enter_into_email_textfield(String arg1)  {
        loginScreen.enterEmailAddress(arg1);
    }

    @When("^I enter \"([^\"]*)\" into password field$")
    public void i_enter_into_password_field(String arg1) {
        loginScreen.enterPassword(arg1);

    }
    @When("^I press signIn button$")
    public void i_press_signIn_button(){
        loginScreen.tapOnSignInButton();
    }
    @Then("^I verify displayed \"([^\"]*)\" given below$")
    public void iVerifyDisplayedGivenBelow(String arg1) {
        Assert.assertEquals(loginScreen.getErrorMassage(),arg1 );
//        loginScreen.tapOnOkbutton();
    }






}
