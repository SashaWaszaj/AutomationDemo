package LoginDemoAppiTools;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
        private WebDriver driver;

        private By userNameLocator = By.id("username");
        private By passwordLocator = By.id("password");
        private By loginButton = By.id("log-in");

        public Login(WebDriver driver){
            this.driver = driver;
        }

        public void setUserName(String userName){
            driver.findElement(userNameLocator).sendKeys(userName);
        }

        public void setPassword(String password){
            driver.findElement(passwordLocator).sendKeys(password);
        }

        public HomePage clickLoginButtonWithValidCredentials(){
            driver.findElement(loginButton).click();
            return new HomePage(driver);
        }

}



