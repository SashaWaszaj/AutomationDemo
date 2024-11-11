package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By transactionsLocator = By.cssSelector(".table-padded tbody .cell-with-media span");
    private By menuItemsLocator = By.cssSelector(".has-sub-menu span");
    private By userNameInfo = By.cssSelector(".logged-user-name");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getUserName(){
        return driver.findElement(userNameInfo).getText();
    }

    public List<String> getTransactionItems(){
        var menuWebElement = driver.findElements(transactionsLocator);
        List<String> transactionItems = new ArrayList<>();
        for(WebElement transactionItem : menuWebElement){
            transactionItems.add(transactionItem.getText());
        }
        return transactionItems;
    }

    public List<String> getMenuItems(){
        var menuWebElement = driver.findElements(menuItemsLocator);
        List<String> menuItems = new ArrayList<>();
        for(WebElement menuItem : menuWebElement){
            menuItems.add(menuItem.getText());
        }
        return menuItems;
    }
}
