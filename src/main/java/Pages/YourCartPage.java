package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {




        public WebDriver driver;



        public static By checkoutButton=By.id("checkout");






        public YourCartPage(WebDriver driver){
            this.driver=driver;
        }



        public void clickOnCheckoutButton(){
            driver.findElement(checkoutButton).click();
        }

    }


















