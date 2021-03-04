package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    private WebDriver driver;
    private String driverPath = System.getProperty("user.dir") + "/src/main/java/com/webdrivers";
    private Config config;

    public BrowserDriver(Config config) {
        this.config = config;
        setupBrowser();
    }

    void setupBrowser() {
        if(config.getBrowser().equals("chrome")) {
            String chromeDriver = driverPath + "/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriver);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");

            driver = new ChromeDriver(options);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Config getConfig() {
        return config;
    }
}
