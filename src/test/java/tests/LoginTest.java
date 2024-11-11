package tests;

import LoginDemoAppiTools.Login;
import Pages.HomePage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccesfulLogin(){
        driver.get("https://demo.applitools.com/");

        Login login = new Login(driver);
        login.setUserName("Jack");
        login.setPassword("Jack123");
        HomePage homePage = login.clickLoginButtonWithValidCredentials();

        assertEquals("Jack Gomez", homePage.getUserName());
        assertEquals("https://demo.applitools.com/app.html", driver.getCurrentUrl());
    }
}
