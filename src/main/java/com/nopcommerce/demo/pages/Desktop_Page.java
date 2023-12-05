package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Desktop_Page extends Utility {

    By text = By.xpath("//h2[contains(text(),'Desktops')]");

    //1.2 Click on “Show All Desktops”
    By showAll=By.linkText("Show AllDesktops");
    //1.3 Select Sort By position "Name: Z to A"
    By position=By.id("input-sort");
    //1.4 Verify the Product will arrange in Descending order.


    //2.3 Mouse hover on Desktops Tab .
    //2.4 Click on “Show All Desktops”
    //2.5 Select Sort By position "Name: A to Z"
    By sort=By.id("input-sort");
    // 2.6 Select product “HP LP3065”
    By product=By.xpath("//a[text()='HP LP3065']");
    //2.7 Verify the Text "HP LP3065"
    By textHp=By.xpath("//h1[text()='HP LP3065']");
    //2.8 Select Delivery Date "2023-11-27"
    //2.9.Enter Qty "1” using Select class.
    By qty=By.id("input-quantity");
    //2.10 Click on “Add to Cart” button
    By cart=By.id("button-cart");
    //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
   By successMessage=By.xpath("//div[@class='alert alert-success alert-dismissible']");
    //2.12 Click on link “shopping cart” display into success message
    By cartLink=By.xpath("//a[text()='shopping cart']");
    //2.13 Verify the text "Shopping Cart"
    By text1=By.xpath("//a[text()='Shopping Cart']");
    //2.14 Verify the Product name "HP LP3065"
    By name=By.cssSelector("/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    // 2.15 Verify the Delivery Date "2023-11-27"
    // 2.16 Verify the Model "Product21"
    By model=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    //2.17 Verify the Todat "£74.73"
    By total=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    public String verifyDesktopText() {
        return getTextFromElement(text);
    }

    public void clickonShowAllDesktops(){
        clickOnElement(showAll);
    }

    public void selectSortPositionZToA(){
        selectByVisibleTextFromDropDown(position,"Z - A");
    }

    public void sortByAToZ(){
        selectByVisibleTextFromDropDown(sort,"Name A - Z");
    }

    public void selectProduct(){
        clickOnElement(product);
    }

    public String verifyTextHp(){
        return getTextFromElement(textHp);
    }

    public void enterQuantity(){
        selectByValueFromDropDown(qty,"2");
    }

    public void clickPnAddToCartButton(){
        clickOnElement(cart);
    }

    public String verifySuccessMessage(){
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(cartLink);
    }

    public String verifyShoppingCart(){
        return getTextFromElement(text1);
    }

    public String verifyHpLp(){
        return getTextFromElement(name);
    }

    public String verifyModel(){
        return getTextFromElement(model);
    }

    public String verifyTotal(){
        return getTextFromElement(total);
    }

}
