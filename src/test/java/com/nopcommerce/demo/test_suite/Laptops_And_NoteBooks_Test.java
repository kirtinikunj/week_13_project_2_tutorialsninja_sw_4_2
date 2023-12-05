package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.pages.LapTops_And_NoteBooks_Page;
import com.nopcommerce.demo.test_base.Base_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
 * 1.1 Mouse hover on Laptops & Notebooks Tab.and click
 * 1.2 Click on “Show All Laptops & Notebooks”
 * 1.3 Select Sort By "Price (High > Low)"
 * 1.4 Verify the Product price will arrange in High to Low order.
 * <p>
 * 2. Test name verifyThatUserPlaceOrderSuccessfully()
 * 2.1 Mouse hover on Laptops & Notebooks Tab and click
 * 2.2 Click on “Show All Laptops & Notebooks”
 * 2.3 Select Sort By "Price (High > Low)"
 * 2.4 Select Product “MacBook”
 * 2.5 Verify the text “MacBook”
 * 2.6 Click on ‘Add To Cart’ button
 * 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
 * 2.8 Click on link “shopping cart” display into success message
 * 2.9 Verify the text "Shopping Cart"
 * 2.10 Verify the Product name "MacBook"
 * 2.11 Change Quantity "2"
 * 2.12 Click on “Update” Tab
 * <p>
 * 2.13 Verify the message “Success: You have modified your shopping cart!”
 * 2.14 Verify the Total £737.45
 * 2.15 Click on “Checkout” button
 * 2.16 Verify the text “Checkout”
 * 2.17 Verify the Text “New Customer”
 * 2.18 Click on “Guest Checkout” radio button
 * 2.19 Click on “Continue” tab
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “Continue” Button
 * 2.22 Add Comments About your order into text area
 * 2.23 Check the Terms & Conditions check box
 * 2.24 Click on “Continue” button
 * 2.25 Verify the message “Warning: Payment method required!”
 */
public class Laptops_And_NoteBooks_Test extends Base_Test {

    Home_Page homePage = new Home_Page();
    LapTops_And_NoteBooks_Page ltnbp = new LapTops_And_NoteBooks_Page();

    //   * 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        // * 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopAndClick();
        //* 1.2 Click on “Show All Laptops & Notebooks”
        ltnbp.clickOnShowAll();
        //  * 1.3 Select Sort By "Price (High > Low)"
        ltnbp.selectPriceHighToLow();
        // * 1.4 Verify the Product price will arrange in High to Low order.
    }

    //* 2. Test name verifyThatUserPlaceOrderSuccessfully()
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {

        //* 2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.mouseHoverOnLaptopAndClick();
        // * 2.2 Click on “Show All Laptops & Notebooks”
        ltnbp.clickOnShowAll();
        //* 2.3 Select Sort By "Price (High > Low)"
        ltnbp.selectPriceHighToLow();
        // * 2.4 Select Product “MacBook”
        ltnbp.selectMacBook();
        // * 2.5 Verify the text “MacBook”
        String expectedTextMacBook = "MacBook";
        String actualTextMacBook = ltnbp.verifyMacBook();
        Assert.assertEquals(actualTextMacBook,expectedTextMacBook);
        // * 2.6 Click on ‘Add To Cart’ button
        ltnbp.clickOnAddToCartButton();
        //* 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!";
        String actualSuccessMessage= ltnbp.verifySuccessMessage();
        Assert.assertEquals(actualSuccessMessage,expectedSuccessMessage);
        // * 2.8 Click on link “shopping cart” display into success message
        ltnbp.clickOnShoppingCartLink();
        //* 2.9 Verify the text "Shopping Cart"
        String expectedShoppingText = "Shopping Cart";
        String actualShoppingText = ltnbp.verifyShoppingCart();
        Assert.assertEquals(actualShoppingText,expectedShoppingText);
        //* 2.10 Verify the Product name "MacBook"
        String expectedProductName= "MacBook";
        String actualProductName = ltnbp.verifyProductName();
        Assert.assertEquals(actualProductName,expectedProductName);
        // * 2.11 Change Quantity "2"
        ltnbp.changeQuantity();
        //* 2.12 Click on “Update” Tab
        ltnbp.clickOnUpdate();
        //* 2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedModifyMessage= "Success: You have modified your shopping cart!";
        String actualModifyMessage = ltnbp.verifyModifyMessage();
        Assert.assertEquals(actualModifyMessage,expectedModifyMessage);
        // * 2.14 Verify the Total £737.45
        String expectedTotal= "£737.45";
        String actualTotal = ltnbp.verifyTotal();
        Assert.assertEquals(actualTotal,expectedTotal);
        // * 2.15 Click on “Checkout” button
        ltnbp.clickOnCheckOut();
        //* 2.16 Verify the text “Checkout”
        String expectedCheckout= "Checkout";
        String actualCheckout = ltnbp.verifyChechOutText();
        Assert.assertEquals(actualCheckout,expectedCheckout);
        //* 2.17 Verify the Text “New Customer”
        String expectedNewCustomer= "New Customer";
        String actualNewCustomer = ltnbp.verifyNewCustomer();
        Assert.assertEquals(actualNewCustomer,expectedNewCustomer);
        //* 2.18 Click on “Guest Checkout” radio button
        ltnbp.clickOnGuestCheckOut();
        //* 2.19 Click on “Continue” tab
        ltnbp.clickOnContinueTab();
        //* 2.20 Fill the mandatory fields
        ltnbp.fillAllMandatoryField();
        // * 2.21 Click on “Continue” Button
        ltnbp.clickOnContinueButton();
        // * 2.22 Add Comments About your order into text area
        ltnbp.sendText();
        // * 2.23 Check the Terms & Conditions check box
        ltnbp.clickOnTermsAndConditions();
        // * 2.24 Click on “Continue” button
        ltnbp.clickOnLastButton();
        //* 2.25 Verify the message “Warning: Payment method required!”
        String expectedWarningMessage= "Warning: Payment method required!";
        String actualWarningMessage = ltnbp.verifyWarningMessage();
        Assert.assertEquals(actualWarningMessage,expectedWarningMessage);
    }
}
