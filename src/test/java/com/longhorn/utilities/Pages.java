package com.longhorn.utilities;

import com.longhorn.pages.RequestsForQuotation;

public class Pages {
    private RequestsForQuotation requestsForQuotation;


    public RequestsForQuotation homePage() {
        if (requestsForQuotation == null) {
            requestsForQuotation = new RequestsForQuotation();
        }
        return requestsForQuotation;
    }


}
