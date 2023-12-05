package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Components_Page;
import com.nopcommerce.demo.pages.Desktop_Page;
import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.pages.LapTops_And_NoteBooks_Page;
import com.nopcommerce.demo.test_base.Base_Test;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * Write the following Test:
 * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
 * 1.1 Mouse hover on “Desktops” Tab and click
 * 1.2 call selectMenu method and pass the menu = “Show All Desktops”
 * 1.3 Verify the text ‘Desktops’
 * 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
 * 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
 * 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
 * 2.3 Verify the text ‘Laptops & Notebooks’
 * 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
 * 3.1 Mouse hover on “Components” Tab and click
 * 3.2 call selectMenu method and pass the menu = “Show All Components”
 * 3.3 Verify the text ‘Components’
 */
public class Top_Menu extends Base_Test {

    Home_Page homePage = new Home_Page();
    Desktop_Page desktopPage=new Desktop_Page();
    LapTops_And_NoteBooks_Page lapTopsAndNoteBooksPage=new LapTops_And_NoteBooks_Page();
    Components_Page componentsPage=new Components_Page();

    // * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    // 1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu) {
        List<WebElement> allTopMenuLinks = homePage.selectNavigationBar();
        try {
            for (WebElement link : allTopMenuLinks) {
                if (link.getText().equals(menu)) {
                    link.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            allTopMenuLinks = homePage.selectNavigationBar();
        }
    }

    //* 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //* 1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDesktopAndClick();
        //* 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show AllDesktops");
        //* 1.3 Verify the text ‘Desktops’
        String expectedText="Desktops";
        String actualText=desktopPage.verifyDesktopText();
        Assert.assertEquals(actualText,expectedText);
    }

    // * 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    @Test
    public void  verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        // * 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopAndClick();
        //* 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        // * 2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText1="Laptops & Notebooks";
        String actualText1= lapTopsAndNoteBooksPage.verifyLaptopText();
        Assert.assertEquals(actualText1,expectedText1);
    }

    //* 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //* 3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverOnComponentsAndClick();
        //* 3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show AllComponents");
        // * 3.3 Verify the text ‘Components’
        String expectedText2="Components";
        String actualText2= componentsPage.verifyComponentsText();
        Assert.assertEquals(actualText2,expectedText2);
    }
}
