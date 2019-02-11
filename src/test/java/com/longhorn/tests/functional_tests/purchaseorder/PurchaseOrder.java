package com.longhorn.tests.functional_tests.purchaseorder;

import com.google.common.collect.Ordering;
import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.Driver;
import com.longhorn.utilities.TestBase;
import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

public class PurchaseOrder extends TestBase {

    @Test(priority = 1)
    public void purchaseOrderHeader(){

        extentLogger = report.createTest("Purchase order title test");
        extentLogger.info("Clicking on demo button");
        pages.loginPage().demoButton.click();

        extentLogger.info("Entering valid username and password");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


        BrowserUtils.wait(5);
        extentLogger.info("Clicking on purchase link");
        pages.topMenu().purchaseLink.click();

        BrowserUtils.wait(5);
        extentLogger.info("Clicking on purchase order link");
        pages.leftMenu().linkPurchaseOrders.click();

        BrowserUtils.wait(5);
        String actual = pages.purchaseOrder().headerPurchaseOrder.getText();

        extentLogger.info("Verify purchase order page header");
        Assert.assertEquals(actual,"Purchase Orders");
        Driver.closeDriver();
        extentLogger.pass("Pass: Purchase order page header verified");
    }

//    @Test(priority = 2)
//    public void purchaseOrderDate(){
//
//        extentLogger = report.createTest("Purchase order title test");
//        extentLogger.info("Clicking on demo button");
//        pages.loginPage().demoButton.click();
//
//        extentLogger.info("Entering valid username and password");
//        pages.loginPage().login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
//
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase link");
//        pages.topMenu().purchaseLink.click();
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase order link");
//        pages.leftMenu().linkPurchaseOrders.click();
//
//
//
//        //Driver.getDriver().findElement(By.id("datepicker")).click();
//        BrowserUtils.wait(15);
//        List<WebElement> allDatesVendor=Driver.getDriver().findElements(By.xpath("//table//tr/td[3]"));
//        ArrayList<String> liktext=new ArrayList<>();
//int i=0;
//        for (WebElement each:allDatesVendor
//             ) {
//            liktext.add(each.getText());
//            i++;
//        }
//
//Array[]dene=new Array[allDatesVendor.size()];
//
//        ArrayList<String >month=new ArrayList<>();
//        ArrayList<String >day=new ArrayList<>();
//        ArrayList<String >year=new ArrayList<>();
//int x=0;
//        Iterator iterator=liktext.iterator();
//        while(iterator.hasNext())
//        {
//            dene[0]=iterator.next();
//            System.out.println("each = " + month);
//
//        }
//        System.out.println(month);
//
//
//        for (String each:month) {
//
//            System.out.println("ilk iki"+ each);
//
//        }
//
//           boolean sortedMonth = Ordering.natural().isOrdered(month);
//           boolean sortedday = Ordering.natural().isOrdered(day);
//           boolean sortedYear = Ordering.natural().isOrdered(year);
//           boolean sortedaAllDate = false;
//
//
//           if(sortedYear==true && sortedMonth==true && sortedday==true ){
//
//                sortedaAllDate = true;
//           }
//
//            Assert.assertTrue(sortedaAllDate);
//
//
////        Driver.closeDriver();
////        extentLogger.pass("Pass: Purchase order page header verified");
//    }
//
//    @Test(priority = 3)
//    public void purchaseOrderName(){
//
//        extentLogger = report.createTest("Purchase order title test");
//        extentLogger.info("Clicking on demo button");
//        pages.loginPage().demoButton.click();
//
//        extentLogger.info("Entering valid username and password");
//        pages.loginPage().login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
//
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase link");
//        pages.topMenu().purchaseLink.click();
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase order link");
//        pages.leftMenu().linkPurchaseOrders.click();
//
//        BrowserUtils.wait(5);
//        String actual = pages.purchaseOrder().headerPurchaseOrder.getText();
//
//
//
//
//        Driver.closeDriver();
//        extentLogger.pass("Pass: Purchase order page header verified");
//    }
//
//    @Test(priority = 4)
//    public void purchaseOrderSave(){
//
//        extentLogger = report.createTest("Purchase order title test");
//        extentLogger.info("Clicking on demo button");
//        pages.loginPage().demoButton.click();
//
//        extentLogger.info("Entering valid username and password");
//        pages.loginPage().login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
//
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase link");
//        pages.topMenu().purchaseLink.click();
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase order link");
//        pages.leftMenu().linkPurchaseOrders.click();
//
//        BrowserUtils.wait(5);
//        String actual = pages.purchaseOrder().headerPurchaseOrder.getText();
//
//
//
//
//        Driver.closeDriver();
//        extentLogger.pass("Pass: Purchase order page header verified");
//    }
//
//    @Test(priority = 5)
//    public void purchaseOrderNam(){
//
//        extentLogger = report.createTest("Purchase order title test");
//        extentLogger.info("Clicking on demo button");
//        pages.loginPage().demoButton.click();
//
//        extentLogger.info("Entering valid username and password");
//        pages.loginPage().login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
//
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase link");
//        pages.topMenu().purchaseLink.click();
//
//        BrowserUtils.wait(5);
//        extentLogger.info("Clicking on purchase order link");
//        pages.leftMenu().linkPurchaseOrders.click();
//
//        BrowserUtils.wait(5);
//        String actual = pages.purchaseOrder().headerPurchaseOrder.getText();
//
//
//
//
//        Driver.closeDriver();
//        extentLogger.pass("Pass: Purchase order page header verified");
//    }
}
