package com.longhorn.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Purchases")
    public WebElement purchaseMenu;
}
