package com.utils;

import org.testng.annotations.DataProvider;

public class TestDataProver {

    @DataProvider(name = "storeDetailsData")
    public Object[][] storeDetailsData() {
        return new Object[][] {
                {"Bellville"},
                {"7441"},
                {"Cape Town"}
        };
    }

    @DataProvider(name = "signup")
    public Object[][] signup() {
        return new Object[][] {
                {"Luvo", "Mgulwa", "luvo@email.com", "PP52AUTOMATION01", "13/08/1961"}
        };
    }
}
