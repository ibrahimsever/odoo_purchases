package com.longhorn.pages;

import com.longhorn.utilities.ApplicationConstants;
import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebsite {

    public DemoWebsite()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement rightButton;

}
