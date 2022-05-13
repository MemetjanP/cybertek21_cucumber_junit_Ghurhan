package com.cybertek.step_definitions;

import com.cybertek.pages.Etsy_Page;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinition {

    @Given("User is on the Etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }


    @Then("User sees the title as expected")
    public void user_sees_the_title_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }



/*
   @When("User types Wooden Spoon in the search box")
   public void user_types_wooden_spoon_in_the_search_box() {
       Etsy_Page etsyPage = new Etsy_Page();
       etsyPage.etsySearchBox.sendKeys("Wooden Spoon");
   }

   @When("User clicks search button")
   public void user_clicks_search_button() {
       Etsy_Page etsyPage = new Etsy_Page();
       etsyPage.searchButton.click();
   }


   @Then("User sees Wooden Spoon in the title")
   public void user_sees_wooden_spoon_in_the_title() {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Wooden spoon";
       Assert.assertTrue(actualTitle.contains(expectedTitle));

   }


*/

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String arg0) {
        Etsy_Page etsyPage = new Etsy_Page();
        etsyPage.etsySearchBox.sendKeys(arg0);

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        Etsy_Page etsyPage = new Etsy_Page();
        etsyPage.searchButton.click();
    }


    @Then("User sees {string} in the title")
    public void user_sees_in_the_title(String string) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


}
