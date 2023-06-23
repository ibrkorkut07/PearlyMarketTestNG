package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyMarketMyAccountPage {
    public PearlyMarketMyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[.='Dashboard']")
    public WebElement dashboardLink;
    @FindBy(xpath = "//a[.='Orders']")
    public WebElement ordersLink;
    @FindBy(xpath = "//a[.='Downloads']")
    public WebElement downloadsLink;
    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addressesLink;
    @FindBy(xpath = "//a[.='Account details']")
    public WebElement accountDetailsLink;
    @FindBy(xpath = "(//a[.='Wishlist'])[1]")
    public WebElement wishlistLink;
    @FindBy(xpath = "//a[.='Chat Box']")
    public WebElement chatBoxLink;
    @FindBy(xpath = "//a[.='Support Tickets']")
    public WebElement supportTicketsLink;
    @FindBy(xpath = "//a[.='Followings']")
    public WebElement followingsLink;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutLink;
    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerLink;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement myAccountText;
    @FindBy(xpath = "//a[.='Go Shop']")
    public WebElement goShopLink;



}