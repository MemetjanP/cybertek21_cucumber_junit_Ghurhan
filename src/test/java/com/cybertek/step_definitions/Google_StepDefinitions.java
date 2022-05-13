package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on google home page")
    public void user_is_on_google_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://google.com");
    }



    @When("User search for apple")
    public void user_search_for_apple() {
        // Write code here that turns the phrase above into concrete actions
       // GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("User should be able to see apple in  the title")
    public void user_should_be_able_to_see_apple_in_the_title() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }



    @Then("User should see the flowing links")
    public void user_should_see_the_flowing_links(List<String> expectedFooterLinks) {

        System.out.println("expectedFooterLinks = " + expectedFooterLinks);

        for (String expectedFooterLink : expectedFooterLinks) {
            System.out.println("expectedFooterLink = " + expectedFooterLink);

        }

        System.out.println("=============================================");


        for (WebElement eachLink : googleSearchPage.actualFooters) {
           System.out.println("each link: "+eachLink.getText());

        }




    }




}
