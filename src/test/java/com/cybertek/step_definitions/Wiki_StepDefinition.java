package com.cybertek.step_definitions;

import com.cybertek.pages.Wiki_Search_Page;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinition {

    @Given("User is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }


    @When("User searches {string} in the wikipedia search box")
    public void user_searches_in_the_wikipedia_search_box(String string) {
        Wiki_Search_Page wiki_search_page = new Wiki_Search_Page();
        wiki_search_page.wikiSearchBox.sendKeys("Steve Jobs");
    }


    @Then("User clicks the search button")
    public void user_clicks_the_search_button() {
        Wiki_Search_Page wiki_search_page = new Wiki_Search_Page();
        wiki_search_page.clickButton.click();
    }
    @Then("User see {string} in the wiki title")
    public void user_see_in_the_wiki_title(String string) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string;
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle+" - Wikipedia"));
    }


    @Then("User see {string} in the main header")
    public void user_see_in_the_main_header(String string) {
        Wiki_Search_Page wiki_search_page = new Wiki_Search_Page();
        String actualHeader = wiki_search_page.header.getText();
        String expectedHeader = string;
        Assert.assertTrue(actualHeader.equalsIgnoreCase(expectedHeader));

    }



    @Then("User see {string} in the image header")
    public void user_see_in_the_image_header(String string) {

    }


}
