package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By loginButton = By.linkText("Log in");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLogin(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
    public SignupPage clickGetStarted(){
        driver.findElement(By.linkText("Get Started")).click();
        return new SignupPage(driver);
    }
    public Boolean checkPresenceOfLoginButton(){
        return driver.findElement(loginButton).isDisplayed();
    }
}
