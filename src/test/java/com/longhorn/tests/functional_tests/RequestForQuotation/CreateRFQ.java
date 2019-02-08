package com.longhorn.tests.functional_tests.RequestForQuotation;

import com.longhorn.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateRFQ extends TestBase {

//    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 7);
//    wait.until(ExpectedConditions.urlContains("login"));
    @Test(priority = 1)
    public void titleHeaderTestRFQ() throws InterruptedException {
        extentLogger = report.createTest("create request for qoutation Possive Test");
        extentLogger.info("Login to application");
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(9);
        extentLogger.info("Clikcing on purchase link");
        pages.topMenu().purchaseLink.click();

        BrowserUtils.wait(9);
        extentLogger.info("cliking create button");
        pages.requestsForQuotation().createRfQ.click();
        String actual=pages.requestsForQuotation().titleCreateRFQ.getText();
        System.out.println("actual create RFQ Title = " + actual);
        extentLogger.info("verigying title");
        Assert.assertEquals(actual, ApplicationConstants.TITLE_CREATE_RFQ);

        BrowserUtils.wait(9);
        extentLogger.info("clickin user account");
        pages.topMenu().nameOfUser.click();

        extentLogger.info("clicking on logout");
        BrowserUtils.wait(9);
        pages.topMenu().logOut.click();

        BrowserUtils.wait(9);
        Driver.closeDriver();
        extentLogger.pass("Passed: Title of creat new RFQ");
    }


    @Test(priority = 2)
    public void ceratingNewRFQNegativeTest(){
        extentLogger = report.createTest("create request for qoutation Negative Test");
        extentLogger.info("Login to application");
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(9);
        extentLogger.info("Clikcing on purchase link");
        pages.topMenu().purchaseLink.click();

        BrowserUtils.wait(9);
        extentLogger.info("cliking create button");
        pages.requestsForQuotation().createRfQ.click();
        BrowserUtils.wait(9);
        extentLogger.info("cliking save button");
        pages.requestsForQuotation().saveRfQ.click();

        extentLogger.info("verifiying alert POPUP saying -The following fields are invalid- ");


        Assert.assertTrue(Driver.getDriver().findElement(By.className("fa-exclamation")).isDisplayed());

        String text=Driver.getDriver().findElement(By.xpath("//div[@class='o_notification_manager']")).getAttribute("innerHTML");
        System.out.println(text);

        BrowserUtils.wait(9);
        extentLogger.info("clickin user account");
        pages.topMenu().nameOfUser.click();

        extentLogger.info("clicking on logout");
        BrowserUtils.wait(9);
        pages.topMenu().logOut.click();

        BrowserUtils.wait(9);
        Driver.closeDriver();
        extentLogger.pass("Passed: Negative test without entering any information");
    }
//    @Test(priority = 3)
//    public void ceratingNewRFQNPositiveTest(){
//        extentLogger = report.createTest("create request for qoutation Positive Test");
//        extentLogger.info("Login to application");
//        pages.loginPage().demoButton.click();
//        pages.loginPage().login(ConfigurationReader.getProperty("username"),
//                ConfigurationReader.getProperty("password"));
//        BrowserUtils.wait(9);
//        extentLogger.info("Clicking on purchase link");
//        pages.topMenu().purchaseLink.click();
//
//        BrowserUtils.wait(9);
//        extentLogger.info("clicking create button");
//        pages.requestsForQuotation().createRfQ.click();
//
//        pages.requestsForQuotation().selectVendor.click();
//        Random random=new Random();
//        int num=random.nextInt(10);
//        //pages.requestsForQuotation().selectVendor.click();
//        Select list=new Select(pages.requestsForQuotation().selectVendor);
//        list.selectByIndex(num);
//

//
//
//        BrowserUtils.wait(9);
//        extentLogger.info("clicking save button");
//        pages.requestsForQuotation().saveRfQ.click();
//
//        extentLogger.info("verifiying alert POPUP saying -The following fields are invalid- ");
//
//
//        Assert.assertTrue(Driver.getDriver().findElement(By.className("fa-exclamation")).isDisplayed());
//
//        String text=Driver.getDriver().findElement(By.xpath("//div[@class='o_notification_manager']")).getAttribute("innerHTML");
//        System.out.println(text);
//
//        BrowserUtils.wait(9);
//        extentLogger.info("clickin user account");
//        pages.topMenu().nameOfUser.click();
//
//        extentLogger.info("clicking on logout");
//        BrowserUtils.wait(9);
//        pages.topMenu().logOut.click();
//
//        BrowserUtils.wait(9);
//        Driver.closeDriver();
//        extentLogger.pass("Passed: Negative test without entering any information");
//    }



}
