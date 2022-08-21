package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFunctions extends DriverBaseClass {

//########################## All the strings related to this page ##############################################################
    public String homePageTitle = "My Store";

//########################## All the elements related to this page ##############################################################
    @FindBy(how = How.XPATH, using = "//img[@alt='My Store']")
    public WebElement yourLogoExperience;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a[@title='Dresses']")
    public WebElement dressesTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a[@title='Summer Dresses']")
    public WebElement summerDressesTab;

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    public WebElement signInButton;
}
