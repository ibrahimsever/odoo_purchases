

package com.longhorn.tests.smoke_tests;

import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @Test()
    public void positiveLogOutTest() throws InterruptedException {
        extentLogger = report.createTest("Login the application");

        extentLogger.info("Clicking on the login page");
        pages.loginPage().demoButton.click();

        extentLogger.info("Entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        pages.topMenu().nameOfUser.click();

        extentLogger.info("Clicking on logout button");
        pages.topMenu().logOut.click();

       String actual= pages.loginPage().submitAgain.getText();
        System.out.println(actual);

        extentLogger.info("verifiying log out succesfully");
        Assert.assertEquals(actual,"Log in");
        extentLogger.pass("Passed: Log out verified");

    }
}
