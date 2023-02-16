package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {




    public  WebDriver driver;




    public static By addToCartField= By.id("add-to-cart-sauce-labs-backpack");


    public static By shoppingCartBadgeField=By.xpath("//span[@class='shopping_cart_badge']");


    public static By twitterLink=By.xpath("//a[@href='https://twitter.com/saucelabs']");

    public static By linkedInLink=By.xpath("//*[@href='https://www.linkedin.com/company/sauce-labs/']");

    public static By facebookLink=By.xpath("//a[@href='https://www.facebook.com/saucelabs']");



    public ProductsPage(WebDriver driver) {
        this.driver=driver;
    }


    public void clickOnAddToCartField(){

        driver.findElement(addToCartField).click();
    }



    public void clickOnShoppingCartBadge(){

        driver.findElement(shoppingCartBadgeField).click();
    }


    public void clickOnTwitterLink(){
        driver.findElement(twitterLink).click();

    }



    public void clickOnLinkedInLink() {
        driver.findElement(linkedInLink).click();
    }



    public void clickOnFacebookLink(){
        driver.findElement(facebookLink).click();

    }







}




