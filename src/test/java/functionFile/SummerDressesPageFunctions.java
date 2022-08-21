package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPageFunctions extends DriverBaseClass {
    GeneralFunctions generalFunctions= PageFactory.initElements(driver,GeneralFunctions.class);

//########################## All the strings related to this page ##############################################################
    public String summerDressesPageTitle = "Summer Dresses - My Store";


//########################## All the elements related to this page ##############################################################
    @FindBy(how = How.XPATH, using = "//a[@title='Grid']")
    public WebElement gridView;

    @FindBy(how = How.XPATH, using = "//li[@id='grid' and @class='selected']")
    public WebElement gridViewSelected;

    @FindBy(how = How.XPATH, using = "//a[@title='List']")
    public WebElement listView;

    @FindBy(how = How.XPATH, using = "//li[@id='list' and @class='selected']")
    public WebElement listViewSelected;

    @FindBy(how = How.XPATH, using = "//a[@data-id-product='5']/span[text()='Add to cart']")
    public WebElement addToCartButtonListFirstProduct;

    @FindBy(how = How.XPATH, using = "//span[@class='ajax_cart_product_txt ' and contains(text(),'There is 1 item in your cart.')]")
    public WebElement itemInCart;

    @FindBy(how = How.XPATH, using = "//h2[contains(text()[2], 'Product successfully added to your shopping cart')]")
    public WebElement productAddedSuccessfullyMessage;

    @FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']/span[contains(text(), 'Proceed to checkout')]")
    public WebElement proceedToCheckoutButtonStatusWindow;

    @FindBy(how = How.XPATH, using = "//a[@class='button btn btn-default standard-checkout button-medium']/span[contains(text(), 'Proceed to checkout')]")
    public WebElement proceedToCheckoutButtonSummaryPage;
}
