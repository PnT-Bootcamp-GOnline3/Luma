package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {

    @FindBy(id = "firstname")
    private WebElement firstname; //to add the firstname.

    @FindBy(id = "lastname")
    private WebElement lastname; //to add the lastname.

    @FindBy(id = "email_address")
    private WebElement email; //to add the e-mail.

    @FindBy(id = "password")
    private WebElement password; //to add the password.

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirmation; //to confirmation the password.

    @FindBy(css = "button[class='action submit primary']")
    private WebElement submitButton;

    public AccountPage addAnUser(String uName, String lName, String e_mail, String pssWord){
        firstname.sendKeys(uName);
        lastname.sendKeys(lName);
        email.sendKeys(e_mail);
        password.sendKeys(pssWord);
        passwordConfirmation.sendKeys(pssWord);

        submitButton.click();

        return PageFactory.initElements(Browser.driver, AccountPage.class);
    }

}
