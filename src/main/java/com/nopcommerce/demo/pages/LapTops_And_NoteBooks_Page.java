package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LapTops_And_NoteBooks_Page extends Utility {

    By text = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    //* 1.2 Click on “Show All Laptops & Notebooks”
    By show = By.xpath("//a[text()='Show AllLaptops & Notebooks']");
    //  * 1.3 Select Sort By "Price (High > Low)"
    By price = By.id("input-sort");
    // * 1.4 Verify the Product price will arrange in High to Low order.

    // * 2.4 Select Product “MacBook”
    By macBook = By.xpath("//a[text()='MacBook']");
    // * 2.5 Verify the text “MacBook”
    By textMac = By.xpath("//a[text()='MacBook']");
    // * 2.6 Click on ‘Add To Cart’ button
    By cartButton = By.cssSelector("//body[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[1]/span[1]");
    //* 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    // * 2.8 Click on link “shopping cart” display into success message
    By shoppingLink = By.xpath("//a[text()='shopping cart']");
    //* 2.9 Verify the text "Shopping Cart"
    By shoppingText = By.xpath("//a[text()='Shopping Cart']");
    //* 2.10 Verify the Product name "MacBook"
    By name = By.cssSelector("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    // * 2.11 Change Quantity "2"
    By qty = By.cssSelector("//input[@name='quantity[80061]']");
    //* 2.12 Click on “Update” Tab
    By update = By.xpath("//i[@class='fa fa-refresh']");
    //* 2.13 Verify the message “Success: You have modified your shopping cart!”
    By modifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    // * 2.14 Verify the Total £737.45
    By total = By.cssSelector("//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    // * 2.15 Click on “Checkout” button
    By checkout = By.xpath("//a[text()='Checkout']");
    //* 2.16 Verify the text “Checkout”
    By checkoutText = By.xpath("//h1[text()='Checkout']");
    //* 2.17 Verify the Text “New Customer”
    By customer = By.xpath("//h2[text()='New Customer']");
    //* 2.18 Click on “Guest Checkout” radio button
    By guest = By.xpath("//input[@value='guest']");
    //* 2.19 Click on “Continue” tab
    By continueTab = By.xpath("//input[@id='button-account']");
    //* 2.20 Fill the mandatory fields
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By emailId = By.id("input-payment-email");
    By phoneNo = By.id("input-payment-telephone");
    By password = By.id("input-payment-password");
    By confirmPassword = By.id("input-payment-confirm");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postCode = By.id("input-payment-postcode");
    By country = By.id("input-payment-country");
    By zone = By.id("input-payment-zone");
    // * 2.21 Click on “Continue” Button
    By button = By.id("button-register");
    // * 2.22 Add Comments About your order into text area
    By comment = By.id("button-payment-address");
    // * 2.23 Check the Terms & Conditions check box
    By tAndC = By.xpath("//input[@name='agree']");
    // * 2.24 Click on “Continue” button
    By lastButton = By.xpath("//input[@id='button-payment-method']");
    //* 2.25 Verify the message “Warning: Payment method required!”
    By warning = By.xpath("//h2[text()='New Customer']");


    public String verifyLaptopText() {
        return getTextFromElement(text);
    }

    public void clickOnShowAll() {
        clickOnElement(show);
    }

    public void selectPriceHighToLow() {
        clickOnElement(price);
    }

    public void selectMacBook() {
        clickOnElement(macBook);
    }

    public String verifyMacBook() {
        return getTextFromElement(textMac);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(cartButton);
    }

    public String verifySuccessMessage() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingLink);
    }

    public String verifyShoppingCart() {
        return getTextFromElement(shoppingText);
    }

    public String verifyProductName() {
        return getTextFromElement(name);
    }

    public void changeQuantity() {
        sendTextToElement(qty, "2");
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

    public String verifyModifyMessage() {
        return getTextFromElement(modifyMessage);
    }

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkout);
    }

    public String verifyChechOutText() {
        return getTextFromElement(checkoutText);
    }

    public String verifyNewCustomer() {
        return getTextFromElement(customer);
    }

    public void clickOnGuestCheckOut() {
        clickOnElement(guest);
    }


    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    public void fillAllMandatoryField() {
        sendTextToElement(firstName, "Nill");
        sendTextToElement(lastName, "Poddar");
        sendTextToElement(emailId, "nill123@gmail.com");
        sendTextToElement(phoneNo, "+44 7707654432");
        sendTextToElement(password, "nill1234");
        sendTextToElement(confirmPassword, "nill1234");
        sendTextToElement(address, "21,oxford Street");
        sendTextToElement(city, "London");
        sendTextToElement(postCode, "LA1 1QL");
        selectByValueFromDropDown(country, "222");
        selectByValueFromDropDown(zone, "3581");
    }

    public void clickOnContinueButton() {
        clickOnElement(button);
    }

    public void sendText() {
        sendTextToElement(comment, "Hello!!!");
    }

    public void clickOnTermsAndConditions() {
        clickOnElement(tAndC);
    }

    public void clickOnLastButton() {
        clickOnElement(lastButton);
    }

    public String verifyWarningMessage() {
        return getTextFromElement(warning);
    }

}
