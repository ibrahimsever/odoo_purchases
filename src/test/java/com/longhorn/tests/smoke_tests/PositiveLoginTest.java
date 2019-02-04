package com.longhorn.tests.smoke_tests;

import com.longhorn.utilities.ApplicationConstants;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.Driver;
import com.longhorn.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveLoginTest extends TestBase {
    @Test()
    public void positiveLoginTest() throws InterruptedException {

        extentLogger = report.createTest("Positive login test");
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
//        pages.login().loginButton.click();
        Thread.sleep(5000);
        assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_OF_APPLICATION);
        extentLogger.pass("Passed: Right Credentials");

    }
}
