package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {



    public WebDriver driver;





    public static By firstNameInputField=By.id("first-name");
    public static By lastNameInputField=By.id("last-name");
    public static By postalCodeInputField=By.id("postal-code");
    public static By continueButton=By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver =driver;
    }




    public void enterFirstName(String textToEnterToUserNameField){
        driver.findElement(firstNameInputField).sendKeys(textToEnterToUserNameField);
    }


    public void enterLastName(String textToEnterToPasswordInputField){
        driver.findElement(lastNameInputField).sendKeys(textToEnterToPasswordInputField);
    }


     public void enterPostalCodeInputField(String textToEnterToPostalCodeInputField){

        driver.findElement(postalCodeInputField).sendKeys(textToEnterToPostalCodeInputField);
     }

    public void clickOnContinueButton(){

        driver.findElement(continueButton).click();

    }











}
