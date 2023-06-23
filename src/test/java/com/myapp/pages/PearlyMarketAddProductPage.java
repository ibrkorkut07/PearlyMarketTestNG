package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyMarketAddProductPage {

    public PearlyMarketAddProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//select[@id='product_type']")
    public WebElement dropdownProductTypeElement;

    @FindBy(xpath="//option[@value='simple']")
    public WebElement dropdownSimpleProductElement;

    @FindBy(xpath="//option[@value='variable']")
    public WebElement dropdownVariableProductElement;

    @FindBy(xpath="//option[@value='grouped']")
    public WebElement dropdownGroupedProductElement;

    @FindBy(xpath="//option[@value='external']")
    public WebElement dropdownExternalProductElement;

    @FindBy(xpath="//select[@id='product_type']")
    public WebElement simpleProductButton;

    @FindBy(xpath="//input[@id='is_virtual']")
    public WebElement virtualBox;

    @FindBy(xpath="//input[@id='is_downloadable']")
    public WebElement downloadableBox;

    @FindBy(xpath="//input[@id='regular_price']")
    public WebElement priceBox;

    @FindBy(xpath="//input[@id='sale_price']")
    public WebElement salePriceBox;

    @FindBy(xpath="//input[@data-super_parent='226']")
    public WebElement kitchenButton;

    @FindBy(xpath="//input[@name='submit-data']") // click after all necessary field fill
    public WebElement submitButton;

    @FindBy(xpath="//span[text()='Published']") // to verify that the product is installed
    public WebElement publishedText;

    @FindBy(xpath="//button[@id='insert-media-button']")
    public WebElement addMediaButton;

    @FindBy(xpath="//div[@class='wcfm_product_manager_gallery_fields']")
    public WebElement managerGalaryFields;

    @FindBy(xpath="//img[@id='featured_img_display']")
    public WebElement featuredImageBox;

    @FindBy(xpath="//button[@id='menu-item-browse']")
    public WebElement mediaLibrarySection;

    @FindBy(xpath="//img[@id='gallery_img_gimage_0_display']")
    public WebElement galaryImageBox;

    @FindBy(xpath="//button[@id='__wp-uploader-id-1']")
    public WebElement addToGalarySelectFileButton;

    @FindBy(xpath="//li[@aria-label='Stool']")
    public WebElement addToGalaryStoolImage;

    @FindBy(xpath="(//div[@class='attachment-preview js--select-attachment type-image subtype-png portrait'])[2]")
    public WebElement chooseImageStoolImage;

    @FindBy(xpath="//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement addToGalaryButton;

    @FindBy(xpath="(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement chooseImageSelectButton;

    @FindBy(id="pro_title")
    public WebElement productTitleBox;

    @FindBy(id="excerpt_ifr")
    public WebElement shortDescriptionIFrame;

    @FindBy(id="description_ifr")
    public WebElement descriptionIFrame;

    @FindBy(xpath="//body[@class='mce-content-body excerpt post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']")
    public WebElement shortDescriptionTextBox;

    @FindBy(xpath="//body[@data-id='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath="(//p[@class='wcfm_title wcfm_full_ele'])[1]")
    public WebElement categoriesTitleElement;

    @FindBy(xpath="//input[@data-super_parent='428']")
    public WebElement applephoneCheckboxInCategories;

    @FindBy(xpath="(//div[@class='wcfm_add_new_category_box wcfm_add_new_taxonomy_box'])[1]")
    public WebElement addNewCategoryLink;

    @FindBy(xpath="(//div[@class='wcfm_add_new_category_box wcfm_add_new_taxonomy_box'])[2]")
    public WebElement addNewProductBrandLink;

    @FindBy(xpath="//input[@id='wcfm_new_cat']")
    public WebElement categoryNameBox;

    @FindBy(xpath="//select[@id='wcfm_new_parent_cat']")
    public WebElement parentCategoryDropdownElement;

    @FindBy(xpath="(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement productCategoryAddButton;

    @FindBy(xpath="//input[@data-super_parent='432']")
    public WebElement adidasProductBrandTickBox;

    @FindBy(xpath="//input[@id='wcfm_new_product_brand']")
    public WebElement productBrandsNameBox;

    @FindBy(xpath="//select[@name='wcfm_new_parent_product_brand']")
    public WebElement parentTaxomonyDropdown;

    @FindBy(xpath="//button[@data-taxonomy='product_brand']")
    public WebElement newProductAddButton;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[1]")
    public WebElement addProductInventoryBox;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[4]")
    public WebElement addProductShippingBox;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[5]")
    public WebElement addProductAttributesBox;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[7]")
    public WebElement addProductLinkedBox;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[8]")
    public WebElement addProductSEOBox;

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[10]")
    public WebElement addProductAdvancedBox;

    @FindBy(id="sku")
    public WebElement skuValueBox;

    @FindBy(id="manage_stock")
    public WebElement manageStockClickBox;

    @FindBy(id="stock_qty")
    public WebElement stockqtyBox;

    @FindBy(id="stock_status")
    public WebElement stockstatusDropdown;

    @FindBy(id="sold_individually")
    public WebElement soldIndividuallyBox;

    @FindBy(id="wcfm_products_simple_submit_button")
    public WebElement addProductSubmitButton;

    @FindBy(id="weight")
    public WebElement shippingWeightBox;

    @FindBy(id="length")
    public WebElement shippingLengthBox;

    @FindBy(id="width")
    public WebElement shippingWidthBox;

    @FindBy(id="height")
    public WebElement shippingHeightBox;

    @FindBy(id="shipping_class")
    public WebElement shippingShippingclassDropdown;

    @FindBy(id="_wcfmmp_processing_time")
    public WebElement shippingProcessingtimeDropdown;

    @FindBy(id="attributes_is_active_1")
    public WebElement attributesColorCheckBox;

    @FindBy(id="attributes_value_1")
    public WebElement attributesColorDropdown;

    @FindBy(id="wcfm_products_simple_submit_button")
    public WebElement shippingSubmitButton;

    @FindBy(xpath="//input[@id='regular_price']")
    public WebElement addProductPriceBox;

}

