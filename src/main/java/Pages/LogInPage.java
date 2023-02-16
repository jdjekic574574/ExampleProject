package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;

    public  By userNameInputField=By.xpath("//input[@placeholder='Username']");

    public static By passwordInputField=By.xpath("//input[@name='password']");

    public By logInButton = By.id("login-button");




    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String textToEnterToUserNameInputField) {
        driver.findElement(userNameInputField).sendKeys(textToEnterToUserNameInputField);
    }

    public void enterPassword(String textToEnterToPasswordInputField) {
        driver.findElement(passwordInputField).sendKeys(textToEnterToPasswordInputField);
    }

    public void clickOnLogInButton() {
        driver.findElement(logInButton).click();
    }



}


