package com.longhorn.utilities;

import com.longhorn.pages.*;

public class Pages {
    private HomeLoginPage homeLoginPage;
    private TopMenu topMenu;
    private LeftMenu leftMenu;
    private RequestsForQuotation requestsForQuotation;
    private PurchaseOrder purchaseOrder;


    public HomeLoginPage loginPage() {
        if (homeLoginPage == null) {
            homeLoginPage = new HomeLoginPage();
        }
        return homeLoginPage;
    }


    public TopMenu topMenu() {
        if (topMenu == null) {
            topMenu = new TopMenu();
        }
        return topMenu;
    }

    public LeftMenu leftMenu() {
        if (leftMenu == null) {
            leftMenu = new LeftMenu();
        }
        return leftMenu;
    }

    public RequestsForQuotation requestsForQuotation() {
        if (requestsForQuotation == null) {
            requestsForQuotation = new RequestsForQuotation();
        }
        return requestsForQuotation;
    }

    public PurchaseOrder purchaseOrder(){
        if (purchaseOrder == null) {
            purchaseOrder = new PurchaseOrder();
        }
        return purchaseOrder;
    }


}
