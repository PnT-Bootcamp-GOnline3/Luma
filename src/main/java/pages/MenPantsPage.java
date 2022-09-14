package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class MenPantsPage {

    WebDriver driver = Browser.driver;

    // Asserting the page title
    public MenPantsPage assertPageTitle() {
        Assert.assertEquals(driver.getTitle(),"Pants - Bottoms - Men Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        return this;
    }

    // Selecting an item
    public ThorpeTrackPantPage selectAnItem(String itemName) {
        List<WebElement> itemsList = driver.findElements(By.cssSelector("strong[class='product name product-item-name']>a"));
        for (WebElement item : itemsList) {
            if (item.getText().equals(itemName)) {
                item.click();
            }
        }
        return PageFactory.initElements(driver,ThorpeTrackPantPage.class);
    }
}
