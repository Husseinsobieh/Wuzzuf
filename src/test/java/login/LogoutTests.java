package login;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExplorePage;
import pages.LoginPage;

public class LogoutTests extends BaseTests {
    @Test
    public void testLogout(){
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail("fegeba7870@heweek.com");
        loginPage.setPassword("testAutomation123");
        ExplorePage explorePage = loginPage.clickSignInButton();
        explorePage.clickProfileIcon();
        homePage = explorePage.clickLogout();
        Assert.assertTrue(homePage.checkPresenceOfLoginButton(), "logout failed");
    }
}
