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

public class TC_01 {
   public ExcelUtils excelUtils;
//    1_Go to https://pearlymarket.com/
//    2_ Navigate to registration page
//  3_Verify that the Sign Up tab is selected on the Register screen.
//    4_On the Register screen, locate the "Become a Vendor" link and click on
//5_ Enter a valid email address in the email address field
//6_Enter the received verification code in the verification code text box
//7_Enter a password that meets the requirements (contains uppercase, lowercase, digit, and special characters) in the password field.
//   8_Enter the same password again in the password confirmation field.
//   9_Click on the "Register" button.
//10_"Registration completed successfully!" message should be visible
//11_Ensure that the user is redirected to the appropriate Vendor dashboard or landing page.


    @Test
    public void US09_TC01 () throws IOException {

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

       //10_"Registration completed successfully!" message should be visible

        pearlyMarketVendorRegisterPage.registeredMessage.isDisplayed();

     //11_Ensure that the user is redirected to the appropriate Vendor dashboard or landing page.

      WaitUtils.waitForClickablility(pearlyMarketVendorRegisterPage.notRightNowLink,2);
      pearlyMarketMyAccountPage.dashboardLink.isDisplayed();

    }
}
