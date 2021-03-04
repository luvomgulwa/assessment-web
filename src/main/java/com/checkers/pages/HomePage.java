package com.checkers.pages;

import com.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    @FindBy(xpath = "//span/*[text()='Find a Store']")
    WebElement storeFinderLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public FindStorePage clickFindStoreLink() {
        storeFinderLink.click();

        return new FindStorePage(driver);
    }
}
