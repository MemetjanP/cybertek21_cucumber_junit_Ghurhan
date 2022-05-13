package com.cybertek.step_definitions;

import com.cybertek.pages.CybertekPracticeToolDropdown_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;



public class dataTable_StepDefinition {

    CybertekPracticeToolDropdown_Page dropdown_page = new CybertekPracticeToolDropdown_Page();


    @Given("User is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }




    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {

        Select monthsDropdown = new Select(dropdown_page.monthDropdown);


       /* we created a mothed in browser utility class to vonvert a List<WebElement> to a
         List<String>.
        */


       // Basiclly we are comparing two list of strings
        // expected: List<String>months
        //actual: BrowserUtils.getElementsText(monthsDropdown.getOptions()))

        List<String> actualText = BrowserUtils.getElementsText(monthsDropdown.getOptions());
        Assert.assertTrue(months.equals(actualText));






       // this method below gives thge same result
/*
    List<WebElement> monthsAsWebElement = monthsDropdown.getOptions();
    List<String> actualStrOfMonths = new ArrayList<>();

        for (WebElement eachMonth :monthsDropdown.getOptions()){
              actualStrOfMonths.add(eachMonth.getText());

   Assert.assertTrue("Test Failed ",actualStrOfMonths.equals(months));
 */
        }



    @Then("USER SHOULD SEE BELOW WORDS DISPLAYED")
    public void user_should_see_below_words_displayed(List<String> fruitList) {
        System.out.println(fruitList.size());
        System.out.println("fruitList = " + fruitList);

        System.out.println("+++++++++++++++");
        for (String eachFruit : fruitList){
            System.out.println("eachFruit: "+eachFruit);
        }




    }








    }












