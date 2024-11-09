package org.example;

import LoginDemoAppiTools.Login;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        Login login = new Login(driver);
        login.setUserName("sasha");
        login.setPassword("sasha123");
        HomePage homePage = login.clickLoginButtonWithValidCredentials();
        System.out.println("User name is "+ homePage.getUserName());
    }
}