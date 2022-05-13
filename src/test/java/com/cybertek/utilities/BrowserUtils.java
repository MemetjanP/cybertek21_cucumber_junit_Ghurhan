package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {



    /*
    This method accepts List<WebElement> and returns List<String>
     */
    public static List<String> getElementsText(List<WebElement>  webElementList){

        // Place holder empty list of web element
        List<String> webElementAsString = new ArrayList<>();

        // looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList){
            webElementAsString.add(each.getText());
        }

        // returning final list of string
        return webElementAsString;
    }


}
