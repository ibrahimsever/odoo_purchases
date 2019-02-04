package com.longhorn.tests.smoke_tests;

import com.longhorn.utilities.ApplicationConstants;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.Driver;
import com.longhorn.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PageHeaderTest extends TestBase {
    @Test
    public void ApplicationTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Application Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        extentLogger.info("Verifying page title of the Application");
        assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_OF_APPLICATION);

        // log the pass
        extentLogger.pass("Pass : Page headers test");

    }
    @Test
    public void RequestsForQuotationTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Requests for Quotation Title Test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        extentLogger.info("Verifying page title on Requests for Quotation");
        assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_PURCHASE);

        // log the pass
        extentLogger.pass("Pass : Requests for Quotation Title Test");

    }

    @Test
    public void PurchaseOrderTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Purchase Orders Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        pages.purchases().titlePurchaseOrders.click();
        extentLogger.info("Verifying page title on Purchase Order");
        Thread.sleep(6000);
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_PURCHASE_ORDER );
        // log the pass
        extentLogger.pass("Pass : Page headers for Purchase Orders Title test");

    }

    @Test
    public void VendorTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Vendor Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        pages.purchases().titleVendors.click();
        extentLogger.info("Verifying page title on Vendor Title page");
        Thread.sleep(6000);
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_VENDOR );
        // log the pass
        extentLogger.pass("Pass : Page headers for Ventor Title test");

    }

    @Test
    public void ProductTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Product Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        pages.purchases().titleProducts.click();
        extentLogger.info("Verifying page title on Product Title");
        Thread.sleep(7000);
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_PRODUCT );
        // log the pass
        extentLogger.pass("Pass : Page headers for Product Title test");

    }

    @Test
    public void IncomingProductTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Incoming Product Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        pages.purchases().titleIncomingProducts.click();
        extentLogger.info("Verifying page title on Incoming Product page");
        Thread.sleep(7000);
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_INCOMING_PRODUCT );
        // log the pass
        extentLogger.pass("Pass : Page headers for Incoming Product Title test");

    }


    @Test
    public void VendorBillTitleTest() throws InterruptedException {
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Vendor Title test");
        // use logger to log the steps
        extentLogger.info("Login to application");
        pages.choseRightOne().rightButton.click();
        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        Thread.sleep(6000);
        pages.purchases().purchaseMenu.click();
        Thread.sleep(6000);
        pages.purchases().titleVendorBills.click();
        extentLogger.info("Verifying page title on Ventor Bill");
        Thread.sleep(7000);
        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.TITLE_VENDOR_BILLS );
        // log the pass
        extentLogger.pass("Pass : Page headers for Ventor Title test");

    }
}
