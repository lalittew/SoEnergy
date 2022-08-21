package stepDefinitions;

import browserFactory.DriverBaseClass;
import functionFile.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPageStepDefinition extends DriverBaseClass {


    HomePageFunctions homePageFunctions = PageFactory.initElements(driver, HomePageFunctions.class);
    SummerDressesPageFunctions summerDressesPageFunctions = PageFactory.initElements(driver, SummerDressesPageFunctions.class);
    CheckOutPageFunctions checkOutPageFunctions = PageFactory.initElements(driver, CheckOutPageFunctions.class);
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

    @Given("I change the view of the products to List view")
    public void i_change_the_view_of_the_products_to_List_view() {
        generalFunctions.click(summerDressesPageFunctions.listView);

        //wait and verify that list view is selected
        generalFunctions.fluentWait(summerDressesPageFunctions.listViewSelected);
    }

    @Given("I add the product to the cart")
    public void i_add_the_product_to_the_cart() throws InterruptedException {
        generalFunctions.click(summerDressesPageFunctions.addToCartButtonListFirstProduct);
        generalFunctions.fluentWait(summerDressesPageFunctions.itemInCart);

        //Verify that item is added to cart
        generalFunctions.checkElementPresent(summerDressesPageFunctions.productAddedSuccessfullyMessage);
        generalFunctions.checkElementPresent(summerDressesPageFunctions.itemInCart);
    }

    @Then("I proceed to checkout")
    public void i_proceed_to_checkout() {
        generalFunctions.click(summerDressesPageFunctions.proceedToCheckoutButtonStatusWindow);

        generalFunctions.fluentWait(checkOutPageFunctions.summaryTitle);
        generalFunctions.verifyPageTitle(checkOutPageFunctions.checkOutPageTitle);

        //Verify that quantity of product in cart
        generalFunctions.checkElementText(checkOutPageFunctions.summaryProductQuantity, checkOutPageFunctions.oneProductInCart);
    }
}