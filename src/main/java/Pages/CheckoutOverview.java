package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverview {

    public  WebDriver driver;






    public static By FinishButton=By.xpath("//*[@data-test='finish']");

    public CheckoutOverview(WebDriver driver) {

        this.driver =driver;

    }


    public void clickOnFinishButton(){

        driver.findElement(FinishButton).click();
    }




}







