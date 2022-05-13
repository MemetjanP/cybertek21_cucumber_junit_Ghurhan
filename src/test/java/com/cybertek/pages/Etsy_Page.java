package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy_Page {

    public Etsy_Page(){  // constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "search_query")
    public WebElement etsySearchBox;

    @FindBy(xpath = "//*[@id=\"gnav-search\"]/div/div[1]/button")
    public WebElement searchButton;




}
