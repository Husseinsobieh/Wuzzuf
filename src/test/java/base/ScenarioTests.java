package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ExplorePage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class ScenarioTests {
    private WebDriver driver;
    protected HomePage homePage;
    private int waitingTime = 15;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        goHome();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLogin();
        driver.manage().timeouts().getPageLoadTimeout();
        loginPage.setEmail("fegeba7870@heweek.com");
        loginPage.setPassword("testAutomation123");
        ExplorePage explorePage = loginPage.clickSignInButton();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://wuzzuf.net/");
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return options;
    }
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
