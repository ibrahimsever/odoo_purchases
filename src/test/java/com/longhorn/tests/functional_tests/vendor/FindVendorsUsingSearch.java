package com.longhorn.tests.functional_tests.vendor;

import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FindVendorsUsingSearch extends TestBase {

    //Manager should be able to  find name using search tab.
    @Test
    public void FindVendorUsingSearch(){
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(5);
        pages.topMenu().purchaseLink.click();
        BrowserUtils.wait(10);
        pages.leftMenu().linkVendors.click();
        BrowserUtils.wait(10);
//        pages.vendor().searchTab_Vendor.click();
//        BrowserUtils.wait(10);
        pages.vendor().searchTab_Vendor.sendKeys(" FirstAutomationTrial");//Space in the beginning required
        BrowserUtils.wait(10);
        pages.vendor().searchTab_Vendor.sendKeys(Keys.ENTER);
        BrowserUtils.wait(10);

        ////  Below gave me what all the vendors not only the seached onces
     //   String bodyText = driver.findElement(By.tagName("body")).getText();
      ////  Below gave me what all the vendors not only the seached onces
       // String bodyText = driver.findElement(By.xpath("//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']")).getText();
        String bodyText=pages.vendor().listOfAllVendors.getText();//This gave me only what shows up after search
        System.out.println(bodyText);
        BrowserUtils.wait(10);
        Assert.assertTrue(bodyText.contains("FirstAutomationTrial"));

    }

}
