package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static browser.Browser.driver;

public class AddToCartPage {

    //These are for the hoodies
    List<WebElement> sweatshirtSmall = driver.findElements(By.id("option-label-size-143-item-167"));
    List<WebElement> sweatshirtGreen = driver.findElements(By.id("option-label-color-93-item-53"));
    List<WebElement> addCarts = driver.findElements(By.cssSelector("button[title=\"Add to Cart\"]"));

    //These are for the second Hoodies
    List<WebElement>  sweatshirtLarg = driver.findElements(By.id("option-label-size-143-item-169"));
    List<WebElement> sweatshirtRed = driver.findElements(By.id("option-label-color-93-item-58"));

    @FindBy(css="a[class='action showcart']") private WebElement cartLink;
    @FindBy(linkText = "View and Edit Cart") private WebElement viewCart;


    public CartPage selectHoodies(int num1, int num2){

        Actions actions = new Actions(driver);

        //I did a loop to go over as many times as we select number we add
        for(int i=0; i <= num1; i++) {

            actions.moveToElement(sweatshirtSmall.get(1));
            actions.click().build().perform();

            actions.moveToElement(sweatshirtGreen.get(1));
            actions.click().build().perform();

            //added the sleep time to wait between add product
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actions.moveToElement(addCarts.get(1));
            actions.click().build().perform();

        }

        //we are going to go over another shirt
        for(int i=0; i <= num2; i++) {

            actions.moveToElement(sweatshirtLarg.get(3));
            actions.click().build().perform();

            actions.moveToElement(sweatshirtRed.get(2));
            actions.click().build().perform();

            //added the sleep time to wait between add product
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actions.moveToElement(addCarts.get(3));
            actions.click().build().perform();
        }
        cartLink.click();
        viewCart.click();
        return PageFactory.initElements(Browser.driver, CartPage.class);
    }

}