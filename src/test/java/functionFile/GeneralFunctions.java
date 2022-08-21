package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import java.time.Duration;

public class GeneralFunctions extends DriverBaseClass {

    public void click(WebElement element){
        element.click();
    }

    public void verifyPageTitle(String expectedPageTitle){
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Actual page title is different from expected");
    }

    public void enterText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    public void checkBoxSelected(WebElement element){
        Assert.assertTrue(element.isSelected(), "Element you are checking is not selected");
    }

    public void checkBoxNotSelected(WebElement element){
        Assert.assertFalse(element.isSelected(), "Element you are checking is selected");
    }

    public void checkElementPresent(WebElement element){
        Assert.assertTrue(element.isDisplayed());
    }

    public void checkElementText(WebElement element, String expectedText){
        String actualText = element.getText();
        Assert.assertEquals(actualText , expectedText , "Actual text is different from expected text");
    }

    public void fluentWait(WebElement element){
        FluentWait wait = new FluentWait(driver);
        //Specify the timeout of the wait
        wait.withTimeout(Duration.ofSeconds(20));
        //Specify polling time
        wait.pollingEvery(Duration.ofSeconds(2));
        //Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);

        //Wait untill condition is satisfied
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void hoverMouseAndClickAction(WebElement element, WebElement elementSubMenu) throws InterruptedException {
        Actions actions = new Actions(driver);

        //Hover the element
        actions.moveToElement(element).perform();

        fluentWait(elementSubMenu);
        //Move the focus to sub menu
        actions.moveToElement(elementSubMenu);

        //Click the submenu item
        actions.click().build().perform();
    }
}
