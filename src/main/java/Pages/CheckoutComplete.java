package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutComplete {


    public  WebDriver driver;




    public static By MessageOnThePage=By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']");




    public CheckoutComplete(WebDriver driver)
    {
        this.driver=driver;
    }


    public  String getMessageText(){

        return driver.findElement(MessageOnThePage).getText();
    }



}



