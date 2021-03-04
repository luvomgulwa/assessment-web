package com.shoprite.pages;

import com.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpUserDetails extends PageBase {

    @FindBy(id = "firstName")
    WebElement firstNameTextBox;
    @FindBy(id = "lastName")
    WebElement surNameTextBox;
    @FindBy(id = "email")
    WebElement emailTextBox;
    @FindBy(xpath = "//*[@data-number='passportNumber']")
    WebElement useMyPassportButton;
    @FindBy(id = "passport")
    WebElement passportTextBox;
    @FindBy(id = "birthDate")
    WebElement birthdatePicker;
    @FindBy(id = "formButton")
    WebElement nextButton;
    @FindBy(xpath = "//div[@class='form-group']/span[@id='passport.errors']")
    WebElement passportErrorField;

    public SignUpUserDetails(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String name) {
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(name);
    }

    public void enterLastName(String lastname) {
        surNameTextBox.sendKeys(lastname);
    }

    public void enterEmail(String email) {
        emailTextBox.sendKeys(email);
    }

    public void clickUseMyPassport() {
        useMyPassportButton.click();
    }

    public void enterBirthdate(String birthdate) {
        birthdatePicker.sendKeys(birthdate);
    }

    public void enterPassport(String passport) {
        passportTextBox.sendKeys(passport);
    }

    public void signupUser(String firstname, String lastname, String email, String passport, String birthdate) {
        enterFirstName(firstname);
        enterLastName(lastname);
        enterEmail(email);
        clickUseMyPassport();
        enterPassport(passport);
        enterBirthdate(birthdate);
    }

    public void clickNextButton() {
        scrollToElementView(nextButton);
        nextButton.click();
    }

    public String getPassportError() {
        return passportErrorField.getText();
    }
}
