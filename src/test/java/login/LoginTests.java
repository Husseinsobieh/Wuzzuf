package login;

import base.BaseTests;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExplorePage;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Description("given the user is registered, when I sign in with a valid email and password, then i login successfully")
    @Story("Login")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testValidLogin(){
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail("fegeba7870@heweek.com");
        loginPage.setPassword("testAutomation123");
        ExplorePage explorePage = loginPage.clickSignInButton();
        explorePage.clickProfileIcon();
        System.out.println(explorePage.getAccountName());
        Assert.assertEquals(explorePage.getAccountName(), "Test Automation", "account name incorrect");
    }
}
