package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_11 {
    public ExcelUtils excelUtils;


//    1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_ Enter an email address that is already registered on the website.
//7_ Click on "SUBMIT" button on the right bottom corner
//8_Fill in the remaining required fields with valid information
//9_Click on Register button
//10_"This Email already exists. Please login to the site and apply as vendor." message should be visible

    @Test
    public void US09_TC11 () throws IOException {

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

        //6_ Verify that “Verification code sent to your email: stevegregor2023@gmail.com.” is visible
        WaitUtils.waitForVisibility(pearlyMarketVendorRegisterPage.verificationCodeSentBox,3);

        //7_Enter the received verification code in the verification code text box

        pearlyMarketVendorRegisterPage.verifCodeBox.click();


        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("gmail_login"));
        Driver.getDriver().findElement(By.xpath("//*[@name='identifier']")).sendKeys("stevegregor2023@gmail.com");

        Driver.getDriver().findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]")).sendKeys(excelUtils.getCellData(2,2));
        Driver.getDriver().findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();


        WaitUtils.waitForVisibility(By.xpath("//div//span[@email='info@pearlymarket.com']"),4).click();

        String verificationCode=Driver.getDriver().findElement(By.xpath("//div/p/b")).getText();

        ReusableMethods.switchToWindow(0);

        pearlyMarketVendorRegisterPage.verifCodeBox.sendKeys(verificationCode);

        MediaUtils.takeScreenshotOfTheEntirePageAsString();



        //8_Enter a password that meets the requirements (contains uppercase, lowercase, digit, and special characters) in the password field.

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));

        //   9_Enter the same password again in the password confirmation field.

        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));

        //   10_Click on the "Register" button.

        pearlyMarketVendorRegisterPage.registerButton.click();

        //11_"This Email already exists. Please login to the site and apply as vendor." message should be visible

        pearlyMarketVendorRegisterPage.alreadyExistMail.isDisplayed();


        }
}



