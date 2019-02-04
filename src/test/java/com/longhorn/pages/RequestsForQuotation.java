package com.longhorn.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestsForQuotation {

    public RequestsForQuotation() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@data-menu='518']")
    public WebElement titlePurchaseOrders;


    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement requestForQuote;

    @FindBy(xpath = "//td[@title='Total amount']")
    public WebElement PurchasesTab;

    @FindBy(xpath = "//table//tbody//tr")
    public WebElement totalAmount;

    @FindBy(xpath = "(//div[@class='btn-group']//ul)[2]//li)[1]")
    public WebElement export;

    public WebElement Quote(int num)
    {
        Driver.getDriver().findElement(By.xpath("//table//tbody//tr["+num+"]//td[1]")).click();
        return Driver.getDriver().findElement(By.xpath("//table//tbody//tr["+num+"]//td[7]"));

    }




}
