package TestingPages;

import Pages.LogInPage;
import Pages.ProductsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class TwitterFacebookLinkedinTest extends BaseTest {



    LogInPage loginpage=new LogInPage(driver);
    ProductsPage productsPage=new ProductsPage(driver);


    @Before
    public void setUp() throws Exception {

        driver.get("https://www.saucedemo.com/");
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLogInButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(6000);
    }





    @Test
    public void testTwitterLink() throws InterruptedException {






        productsPage.clickOnTwitterLink();
        Thread.sleep(4000);
        String expectedUrl="https://twitter.com/saucelabs";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertFalse("Wrong Url",expectedUrl.equals(actualUrl));



    }


    @Test
    public void testFacebookLink() throws InterruptedException {


          productsPage.clickOnFacebookLink();
          Thread.sleep(4000);
          String expectedUrl="https://www.facebook.com/saucelabs";
          String actualUrl= driver.getCurrentUrl();
          Assert.assertFalse("Wrong Url",expectedUrl.equals(actualUrl));



    }


    @Test
    public void testLinkedinLink() throws InterruptedException {



          productsPage.clickOnLinkedInLink();
          Thread.sleep(4000);
          String expectedUrl="https://www.linkedin.com/authwall?trk=bf&trkInfo=AQHmCnisIXm4AgAAAYZMdEoYSTr-oNkcPAVS3llj-xbCK-vl9cmQ3cY_7lroB-SoJbtWgoY5Urh2EiB93b3RZwm6z-lZApL99zNTB3caNgAm5OMwRUU0eCd4LwFnXDmK8SY-BYE=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
          String actualUrl=driver.getCurrentUrl();
          Assert.assertFalse("Wrong Url",expectedUrl.equals(actualUrl));


    }
}








