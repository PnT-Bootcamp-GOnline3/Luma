package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WhatsNewPage {

    WebDriver driver = Browser.driver;

    // This method will navigate to the Men Pants page
    public MenPantsPage navigateToMenPantsPage() {
        List<WebElement> pantsLinks = driver.findElements(By.linkText("Pants"));
        pantsLinks.get(1).click();
        return PageFactory.initElements(driver,MenPantsPage.class);
    }
}
