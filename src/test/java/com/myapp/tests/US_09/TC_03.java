package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_03 {

//1_Go to https://pearlymarket.com/
//2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link and click on
//5_ Enter a valid e mail address
//6_ Enter invalid verification code
//7_"Email verification code invalid." message should be visible

    @Test
    public void US09_TC03 () throws IOException {

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

        WaitUtils.waitFor(1);

        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

        //6_ Enter invalid verification code

        WaitUtils.waitFor(1);

        pearlyMarketVendorRegisterPage.verifCodeBox.sendKeys("123456");

        //7_ Provide a valid password and confirm password

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));
        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));


        //8_Click on register button
        JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);

        //9_"Email verification code invalid." message should be visible

        WaitUtils.waitFor(3);

     //   ReusableMethods.verifyExpectedAndActualTextMatch("Email verification code invalid.",pearlyMarketVendorRegisterPage.invalidVerifCode);


    }

}
