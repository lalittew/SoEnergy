package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFunctions extends DriverBaseClass {

//########################## All the strings related to this page ##############################################################
    public String loginPageTitle = "Login - My Store";
    public String email = "lalittew@gmail.com";
    public String password = "Password";

//########################## All the elements related to this page ##############################################################
    @FindBy(how = How.ID, using = "email")
    public WebElement emailTextBox;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement passwordTextBox;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement submitLoginButton;
}
