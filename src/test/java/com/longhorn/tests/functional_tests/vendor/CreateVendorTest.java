package com.longhorn.tests.functional_tests.vendor;

import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateVendorTest extends TestBase {

    @Test
    public void CreateVendor(){
        extentLogger = report.createTest("Send Message test");
        extentLogger.info("Login to application");
        extentLogger.info("clicking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(10);
        extentLogger.info("click on purchase link");
        pages.topMenu().purchaseLink.click();
        BrowserUtils.wait(10);
        extentLogger.info("clicking vender on left menu");
        pages.leftMenu().linkVendors.click();
        BrowserUtils.wait(10);
        pages.vendor().createButton_Vendor.click();
        BrowserUtils.wait(10);
        pages.vendor().nameVandor.sendKeys(ConfigurationReader.getProperty("lastvendor"));
        BrowserUtils.wait(10);
        pages.vendor().create1.click();
        BrowserUtils.wait(10);
        pages.vendor().nameContact.sendKeys(ConfigurationReader.getProperty("lastvendor"));
        BrowserUtils.wait(10);
        pages.vendor().saveAndClose.click();
        BrowserUtils.wait(10);
        pages.vendor().save.click();
        BrowserUtils.wait(10);
        System.out.println(pages.vendor().vendorCreatedMessage.getText());
        BrowserUtils.wait(10);
        Assert.assertTrue(pages.vendor().vendorCreatedMessage.isDisplayed());

    }

}
