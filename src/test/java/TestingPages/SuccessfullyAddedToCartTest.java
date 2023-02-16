package TestingPages;

import Pages.LogInPage;
import Pages.ProductsPage;
import Pages.YourCartPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class SuccessfullyAddedToCartTest extends BaseTest{



    LogInPage loginpage=new LogInPage(driver);
    ProductsPage products=new ProductsPage(driver);

    @Before
    public void setUp() throws Exception {


        driver.get("https://www.saucedemo.com/");
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLogInButton();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);

    }






    @Test
    public void testSuccessfullyaddedToCart() {


        products.clickOnAddToCartField();
        products.clickOnShoppingCartBadge();

        String realUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.saucedemo.com/cart.html";

        Assert.assertTrue("Product not added to cart",realUrl.equals(expectedUrl));



    }





}










