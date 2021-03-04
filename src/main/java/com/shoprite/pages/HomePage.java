package com.shoprite.pages;

import com.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    @FindBy(xpath = "//*[@class='yCmsComponent']//a[@href='/login/register']")
    WebElement signupLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SignUpPageMobilePage clickSignup() {
        scrollToElementView(signupLink);
        signupLink.click();

        return new SignUpPageMobilePage(driver);
    }
}
