package tests;

import LoginDemoAppiTools.Login;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest extends BaseTest{

    @Test
    public void transactionsAreComplete(){
        driver.get("https://demo.applitools.com/");

        Login login = new Login(driver);
        login.setUserName("Jack");
        login.setPassword("Jack123");
        HomePage homePage = login.clickLoginButtonWithValidCredentials();

        var transactionItems = homePage.getTransactionItems();
        List<String> expectedTransactionItems = Arrays.asList(
                "Starbucks coffee", "Stripe Payment Processing",
                "MailChimp Services", "Shopify product",
                "Ebay Marketplace", "Templates Inc");

        assertEquals(6, transactionItems.size(), "Transaction quantity is not correct");
        assertEquals(transactionItems, expectedTransactionItems, "Transactions are not correct");
    }
    @Test
    public void menuIsComplete(){
        driver.get("https://demo.applitools.com/");

        Login login = new Login(driver);
        login.setUserName("Jack");
        login.setPassword("Jack123");
        HomePage homePage = login.clickLoginButtonWithValidCredentials();

        var menuItems = homePage.getMenuItems();
        List<String> expectedMenuItems = Arrays.asList(
                "Credit cards", "Debit cards",
                "Loans", "Mortgages");

        assertEquals(4, menuItems.size(), "Menu items quantity is not correct");
        assertEquals(menuItems, expectedMenuItems, "Menu items are not correct");
    }

}
