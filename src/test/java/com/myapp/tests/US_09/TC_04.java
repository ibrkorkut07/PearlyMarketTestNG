package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_04 {

//    1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link and click on
//5_ Enter a valid e mail address
//6_ Leave the verification code field empty.
//            7_Enter a password that meets the requirements
//8_Enter the same password again in the password confirmation field.
//            9_Click on the "Register" button.
//10_Verify that an error message is displayed, indicating that the verification code is required.
     @Test
    public void US09_TC04 () throws IOException {

        // 1_Go to https://pearlymarket.com/

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));

        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketRegisterPage pearlyMarketRegisterPage = new PearlyMarketRegisterPage();
        PearlyMarketVendorRegisterPage pearlyMarketVendorRegisterPage = new PearlyMarketVendorRegisterPage();
        PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();


        //2_ Navigate to registration page

        pearlyMarketHomePage.homepageRegisterButton.click();


        //3_Verify that Sign Up button clicked

        ReusableMethods.verifyElementClickable(pearlyMarketRegisterPage.signUpLink);

        //4_On the Register screen, locate the "Become a Vendor" link and click on

        pearlyMarketRegisterPage.becomeAVendorLink.click();


        //5_ Enter a valid email address in the email address field

        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

        //6_ Leave the verification code field empty.

        WaitUtils.waitFor(1);

        pearlyMarketVendorRegisterPage.verifCodeBox.sendKeys("");

        //7_ Provide a valid password and confirm password

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));
        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));

        // 8_Click on the "Register" button.

        WaitUtils.waitFor(2);
        JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);

        // 10_Verify that an error message is displayed, indicating that the verification code is required.

        pearlyMarketVendorRegisterPage.verifCodeRequired.isDisplayed();

    }
}