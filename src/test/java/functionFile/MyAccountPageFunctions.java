package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPageFunctions extends DriverBaseClass {

//########################## All the strings related to this page ##############################################################
    public String myAccountPageTitle = "My account - My Store";


//########################## All the elements related to this page ##############################################################
    @FindBy(how = How.XPATH, using = "//span[text()='My addresses']")
    public WebElement myAddressButton;

    @FindBy(how = How.XPATH, using = "//a[@title=\"View my shopping cart\"]")
    public WebElement viewCartButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"button_order_cart\"]/span[contains(text(),'Check out')]")
    public WebElement checkoutButtonOrderCart;
}
