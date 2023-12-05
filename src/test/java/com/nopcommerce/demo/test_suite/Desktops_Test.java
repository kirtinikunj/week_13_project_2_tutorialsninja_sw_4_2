package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Desktop_Page;
import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.test_base.Base_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * <p>
 * 1.1 Mouse hover on Desktops Tab.and click
 * 1.2 Click on “Show All Desktops”
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Mouse hover on Currency Dropdown and click
 * 2.2 Mouse hover on £Pound Sterling and click
 * 2.3 Mouse hover on Desktops Tab.
 * 2.4 Click on “Show All Desktops”
 * 2.5 Select Sort By position "Name: A to Z"
 * 2.6 Select product “HP LP3065”
 * 2.7 Verify the Text "HP LP3065"
 * 2.8 Select Delivery Date "2023-11-27"
 * 2.9.Enter Qty "1” using Select class.
 * 2.10 Click on “Add to Cart” button
 * 2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
 * 2.12 Click on link “shopping cart” display into success message
 * 2.13 Verify the text "Shopping Cart"
 * 2.14 Verify the Product name "HP LP3065"
 * 2.15 Verify the Delivery Date "2023-11-27"
 * 2.16 Verify the Model "Product21"
 * 2.17 Verify the Todat "£74.73"
 */
public class Desktops_Test extends Base_Test {
    Home_Page homePage = new Home_Page();
    Desktop_Page desktopPage = new Desktop_Page();

    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktopAndClick();
        //1.2 Click on “Show All Desktops”
        desktopPage.clickonShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        //1.4 Verify the Product will arrange in Descending order.
    }

    //2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        //2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverOnCurrencyAndClick();
        //2.2 Mouse hover on £Pound Sterling and click
        homePage.mouseHoverOnPoundAndClick();
        //2.3 Mouse hover on Desktops Tab .
        homePage.mouseHoverOnDesktopAndClick();
        //2.4 Click on “Show All Desktops”
        desktopPage.clickonShowAllDesktops();
        //2.5 Select Sort By position "Name: A to Z"
        desktopPage.sortByAToZ();
        // 2.6 Select product “HP LP3065”
        desktopPage.selectProduct();
        //2.7 Verify the Text "HP LP3065"
        String expText = "HP LP3065";
        String actText = desktopPage.verifyDesktopText();
        Assert.assertEquals(actText, expText);
        //2.8 Select Delivery Date "2023-11-27"
        //2.9.Enter Qty "1” using Select class.
        desktopPage.enterQuantity();
        //2.10 Click on “Add to Cart” button
        desktopPage.clickPnAddToCartButton();
        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actMessage = desktopPage.verifySuccessMessage();
        Assert.assertEquals(actMessage, expMessage);
        //2.12 Click on link “shopping cart” display into success message
        desktopPage.clickOnShoppingCartLink();
        //2.13 Verify the text "Shopping Cart"
        String expText1 = "Shopping Cart";
        String actText1 = desktopPage.verifyShoppingCart();
        Assert.assertEquals(actText1, expText1);
        //2.14 Verify the Product name "HP LP3065"
        String expName = "HP LP3065";
        String actName = desktopPage.verifyHpLp();
        Assert.assertEquals(actName, expName);
        // 2.15 Verify the Delivery Date "2023-11-27"
        // 2.16 Verify the Model "Product21"
        String expModel = "Product21";
        String actModel = desktopPage.verifyModel();
        Assert.assertEquals(actModel, expModel);
        //2.17 Verify the Todat "£74.73"
        String expTotal = "£74.73";
        String actTotal = desktopPage.verifyTotal();
        Assert.assertEquals(actTotal, expTotal);
    }
}
