package com.checkers.pages;

import com.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindStorePage extends PageBase {

    @FindBy(xpath = "//*[contains(@class,'yCmsComponent')]//*[@id='storeFinderInput']")
    WebElement citySearchBox;
    @FindBy(xpath = "//*[contains(@class,'yCmsComponent')]//*[contains(@class,'nav-store-your-hours-simple']")
    WebElement openClosedField;


    public FindStorePage(WebDriver driver) {
        super(driver);
    }

    public void searchCity(String search) {
        citySearchBox.clear();
        citySearchBox.sendKeys(search);
    }

    public boolean getStoreDetails() {
        return openClosedField.isDisplayed();
    }
}
