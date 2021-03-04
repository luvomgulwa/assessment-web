package com.shoprite;

import com.shoprite.pages.HomePage;
import com.shoprite.pages.SignUpPageMobilePage;
import com.shoprite.pages.SignUpUserDetails;
import com.utils.TestDataProver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends ShopriteTestBase {

    @Test(description = "Register a user with a passport that has already been registered.",
    dataProvider = "signup", dataProviderClass = TestDataProver.class)
    public void signup(String firstname, String lastname, String email, String passport, String birthdate) {
        HomePage homePage = new HomePage(browserDriver.getDriver());

        SignUpPageMobilePage signUpPage = homePage.clickSignup();
        signUpPage.enterPhoneNumber("01" + Math.round(Math.random()*100000000));

        SignUpUserDetails signUpUserDetails = signUpPage.clickNextButton();

        signUpUserDetails.signupUser(firstname,lastname,email,passport,birthdate);
        signUpUserDetails.clickNextButton();

        Assert.assertEquals(signUpUserDetails.getPassportError(), "The passport is already registered");
    }
}
