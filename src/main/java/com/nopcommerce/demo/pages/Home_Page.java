package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home_Page extends Utility {

    By topMenuElements = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktop=By.linkText("Desktops");

    By laptop=By.linkText("Laptops & Notebooks");
    By components=By.linkText("Components");

    //2.1 Mouse hover on Currency Dropdown and click
    By currency=By.xpath("//i[@class='fa fa-caret-down']");
    By currencyClick=By.xpath("//i[@class='fa fa-caret-down']");
    //2.2 Mouse hover on £Pound Sterling and click
    By pound=By.xpath("//button[text()='£Pound Sterling']");
    By poundClick=By.xpath("//button[text()='£Pound Sterling']");


    public List<WebElement> selectNavigationBar() {
        return getElement(topMenuElements);
    }

    public void mouseHoverOnDesktopAndClick(){
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverOnLaptopAndClick(){
        mouseHoverToElementAndClick(laptop);
    }

    public void mouseHoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(components);
    }

    public void mouseHoverOnCurrencyAndClick(){
        mouseHoverToElement(currency);
        clickOnElement(currencyClick);
    }

    public void mouseHoverOnPoundAndClick(){
        mouseHoverToElement(pound);
        clickOnElement(poundClick);
    }


}
