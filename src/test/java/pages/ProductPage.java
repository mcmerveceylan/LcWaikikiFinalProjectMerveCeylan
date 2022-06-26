package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {
    By productPageTitle = By.ByCssSelector(".product-title");
    By sizePick = By.ByCssSelector(".selected");
    By addBasketButton=By.id("pd_add_to_cart");

    By firstProduct= By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.product-grid > div:nth-child(1) > a > div.product-image > img\n");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public ProductPage(WebDriver driver) {


        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
        this.elementHelper = new ElementHelper(this.driver);
    }
    public void checkProductPage(){
        elementHelper.presenceElement(productPageTitle);
    }
    public void sizePick(String size){
        elementHelper.clickElementWithText(sizePick,size);
    }
    public void clickBtn(String btn){
        elementHelper.clickElementWithText(addBasketButton,btn);
    }

    }
    public void clickfProduct(){
        driver.findElement(firstProduct).click();
    }


}

