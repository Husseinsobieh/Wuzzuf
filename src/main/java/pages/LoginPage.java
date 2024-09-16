package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.cssSelector("input[name='email']");
    private By passwordInput = By.cssSelector("input[name='password']");
    private By signInButton  = By.xpath("//button[text()='Sign in']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public ExplorePage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new ExplorePage(driver);
    }
}
