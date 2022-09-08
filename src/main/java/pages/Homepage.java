package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    @FindBy(id = "ui-id-3")
    private WebElement whatsNew;

    @FindBy(id = "ui-id-4")
    private WebElement womenLink;

    @FindBy(linkText = "Jackets")
    private WebElement jackets;

    public WhatsNewPage clickOnWhatsNew() {
        whatsNew.click();
        return PageFactory.initElements(Browser.driver, WhatsNewPage.class);
    }

    public WomenPage navigateToWomenPage() {
        womenLink.click();
        return PageFactory.initElements(Browser.driver,WomenPage.class);
    }
}
