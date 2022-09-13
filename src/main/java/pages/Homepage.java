package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static browser.Browser.driver;

public class Homepage {

    @FindBy(id = "ui-id-3")
    private WebElement whatsNew;

    @FindBy(id = "ui-id-4")
    private WebElement womenLink;

    @FindBy(linkText = "Jackets")
    private WebElement jackets;

    @FindBy(id = "ui-id-9")
    private WebElement topsLink;


    public WhatsNewPage clickOnWhatsNew() {
        whatsNew.click();
        return PageFactory.initElements(driver, WhatsNewPage.class);
    }

    public WomenPage navigateToWomenPage() {
        womenLink.click();
        return PageFactory.initElements(driver,WomenPage.class);
    }

    public TopsPage navigateToTopsPage(){
        WebElement women = driver.findElement(By.id("ui-id-4"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women);
        WebElement tops = driver.findElement(By.id("ui-id-9"));
        actions.moveToElement(tops);
        actions.click().build().perform();
        return PageFactory.initElements(driver, TopsPage.class);
    }


    public HoodiesAndSweatshirtsPage navigateToHoodiesAndSweatshirtsPage(){
        Actions actions = new Actions(driver);
        WebElement women = driver.findElement(By.id("ui-id-4"));
        actions.moveToElement(women).perform();
        WebElement tops = driver.findElement(By.id("ui-id-9"));
        actions.moveToElement(tops).perform();
        WebElement hoodiesAndSweatshirts = driver.findElement(By.id("ui-id-12"));
        Assert.assertTrue(hoodiesAndSweatshirts.isDisplayed());
        return PageFactory.initElements(driver, HoodiesAndSweatshirtsPage.class);
    }


    public AetherGymPantPage navigateToAetherGymPant(){
        driver.findElement(By.id("search")).sendKeys("pant");
        driver.findElement(By.id("qs-option-0")).click();
        List<WebElement> headerLinks=driver.findElements(By.partialLinkText("Aether Gym Pa"));
        boolean isPresent=false;
        for(WebElement headerLink: headerLinks){
            if(headerLink.getText().equals("Aether Gym Pant"));
            isPresent=true;
        }

        if(isPresent==false){
            driver.findElement(By.className("action  ")).click();
        }
        headerLinks=driver.findElements(By.className("base"));
        return PageFactory.initElements(driver, AetherGymPantPage.class);
    }


}
