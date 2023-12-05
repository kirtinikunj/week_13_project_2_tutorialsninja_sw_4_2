package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Components_Page extends Utility {

    By text=By.xpath("//h2[contains(text(),'Components')]");

    public String verifyComponentsText(){
       return getTextFromElement(text);
    }
}
