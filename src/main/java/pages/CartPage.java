package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static browser.Browser.driver;

public class CartPage {


    List<WebElement> items = driver.findElements(By.cssSelector("strong[class='product-item-name']"));

    public CartPage fileSave(){
        
        String[] array = new String[items.size()-2];
        
        int i = 2;
        for (WebElement row : items) {                
            array[i] = row.getText();
            i++;
        }
        for(int j = 0; i<items.size()-1; j++) {
            System.out.println(array[j]);
        }
        return  this;
    }

}
