import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

    WebDriver driver;

    public RegisterTest(WebDriver driver) {
        this.driver = driver;
    }

    public void register(String firstname, String lastname, String email, String password) {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("email_address")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmation")).sendKeys(password);
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();

    }
}

