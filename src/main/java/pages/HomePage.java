package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLogin(){
        driver.findElement(By.linkText("Log in")).click();
        return new LoginPage(driver);
    }
    public SignupPage clickGetStarted(){
        driver.findElement(By.linkText("Get Started")).click();
        return new SignupPage(driver);
    }
}
