package stepDefinitions;

import browserFactory.DriverBaseClass;
import functionFile.GeneralFunctions;
import functionFile.HomePageFunctions;
import functionFile.LoginPageFunctions;
import functionFile.SummerDressesPageFunctions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageStepDefinition extends DriverBaseClass {

    WebDriver driver = DriverBaseClass.startBrowser();
    HomePageFunctions homePageFunctions = PageFactory.initElements(driver, HomePageFunctions.class);
    SummerDressesPageFunctions summerDressesPageFunctions = PageFactory.initElements(driver, SummerDressesPageFunctions.class);
    LoginPageFunctions loginPageFunctions = PageFactory.initElements(driver, LoginPageFunctions.class);
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

    @Given("I am on home page for the test page")
    public void i_am_on_home_page_for_the_test_page() {
        //Added fluent wait for the page to load
        generalFunctions.fluentWait(homePageFunctions.yourLogoExperience);

        //Verify page title
        generalFunctions.verifyPageTitle(homePageFunctions.homePageTitle);
    }

    @Given("I hover Dresses tab and click SummerDresses")
    public void i_hover_Dresses_tab_and_click_SummerDresses() throws InterruptedException {
        generalFunctions.hoverMouseAndClickAction(homePageFunctions.dressesTab, homePageFunctions.summerDressesTab);

        //Verify that user is in Summer Dresses page
        generalFunctions.verifyPageTitle(summerDressesPageFunctions.summerDressesPageTitle);
        generalFunctions.fluentWait(summerDressesPageFunctions.gridView);

        //Verify that by default grid view is selected
        generalFunctions.checkElementPresent(summerDressesPageFunctions.gridViewSelected);
    }
}