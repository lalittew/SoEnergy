package stepDefinitions;

import browserFactory.DriverBaseClass;
import functionFile.*;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPageStepDefinition extends DriverBaseClass {

    HomePageFunctions homePageFunctions = PageFactory.initElements(driver, HomePageFunctions.class);
    SummerDressesPageFunctions summerDressesPageFunctions = PageFactory.initElements(driver, SummerDressesPageFunctions.class);
    LoginPageFunctions loginPageFunctions = PageFactory.initElements(driver, LoginPageFunctions.class);
    MyAccountPageFunctions myAccountPageFunctions = PageFactory.initElements(driver, MyAccountPageFunctions.class);
    AddressConfirmPageFunctions addressConfirmPageFunctions = PageFactory.initElements(driver, AddressConfirmPageFunctions.class);
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

    @Then("Confirm address and confirm shipping")
    public void confirm_address_and_confirm_shipping() throws InterruptedException {
        generalFunctions.hoverMouseAndClickAction(myAccountPageFunctions.viewCartButton, myAccountPageFunctions.checkoutButtonOrderCart);

        //Wait and click proceed to check out button on Summary page
        generalFunctions.fluentWait(summerDressesPageFunctions.proceedToCheckoutButtonSummaryPage);
        generalFunctions.click(summerDressesPageFunctions.proceedToCheckoutButtonSummaryPage);

        //Verify that user is on Address page
        generalFunctions.fluentWait(addressConfirmPageFunctions.addressPageHeading);
        generalFunctions.checkElementPresent(addressConfirmPageFunctions.progressBarAtAddressTab);

        //Click on proceed to check out button on address confirmation page
        generalFunctions.click(addressConfirmPageFunctions.addressPageCheckoutButton);

        //Verify that user is on Shipping page
        generalFunctions.fluentWait(addressConfirmPageFunctions.shippingPageHeading);
        generalFunctions.checkElementPresent(addressConfirmPageFunctions.progressBarAtShippingTab);

        //verify that check box for terms is not checked
        generalFunctions.checkBoxNotSelected(addressConfirmPageFunctions.termsCheckBox);

        //Select the terms check box
        generalFunctions.click(addressConfirmPageFunctions.termsCheckBox);

        //Verify that check box is selected
        generalFunctions.checkBoxSelected(addressConfirmPageFunctions.termsCheckBox);

        //Click on Proceed to check out button on shipping page
        generalFunctions.click(addressConfirmPageFunctions.addressPageCheckoutButton);

        //Verify that user lands on payment page
        generalFunctions.fluentWait(addressConfirmPageFunctions.paymentPageHeading);
        generalFunctions.checkElementPresent(addressConfirmPageFunctions.progressBarAtPaymentTab);

    }

    @Then("I print name of product and the price")
    public void i_print_name_of_product_and_the_price() {
        addressConfirmPageFunctions.printProductName();
        addressConfirmPageFunctions.printProductTotalPrice();
    }
}