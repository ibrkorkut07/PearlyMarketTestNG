package com.myapp.tests.US_04;


import com.github.javafaker.Faker;
import com.myapp.pages.PearlyMarketHomePage;
import org.testng.annotations.Test;

import static com.myapp.utilities.Driver.closeDriver;
import static com.myapp.utilities.Driver.goToURL;
import static com.myapp.utilities.WaitUtils.waitForVisibility;

public class SuccessfulShippingAddressAddition {

    String username="Ali";
    String email="Veli@gmail";
    String password="12345";
    @Test(priority = 1)
    public void signUpAndSignInTest(){
        // signing up
        username= Faker.instance().name().username();
        password= Faker.instance().internet().emailAddress();
        password= Faker.instance().internet().password();
        PearlyMarketHomePage pearlyMarketHomePage =new PearlyMarketHomePage();
        goToURL("pearlymarket_homepage_url");
        pearlyMarketHomePage.homepageRegisterButton.click();
        pearlyMarketHomePage.usernameBox.sendKeys(username);
        pearlyMarketHomePage.emailBox.sendKeys(email);
        pearlyMarketHomePage.signUpPasswordBox.sendKeys(password);
        pearlyMarketHomePage.registerPolicy.click();
        pearlyMarketHomePage.signUpButton.click();
        closeDriver();
    }
    @Test(priority = 2)
    public void TC_001_Test(){
        PearlyMarketHomePage pearlyMarketHomePage =new PearlyMarketHomePage();

        //1. Navigate to "My Account" section.
        //waitForVisibility(pearlyMarketHomePage.myAccountButton,5).click();

        //2. Go to "Addresses" tab.
        //3. Click on "ADD->" under "Shipping Address" option.
        //4. Enter valid values for First Name, Last Name, Country/Region, Street Address, Town/City, State, and ZIP Code fields.
        //5. Click on "Save Address" button.
        //6. Verify that the Shipping Address is added successfully.
        //7. Ensure that the entered details match the saved address.

    }
}