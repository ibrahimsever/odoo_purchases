package com.longhorn.tests.functional_tests.vendor;

import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.Driver;
import com.longhorn.utilities.TestBase;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FileImportTest extends TestBase {

    @Test
    public void FileImportNegativeTest() throws AWTException {
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        BrowserUtils.waitForClickablility(pages.leftMenu().linkVendors,10);
       // BrowserUtils.wait(10);
        BrowserUtils.waitForClickablility(pages.vendor().importButton_Vendor,10).click();
        //wait.until(ExpectedConditions.elementToBeClickable(element)
       // pages.vendor().importButton_Vendor.click();

      // WebElement loadfile= driver.findElement(By.id("my-file-selector"));
      // WebElement spacefile=driver.findElement(By.xpath("//div[@class='input-group']/input"));
        pages.vendor().loadFile.click();
        String path="/Users/Bayram/Downloads/test.txt";
       // String path = "/Users/Bayram/denemecvsfile.csv";
        Driver.getDriver().findElement(By.id("my-file-selector")).sendKeys(path);
        String message=Driver.getDriver().findElement(By.xpath("//div[@class='oe_import_report oe_import_report_error']")).getText();
        System.out.println(message);
        Assert.assertTrue(message.contains("Unsupported file format"));

    }
    @Test
    public void FileImportPositiveTest() throws AWTException {
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        BrowserUtils.waitForClickablility(pages.leftMenu().linkVendors,10);
        // BrowserUtils.wait(10);
        BrowserUtils.waitForClickablility(pages.vendor().importButton_Vendor,10).click();
        //wait.until(ExpectedConditions.elementToBeClickable(element)
        // pages.vendor().importButton_Vendor.click();

        // WebElement loadfile= driver.findElement(By.id("my-file-selector"));
        // WebElement spacefile=driver.findElement(By.xpath("//div[@class='input-group']/input"));
        pages.vendor().loadFile.click();
        //String path="/Users/Bayram/denemecvsfile.csv";
        // String path = "/Users/Bayram/Desktop/SAMPLEfile.xlsx";

        String path = "/Users/Bayram/Desktop/Testing Groups.xlsx";
        Driver.getDriver().findElement(By.id("my-file-selector")).sendKeys(path);

        WebElement message=Driver.getDriver().findElement(By.xpath("//div[@class='oe_import_with_file oe_padding col-sm-12']/h2"));
        //WebElement message=Driver.getDriver().findElement(By.linkText("Map your columns to import"));

        BrowserUtils.wait(10);
        String messageText=message.getText();
        System.out.println("message"+message);

    }
}
