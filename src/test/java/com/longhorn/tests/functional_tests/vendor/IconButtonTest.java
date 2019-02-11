package com.longhorn.tests.functional_tests.vendor;

import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IconButtonTest extends TestBase {

    @Test
    public void ListIcon(){
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        BrowserUtils.wait(10);
        pages.leftMenu().linkVendors.click();

        BrowserUtils.wait(10);
        System.out.println(pages.vendor().listIcon_Vendor.isDisplayed() );
        System.out.println(pages.vendor().listIcon_Vendor.isEnabled() );
        if (pages.vendor().listIcon_Vendor.isDisplayed() && pages.vendor().listIcon_Vendor.isEnabled()) {
           System.out.println("Icon Button Is Clickable");
            //extentLogger.info("Icon Button Is Clickable");
        }

//        BrowserUtils.wait(10);
//        pages.vendor().nameVandor.sendKeys("FirstAutomationTrial Vendor");
//        BrowserUtils.wait(10);
//        pages.vendor().create1.click();
//        BrowserUtils.wait(10);
//        pages.vendor().nameContact.sendKeys("FirstAutomationTrial Company");
//        BrowserUtils.wait(10);
//        pages.vendor().saveAndClose.click();
//        BrowserUtils.wait(10);
//        pages.vendor().save.click();
//        BrowserUtils.wait(10);
//        System.out.println(pages.vendor().vendorCreatedMessage.getText());
//        BrowserUtils.wait(10);
//        Assert.assertTrue(pages.vendor().vendorCreatedMessage.isDisplayed());

    }


}
