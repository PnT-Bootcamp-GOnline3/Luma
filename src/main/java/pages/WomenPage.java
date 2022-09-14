package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WomenPage {

    static WebDriver driver;
    private static final String URL = "https://magento.softwaretestingboard.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='ui-id-3']/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='option-label-size-143-item-168']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='option-label-color-93-item-49']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='qty']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='qty']")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='product-addtocart-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='top-cart-btn-checkout']")).click();
        Thread.sleep(2000);
        driver.navigate().to(URL);
        Thread.sleep(2000);
        driver.quit();

    }


}
