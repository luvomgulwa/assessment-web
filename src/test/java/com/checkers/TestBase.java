package com.checkers;

import com.utils.BrowserDriver;
import com.utils.Config;
import com.utils.PropertyLoader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    protected BrowserDriver browserDriver;
    protected Config config;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        config = new Config(new PropertyLoader("config.properties").getProperties());
        browserDriver = new BrowserDriver(config);
        browserDriver.getDriver().get(config.getUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        browserDriver.getDriver().quit();
    }
}
