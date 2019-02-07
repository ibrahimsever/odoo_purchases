package com.longhorn.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PurchaseOrder {

    public PurchaseOrder (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
