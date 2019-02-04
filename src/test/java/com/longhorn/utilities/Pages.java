package com.longhorn.utilities;

import com.longhorn.pages.DemoWebsite;
import com.longhorn.pages.LoginPage;
import com.longhorn.pages.Purchases;
import com.longhorn.pages.RequestsForQuotation;

public class Pages {
    private LoginPage loginPage;
    private DemoWebsite demoWebsite;
    private BrowserUtils browserUtils;
    private Purchases purchases;

    public BrowserUtils browserUtils(){
        if(browserUtils==null){
            browserUtils=new BrowserUtils();
        }
        return browserUtils;
    }

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public DemoWebsite choseRightOne() {
        if (demoWebsite == null) {
            demoWebsite = new DemoWebsite();
        }
        return demoWebsite;
    }

    public Purchases purchases() {
        if (purchases == null) {
            purchases = new Purchases();
        }
        return purchases;
    }


}
