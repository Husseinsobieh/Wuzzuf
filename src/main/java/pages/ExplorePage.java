package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExplorePage {
    private WebDriver driver;
    private By profileIcon = By.xpath("//header/div/div[2]/div[2]/div");
    private By popperAccountName = By.xpath("//div[@data-popper-reference-hidden='false']/div/div/div/a[2]/span");

    public ExplorePage(WebDriver driver){
        this.driver = driver;
    }
}
