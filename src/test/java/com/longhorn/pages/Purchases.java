package com.longhorn.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchases {
    public Purchases() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement titlePurchasePage;


    @FindBy(xpath = "//a[@data-menu='519']")
    public WebElement titlePurchaseOrders;

    @FindBy(xpath = "//a[@data-menu='506']")
    public WebElement titleVendors;

    @FindBy(xpath = "//a[@data-menu='516']")
    public WebElement titleProducts;


    @FindBy(xpath = "//a[@data-menu='514']")
    public WebElement titleIncomingProducts;


    @FindBy(xpath = "//a[@data-menu='515']")
    public WebElement titleVendorBills;


    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement WrongCredentials;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement NameOfPerson;

    @FindBy(linkText = "Log out")
    public WebElement logOutButton;

    @FindBy(partialLinkText = "Purchases")
    public WebElement purchaseMenu;
}
