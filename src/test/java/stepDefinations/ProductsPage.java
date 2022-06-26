package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductsPage {
    @When("click on first product")
    public void clickOnFirstProduct() {
      ProductPage.clickfProduct();
    }

    @Then("should check product page")
    public void shouldCheckProductPage() {
        ProductPage.checkProductPage();
    }

    @When("pick bluz size as M")
    public void pickBluzSizeAsM() {
      ProductPage.sizePick("M" );
    }
}
