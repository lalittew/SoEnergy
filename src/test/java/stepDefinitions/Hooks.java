package stepDefinitions;

import browserFactory.DriverBaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public static Scenario scenario;

    @Before
    public void beforeTest(Scenario scenario) {
        DriverBaseClass.startTest();
        Hooks.scenario = scenario;
    }

    @After
    public void afterTest() {
        DriverBaseClass.afterTest();
    }

    @AfterStep
    public static void takeScreenShotOnFailure(Scenario scenario){
        if(scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) DriverBaseClass.driver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(scrFile, new File("./ScreenShots/" + scenario.getName()+ "name.png"));
            } catch (IOException e) {
                System.out.print("Error while taking screenshot: " + e);
            }
        }
    }

}
