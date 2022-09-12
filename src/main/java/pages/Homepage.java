package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    
    WebDriver driver = Browser.driver;

    @FindBy(id = "ui-id-3")
    private WebElement whatsNew;

    @FindBy(id = "ui-id-4")
    private WebElement womenLink;

    @FindBy(linkText = "Jackets")
    private WebElement jackets;

    @FindBy(linkText = "Create an Account")
    private WebElement createAccount; // the link to click and go to Create an Account.

    @FindBy(linkText = "Sign In")
    private WebElement signin; // the link to click and go to signin(login)page.

    public WhatsNewPage navigateToWhatsNewPage() {
        whatsNew.click();
        return PageFactory.initElements(Browser.driver, WhatsNewPage.class);
    }

    public WomenPage navigateToWomenPage() {
        womenLink.click();
        return PageFactory.initElements(Browser.driver,WomenPage.class);
    }

    // to navigate to sign in page
    public LoginPage navigateToLogin(){
        signin.click();
        return PageFactory.initElements(Browser.driver, LoginPage.class);
    }

    // This methode is to navigate to Create an Account
    public CreateAnAccountPage navigateToCreateAccount(){
        createAccount.click();
        return PageFactory.initElements(Browser.driver, CreateAnAccountPage.class);
    }
}
