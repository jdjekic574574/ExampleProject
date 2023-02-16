package TestingPages;

import Pages.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import static TestingPages.BaseTest.driver;

public class ShoppingPageTest extends BaseTest {



   LogInPage loginpage=new LogInPage(driver);
   ProductsPage product=new ProductsPage(driver);
   YourCartPage cart=new YourCartPage(driver);
   CheckoutPage checkoutPage=new CheckoutPage(driver);
   CheckoutOverview checkoutOverview=new CheckoutOverview(driver);
   CheckoutComplete checkoutComplete=new CheckoutComplete(driver);



    @Before
    public void setUp() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLogInButton();
        Thread.sleep(6000);
    }





      @Test
    public void testOfShoppingProduct() {

             product.clickOnAddToCartField();
             product.clickOnShoppingCartBadge();
             cart.clickOnCheckoutButton();
             checkoutPage.enterFirstName("Jelena");
             checkoutPage.enterLastName("Djekic");
             checkoutPage.enterPostalCodeInputField("11070");
             checkoutPage.clickOnContinueButton();
             JavascriptExecutor js=(JavascriptExecutor)driver;
             js.executeScript("window.scrollBy(0,3000)");
             checkoutOverview.clickOnFinishButton();
             checkoutComplete.getMessageText();


             String currentUrl= driver.getCurrentUrl();
             String expectedUrl="https://www.saucedemo.com/checkout-complete.html";

            Assert.assertTrue("The purchase is successful",currentUrl.equals(expectedUrl));


    }

}
