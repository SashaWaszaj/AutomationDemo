package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomationEx {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("Admin");

        WebElement userPasswordInput = driver.findElement(By.name("password"));
        userPasswordInput.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();

        driver.quit();
        

        //WebElement myLink = driver.findElement(By.linkText("A/B Testing"));
        //myLink.click();


    }
}
