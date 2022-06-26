package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;



public class BasketPage {
            By logo= By.cssSelector("a.main-header-logo");
            By searchBox= By.id("search-form__input-field__search-input");
            By searchButton=By.cssSelector(".search-form__input-field__btn-search.search-form__input-field__btn-search--active");
            By KadinButton = By.cssSelector("#header__container > header > div.header__bottom > nav > ul > li:nth-child(1) > a");
            By renkAraBar = By.className("filter-option-search-box__input");
            By basketNumber= By.className("item-quantity-input ignored");
            WebDriver driver;
    ElementHelper elementHelper;
public BasketPage (WebDriver disardanGelenDriver) {
        this.driver= disardanGelenDriver;
        }

WebDriver driver;


    public void setDefaultSettings(int time){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

    }
    public void checkLogo(){
        driver.findElement(logo);

    }
    public void setSearchBox( String product ){
        driver.findElement(searchBox).sendKeys(product);

    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();

    }
    public void clickKadin(){
        driver.findElement(KadinButton).click();
    }
    public void renkAra(String renk){
        driver.findElement(renkAraBar).sendKeys(renk);

    }
    public void checkNum(String num){

        elementHelper.checkElementWithText(basketNumber,num);
    }
}
