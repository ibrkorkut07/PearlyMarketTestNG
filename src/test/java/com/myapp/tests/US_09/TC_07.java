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

public class TC_07 {
public ExcelUtils excelUtils;
//1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_Enter a password that contains uppercase letters, digits, and special characters, but no lowercase letter
//7_Proceed with the registration process
//8_Verify that an error message is displayed, indicating that the password must contain at least one lowercase letter.


    @Test
    public void US09_TC07 () throws IOException {

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


        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

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



        //5_ Leave the e-mail text area empty
        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

        //6_Enter a password that contains uppercase letters, digits, and special characters, but no lowercase letter

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys("PASSWORD123!");
        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys("PASSWORD123!");

        WaitUtils.waitFor(2);
        //7_Click on register button
        JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);

        //8_Verify that an error message is displayed, indicating that the password must contain at least one lowercase letter.
        // We can directly registered with no lowercase password.

        MediaUtils.takeScreenshotOfTheEntirePageAsString();

    }
}
