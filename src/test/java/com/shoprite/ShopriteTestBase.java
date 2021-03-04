package com.shoprite;

import com.utils.BrowserDriver;
import com.utils.Config;
import com.utils.PropertyLoader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class ShopriteTestBase {
    protected BrowserDriver browserDriver;
    protected Config config;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        config = new Config(new PropertyLoader("shopriteconfig.properties").getProperties());
        browserDriver = new BrowserDriver(config);
        browserDriver.getDriver().get(config.getUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        browserDriver.getDriver().quit();
    }
}
