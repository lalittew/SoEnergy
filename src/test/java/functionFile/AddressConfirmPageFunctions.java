package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressConfirmPageFunctions extends DriverBaseClass {

//########################## All the elmements related to Address, payment, shipping ##############################################################
    @FindBy(how = How.XPATH, using = "//h1[@class='page-heading' and text()='Addresses']")
    public WebElement addressPageHeading;

    @FindBy(how = How.XPATH, using = "//li[@class='step_current third']/span[contains(text(), 'Address')]")
    public WebElement progressBarAtAddressTab;

    @FindBy(how = How.XPATH, using = "//button/span[contains(text(), 'Proceed to checkout')]")
    public WebElement addressPageCheckoutButton ;

    @FindBy(how = How.XPATH, using = "//h1[@class='page-heading' and text()='Shipping']")
    public WebElement shippingPageHeading;

    @FindBy(how = How.XPATH, using = "//li[@class='step_current four']/span[contains(text(), 'Shipping')]")
    public WebElement progressBarAtShippingTab;

    @FindBy(how = How.XPATH, using = "//input[@id='cgv']")
    public WebElement termsCheckBox;

    @FindBy(how = How.XPATH, using = "//h1[@class='page-heading' and text()='Please choose your payment method']")
    public WebElement paymentPageHeading ;

    @FindBy(how = How.XPATH, using = "//li[@class='step_current last']/span[contains(text(), ' Payment')]")
    public WebElement progressBarAtPaymentTab;

    @FindBy(how = How.XPATH, using = "//p[@class='product-name']")
    public WebElement productNamePaymentPage;

    @FindBy(how = How.XPATH, using = "//span[@id='total_product_price_5_19_736807']")
    public WebElement productTotalPrice;

//########################## All the functions related to this page ##############################################################
    public void printProductName(){
        String productName = productNamePaymentPage.getText();
        System.out.println("The name of product is: " + productName);
    }

    public void printProductTotalPrice(){
        String productPriceTotal = productTotalPrice.getText();
        System.out.println("The total price of product is: " + productPriceTotal);
    }
}
