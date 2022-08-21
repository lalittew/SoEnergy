package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageFunctions extends DriverBaseClass {

//########################## All the string related to this page ##############################################################
    public String checkOutPageTitle = "Order - My Store";
    public String oneProductInCart = "1 Product";
    public String twoProductInCart = "2 Products";

//########################## All the elements related to this page ##############################################################
    @FindBy(how = How.XPATH, using = "//h1[@id='cart_title' and contains(text(),\"Shopping-cart summary\")]")
    public WebElement summaryTitle;

    @FindBy(how = How.ID, using = "summary_products_quantity")
    public WebElement summaryProductQuantity;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-plus']")
    public WebElement plusIconToAddQuantity;

    @FindBy(how = How.LINK_TEXT, using = "2 Products")
    public WebElement plusIconToAddQuantity1;
}
