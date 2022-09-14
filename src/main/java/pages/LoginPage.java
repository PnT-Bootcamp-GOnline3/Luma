package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email") private WebElement eMail;
    @FindBy (id = "pass") private WebElement password;
    @FindBy (id = "send2") private WebElement signinButton;

    public MyAccountPage loginToAccount(){ // Login to the website using information in Info
        eMail.sendKeys(Info.EMAIL);
        password.sendKeys(Info.PASSWORD);
        signinButton.click();
        return PageFactory.initElements(Browser.driver, MyAccountPage.class);
    }

}
