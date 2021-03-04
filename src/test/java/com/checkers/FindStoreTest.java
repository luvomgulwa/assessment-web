package com.checkers;

import com.checkers.pages.FindStorePage;
import com.checkers.pages.HomePage;
import com.utils.TestDataProver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindStoreTest extends TestBase {

    @Test(description = "Find a store by searching for a city and validate that there are Open and Close time details for each day.",
    dataProvider = "storeDetailsData", dataProviderClass = TestDataProver.class)
    public void findStore(String search) {
        HomePage homePage = new HomePage(browserDriver.getDriver());
        FindStorePage findStorePage = homePage.clickFindStoreLink();
        findStorePage.searchCity(search);

        Assert.assertTrue(findStorePage.getStoreDetails());
    }
}
