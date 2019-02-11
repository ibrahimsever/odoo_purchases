package com.longhorn.tests.functional_tests.vendor;

import com.longhorn.pages.Vendor;
import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.Driver;
import com.longhorn.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class SendMessageTest extends TestBase {

    @Test
    public void SendMessage() {

        extentLogger = report.createTest("Send Message test");
        extentLogger.info("Login to application");
        extentLogger.info("clicking on demo link");
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
        List<String> allVendors=BrowserUtils.getElementsText(pages.vendor().vendorNameListElements);
        BrowserUtils.wait(2);
        //String lastVendor=allVendors.get(allVendors.size()-1);
        //I need to add one because the first one name is also in the list
        String xpathOfLastCreatedVendor=xpathOfLastCreatedVendor="((//div[@class='oe_kanban_details']//strong)/span)"+"["+(allVendors.indexOf("EnSon Vendor")+1)+"]";
            // System.out.println(xpathOfLastCreatedVendor);
        Driver.getDriver().findElement(By.xpath(xpathOfLastCreatedVendor)).click();
        BrowserUtils.wait(10);
        Driver.getDriver().findElement(By.xpath("//button[@title='Send a message']")).click();
        String sentMessage="Text Message SENT";
        Driver.getDriver().findElement(By.xpath("//textarea[@class='o_input o_composer_text_field']")).sendKeys(sentMessage);
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")).click();
         String displayedMessage=Driver.getDriver().findElement(By.className("o_thread_message_content")).getText();
           // driver.findElement(By.className("o_thread_message_content")).isDisplayed();
          Assert.assertEquals(sentMessage,displayedMessage);

    }
}
