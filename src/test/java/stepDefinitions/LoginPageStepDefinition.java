package stepDefinitions;

import browserFactory.DriverBaseClass;
import functionFile.*;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class LoginPageStepDefinition extends DriverBaseClass {

    HomePageFunctions homePageFunctions = PageFactory.initElements(driver, HomePageFunctions.class);
    SummerDressesPageFunctions summerDressesPageFunctions = PageFactory.initElements(driver, SummerDressesPageFunctions.class);
    LoginPageFunctions loginPageFunctions = PageFactory.initElements(driver, LoginPageFunctions.class);
    MyAccountPageFunctions myAccountPageFunctions = PageFactory.initElements(driver, MyAccountPageFunctions.class);
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

    @Then("I login using my account")
    public void i_login_using_my_account() throws InterruptedException {
        generalFunctions.click(homePageFunctions.signInButton);

        //Verify that user lands on login page
        generalFunctions.fluentWait(loginPageFunctions.emailTextBox);

        //Verify the login page title
        generalFunctions.verifyPageTitle(loginPageFunctions.loginPageTitle);

        //Enter Email and Password
        generalFunctions.enterText(loginPageFunctions.emailTextBox, loginPageFunctions.email);
        generalFunctions.enterText(loginPageFunctions.passwordTextBox, loginPageFunctions.password);

        //Click Submit credentials button
        generalFunctions.click(loginPageFunctions.submitLoginButton);

        //Verify that user lands on My Account page
        generalFunctions.fluentWait(myAccountPageFunctions.myAddressButton);
        generalFunctions.verifyPageTitle(myAccountPageFunctions.myAccountPageTitle);
    }
}