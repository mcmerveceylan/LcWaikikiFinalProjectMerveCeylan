package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BasketPage;

public class BasketsPage {
    @Given("application open")
    public void applicationOpen() {
       BasketPage.setDefaultSettings(10);
        BasketPage.checkLogo();
    }

    @When("click on {string}  card in the top right")
    public void clickOnCardInTheTopRight(String arg0) {
        BasketPage.clickKadin();

    }

    @When("click on {string}")
    public void clickOn(String arg0) {
    }

    @Then("should check {string} page")
    public void shouldCheckPage(String arg0) {

    }

    @When("click on {string} button")
    public void clickOnButton(String arg0) {

    }

    @When("type {string} in renk ara bar")
    public void typeInRenkAraBar(String arg0) {
      BasketPage.renkAra("siyah");

    }

    @When("choose {string} button")
    public void chooseButton(String arg0) {
    }

    @Then("should check siyah filter page")
    public void shouldCheckSiyahFilterPage() {

    }



    @When("go to basket")
    public void goToBasket() {

    }

    @Then("should check that product is added")
    public void shouldCheckThatProductIsAdded() {
    }

    @Then("should check product name, size,number")
    public void shouldCheckProductNameSizeNumber() {
        BasketPage.checkNum();
    }



    @Then("should check odeme page")
    public void shouldCheckOdemePage() {
    }
}
