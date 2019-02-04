package com.longhorn.tests.smoke_tests;

import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @Test()
    public void positiveLoginTest() throws InterruptedException {

        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        pages.purchases().NameOfPerson.click();
        pages.purchases().logOutButton.click();
        Assert.assertEquals(pages.choseRightOne().rightButton.getText(),"Log in");
        extentLogger.pass("Passed: Log out verified");

    }
}
