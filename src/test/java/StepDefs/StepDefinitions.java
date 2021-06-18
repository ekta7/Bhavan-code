package StepDefs;

import Utils.Utils;
import Base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class StepDefinitions
{

    @Given("I am on the home page")
    public void i_am_on_the_home_page() throws InterruptedException, IOException {
        Utils.navigateToUrl();
        System.out.println("Home Page Title is: " + Utils.getPageTitle());
        BasePage.homePage.handleCookies();
    }

    @When("I navigate to Deals")
    public void i_navigate_to_deals()
    {
        BasePage.homePage.clickDealsLink();
        System.out.println("Deals Page Title is: " + Utils.getPageTitle());

    }

    @Then("the user should be on the {string}")
    public void the_user_should_be_on_the(String dealsUrl)
    {
        String currentUrl =  Utils.getUrl();
        System.out.println("Deals Page Url is: " + currentUrl);
        Assertions.assertEquals(dealsUrl,currentUrl);
    }


    @When("I try to sign in with invalid credentials")
    public void i_try_to_sign_in_with_invalid_credentials(io.cucumber.datatable.DataTable dataTable)
    {
       BasePage.homePage.clickSignInLink();
        System.out.println("Sign in Page Title is: " + Utils.getPageTitle());

        BasePage.signInPage.login(dataTable.cell(1,0),dataTable.cell(1,1));

    }


    @Then("I should see a text saying that {string}")
    public void i_should_see_a_text_saying_that(String text)
    {
        String errorMessage = BasePage.signInPage.verifyErrorMessage();
        System.out.println("Error Message is: " + errorMessage);
        Assertions.assertEquals(text,errorMessage);
    }


    @Given("I am on the {string} page")
    public void i_am_on_the_page(String url) throws InterruptedException {
        Utils.navigateToUrl(url);
        System.out.println("Home Page Title is: " + Utils.getPageTitle());
        BasePage.homePage.handleCookies();

    }
    @Then("I see a list of deals with a price to it")
    public void i_see_a_list_of_deals_with_a_price_to_it()
    {
        System.out.println("First deal price is: " + BasePage.dealsPage.verifyPrice1());
        System.out.println("Second deal price is: " + BasePage.dealsPage.verifyPrice2());
        System.out.println("Third deal price is: " + BasePage.dealsPage.verifyPrice3());

    }



    @When("I search {string} in the search bar")
    public void i_search_in_the_search_bar(String searchText) throws InterruptedException {
        BasePage.homePage.clickSearchToggle();
       BasePage.homePage.enterSearchText(searchText);
    }
    @Then("I should see an editorial section")
    public void i_should_see_an_editorial_section()
    {
        System.out.println(BasePage.homePage.verifyEditorialTitle());
        System.out.println(BasePage.homePage.verifyEditorialParagraph());
    }


}
