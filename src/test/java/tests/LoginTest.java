package tests;

import LoginDemoAppiTools.Login;
import Pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccesfulLogin(){
        driver.get("https://demo.applitools.com/");

        Login login = new Login(driver);
        login.setUserName("sasha");
        login.setPassword("sasha123");
        HomePage homePage = login.clickLoginButtonWithValidCredentials();

        assertEquals("Jack Gomez", homePage.getUserName());
        assertEquals("https://demo.applitools.com/app.html", driver.getCurrentUrl());

    }
}
