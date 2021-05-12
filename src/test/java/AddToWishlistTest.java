import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class AddToWishlistTest {

    WebDriver driver;

    public AddToWishlistTest(WebDriver driver) {
        this.driver = driver;
    }

    public void addToWishlist() {
        
        login("agota06@yahoo.com", "q1w2e3r4");
        addToWishList();
        logout();

    }

    private void logout() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

    }

    private void addToWishList() {
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

    }

    private void login(String username, String password) {
        WebElement spanLabel = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        assertEquals(spanLabel.getText(), "ACCOUNT");
        spanLabel.click();
        WebElement a = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        assertEquals(a.getText(), "Log In");
        a.click();
        WebElement email = driver.findElement(By.id("email"));
        assertEquals(email.getText(), "");
        email.sendKeys(username);
        WebElement pass = driver.findElement(By.id("pass"));
        assertEquals(pass.getText(), "");
        pass.sendKeys(password);
        WebElement span2 = driver.findElement(By.cssSelector("#send2 > span > span"));
        assertEquals(span2.getText(), "LOGIN");
        span2.click();
    }
}
