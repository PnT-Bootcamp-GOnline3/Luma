package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static browser.Browser.driver;

public class MyAccountPage {

    @FindBy(id="ui-id-5") private WebElement menButton;
    @FindBy(id="ui-id-17") private WebElement topsLink;


    @FindBy(id="ui-id-20") private WebElement hoodiesLink;


    @FindBy(id="ui-id-18") private WebElement bottomsLink;
    @FindBy(id="ui-id-24") private WebElement shortsLink;

    public AddToCartPage addToHoodiesCart(){

        Actions actions = new Actions(driver);
        actions.moveToElement(menButton);
        actions.moveToElement(topsLink);
        actions.moveToElement(hoodiesLink);
        actions.click().build().perform();

        return PageFactory.initElements(Browser.driver, AddToCartPage.class);
    }





}
