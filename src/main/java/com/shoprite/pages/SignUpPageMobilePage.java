package com.shoprite.pages;

import com.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageMobilePage extends PageBase {

    @FindBy(id = "j_username")
    WebElement mobileNumberField;
    @FindBy(id = "formButton")
    WebElement nextButton;

    public SignUpPageMobilePage(WebDriver driver) {
        super(driver);
    }

    public void enterPhoneNumber(String number) {
        mobileNumberField.sendKeys(number);
    }

    public SignUpUserDetails clickNextButton() {
        nextButton.click();

        return new SignUpUserDetails(driver);
    }
}
