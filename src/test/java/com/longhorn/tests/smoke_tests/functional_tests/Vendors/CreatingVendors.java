package com.longhorn.tests.smoke_tests.functional_tests.Vendors;

import com.longhorn.utilities.BrowserUtils;
import com.longhorn.utilities.ConfigurationReader;
import com.longhorn.utilities.TestBase;
import org.testng.annotations.Test;

public class CreatingVendors extends TestBase {
    @Test
    public void CreateVendor(){
        pages.loginPage().demoButton.click();
        pages.loginPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(10);
        pages.topMenu().purchaseLink.click();
        BrowserUtils.wait(10);
        pages.leftMenu().linkVendors.click();
        BrowserUtils.wait(10);
        pages.vendor().createButton_Vendor.click();
        BrowserUtils.wait(10);
        pages.vendor().nameVandor.sendKeys("sendKeys(\"FirstAutomationTrial\")");
        BrowserUtils.wait(10);
        pages.vendor().create1.click();
        BrowserUtils.wait(10);
        pages.vendor().nameContact.sendKeys("FirstAutomationTrial");
        BrowserUtils.wait(10);
        pages.vendor().saveAndClose.click();


    }

}
