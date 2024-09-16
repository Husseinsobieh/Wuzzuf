package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ExplorePage;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Test
    public void testValidLogin(){
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail("fegeba7870@heweek.com");
        loginPage.setPassword("testAutomation123");
        ExplorePage explorePage = loginPage.clickSignInButton();

    }
}
