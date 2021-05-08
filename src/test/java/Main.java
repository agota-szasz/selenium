import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");

        AddToWishlistTest wishlistTest = new AddToWishlistTest(driver);
        wishlistTest.addToWishlist();

        RegisterTest register = new RegisterTest(driver);
        register.register("Agota","Szasz","szaszagota@yahoo.com","q1w2e3r4");


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }



}

