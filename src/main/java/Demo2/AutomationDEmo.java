package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomationDEmo {
    public static void main(String[] args) {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Enter username
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("sasha");

        // Enter password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("sasha123");

        // Click login button
        WebElement loginButton = driver.findElement(By.id("log-in"));
        loginButton.click();

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Locate and print the current balance
        WebElement currentBalance = driver.findElement(By.cssSelector(".balance-value > span:nth-child(1)"));
        System.out.println("Current Balance: " + currentBalance.getText());

        // Locate and print recent transactions
        List<WebElement> transactions = driver.findElements(By.cssSelector(".table-responsive .table table-padded tbody tr"));

        System.out.println("Recent Transactions:");
        for (WebElement row : transactions) {
            String description = row.findElement(By.cssSelector(".cell-with-media")).getText();
            String status = row.findElement(By.cssSelector(".nowrap")).getText();
            String amount = row.findElement(By.cssSelector(".text-right bolder nowrap")).getText();

            System.out.println("Description: " + description);
            System.out.println("Status: " + status);
            System.out.println("Amount: " + amount);
        }

        // Close the driver
        driver.quit();
    }
}


