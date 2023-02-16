package TestingPages;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.LogInPage;

public class LogInPageTest extends BaseTest {






     LogInPage loginpage=new LogInPage(driver);



    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLogInWithWrongUserNameAndPassword() throws InterruptedException {
        loginpage.enterUserName("Jelena");
        loginpage.enterPassword("Djekic");
        loginpage.clickOnLogInButton();
        String curentUrl=driver.getCurrentUrl();
        String actualUrl="https://www.saucedemo.com/inventory.html";
        Assert.assertFalse("Epic sadface: Username and password do not match any user in this service",curentUrl.equals(actualUrl));
        Thread.sleep(7000);

    }

    @Test
    public void testLogInWithValidUsernameWrondPassword() throws InterruptedException {

        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("Djekic");
        loginpage.clickOnLogInButton();
        String curentUrl=driver.getCurrentUrl();
        String actualUrl="https://www.saucedemo.com/inventory.html";
        Assert.assertFalse("Epic sadface: Username and password do not match any user in this service",curentUrl.equals(actualUrl));
        Thread.sleep(7000);
    }

    @Test
    public void testLogInWithWrongUserNameAndValidPasswordEntered() throws InterruptedException{
        loginpage.enterUserName("Jelena Djekic");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertFalse("Epic sadface: Username and password do not match any user in this service",curentURL.equals(actualURL));
        Thread.sleep(7000);
    }

    @Test
    public void testLogInWithEmptyDataEntered() throws InterruptedException{
        loginpage.enterUserName("");
        loginpage.enterPassword("");
        loginpage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertFalse("Epic sadface: Username is required",curentURL.equals(actualURL));
        Thread.sleep(7000);
    }

    @Test
    public void testLogInWithValidUsernameAndPassword() throws InterruptedException {

        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service",curentURL.equals(actualURL));
        Thread.sleep(7000);



    }

}
