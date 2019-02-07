package com.longhorn.tests.smoke_tests;

import com.longhorn.utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PageHeaderTest extends TestBase {

    @Test
    public void ApplicationTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Application Title test");

        extentLogger.info("Login to application");
        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        BrowserUtils.wait(8);
        extentLogger.info("Verifying page title of the Application");
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_OF_APPLICATION);
        Thread.sleep(10000);
        pages.topMenu().nameOfUser.click();

        pages.topMenu().logOut.click();
        Driver.closeDriver();

        extentLogger.pass("Pass : Page headers test");


    }


    @Test
    public void RequestsForQuotationTitleTest() throws InterruptedException {

        extentLogger = report.createTest("Requests for Quotation Title Test");

        extentLogger.info("Login to application");

        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

       extentLogger.info("click on purchase link");
        Thread.sleep(6000);
        pages.topMenu().purchaseLink.click();
//        extentLogger.info("click on request for qoutation on left menu");
//        pages.leftMenu().linkRequestForQoutation.click();

        extentLogger.info("Verifying page title on Requests for Quotation");
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        System.out.println(actual);
        assertEquals(actual, ApplicationConstants.TITLE_PURCHASE);
        BrowserUtils.wait(8);
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();

        Driver.closeDriver();


        extentLogger.pass("Pass : Requests for Quotation Title Test");



    }

    @Test
    public void PurchaseOrderTitleTest() throws InterruptedException {

        extentLogger = report.createTest("Purchase Orders Title test");

        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        extentLogger.info("click on purchase link");
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        extentLogger.info("clicking purchase orders on left menu");

        pages.leftMenu().linkPurchaseOrders.click();
        extentLogger.info("Verifying page title on Purchase Order");
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        BrowserUtils.wait(10);
        assertEquals(actual, ApplicationConstants.TITLE_PURCHASE_ORDER );
        BrowserUtils.wait(10);
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();
         Driver.closeDriver();

        extentLogger.pass("Pass : Page headers for Purchase Orders Title test");

    }

    @Test
    public void VendorTitleTest() throws InterruptedException {

        extentLogger = report.createTest("Vendor Title test");

        extentLogger.info("Login to application");
        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        extentLogger.info("click on purchase link");
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        extentLogger.info("clicking vender on left menu");
        BrowserUtils.wait(10);
        pages.leftMenu().linkVendors.click();
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        BrowserUtils.wait(10);
        assertEquals(actual, ApplicationConstants.TITLE_VENDOR );
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();
        Driver.closeDriver();
        BrowserUtils.wait(10);
        extentLogger.pass("Pass : Page headers for Ventor Title test");

    }

    @Test
    public void ProductTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Product Title test");
        extentLogger.info("Login to application");
        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        extentLogger.info("click on purchase link");
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        extentLogger.info("clicking product on left menu");
        BrowserUtils.wait(10);
        pages.leftMenu().linkProducts.click();
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        System.out.println(actual);
        BrowserUtils.wait(10);
        assertEquals(actual, ApplicationConstants.TITLE_PRODUCT );
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();
        Driver.closeDriver();
        extentLogger.pass("Pass : Page headers for Product Title test");

    }

    @Test
    public void IncomingProductTitleTest() throws InterruptedException {

        extentLogger = report.createTest("Incoming Product Title test");
        extentLogger.info("Login to application");
        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        extentLogger.info("click on purchase link");
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        extentLogger.info("clicking incoming product on left menu");
        BrowserUtils.wait(10);
        pages.leftMenu().linkIncomingProducts.click();
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        System.out.println(actual);
        BrowserUtils.wait(10);
        assertEquals(actual, ApplicationConstants.TITLE_INCOMING_PRODUCT );
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();
        Driver.closeDriver();
        extentLogger.pass("Pass : Page headers for Incoming Product Title test");

    }


    @Test
    public void VendorBillTitleTest() throws InterruptedException {

        extentLogger = report.createTest("Vendor Title test");
        extentLogger.info("Login to application");
        extentLogger.info("cliking on demo link");
        pages.loginPage().demoButton.click();
        extentLogger.info("entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));

        extentLogger.info("click on purchase link");
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        extentLogger.info("clicking vendor bill on left menu");
        BrowserUtils.wait(10);
        pages.leftMenu().linkVendorBills.click();
        BrowserUtils.wait(10);
        String actual=Driver.getDriver().getTitle();
        assertEquals(actual, ApplicationConstants.TITLE_VENDOR_BILLS );
        pages.topMenu().nameOfUser.click();
        pages.topMenu().logOut.click();
        Driver.closeDriver();
        extentLogger.pass("Pass : Page headers for Ventor Title test");

    }


}
