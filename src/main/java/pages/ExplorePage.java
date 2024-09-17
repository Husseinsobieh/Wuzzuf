package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplorePage {
    private WebDriver driver;
    private By profileIcon = By.xpath("//header/div/div[2]/div[2]/div");
    private By popperAccountName = By.xpath("//div[@data-popper-reference-hidden='false']/div/div/div/a[2]/span");
    private By searchBar = By.cssSelector("input[name='q']");
    private By searchButton = By.xpath("//input[@name='q']/../../button");
    private By logoutButton = By.linkText("Logout");
    private int waitingTime = 15;


    public ExplorePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickProfileIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(profileIcon));
        driver.findElement(profileIcon).click();
    }
    public String getAccountName(){
        return driver.findElement(popperAccountName).getText();
    }
    public HomePage clickLogout(){
        driver.findElement(logoutButton).click();
        return new HomePage(driver);
    }
    public void setSearchBar(String searchItem){
        driver.findElement(searchBar).sendKeys(searchItem);
        driver.findElement(searchButton).click();
    }
}
