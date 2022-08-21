package stepDefinitions;

import browserFactory.DriverBaseClass;
import functionFile.CheckOutPageFunctions;
import functionFile.GeneralFunctions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPageStepDefinition extends DriverBaseClass {

    CheckOutPageFunctions checkOutPageFunctions = PageFactory.initElements(driver, CheckOutPageFunctions.class);
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

    @Then("Increase the quantity to two dresses")
    public void increase_the_quantity_to_two_dresses() throws InterruptedException {
        generalFunctions.click(checkOutPageFunctions.plusIconToAddQuantity);


       // Explicit wait for the product quantity to be updated
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(checkOutPageFunctions.summaryProductQuantity, checkOutPageFunctions.twoProductInCart));

        //Verify that quantity of product in cart
        generalFunctions.checkElementText(checkOutPageFunctions.summaryProductQuantity, checkOutPageFunctions.twoProductInCart);
    }

}