package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static browser.Browser.driver;

public class CartPage {


    List<WebElement> items = driver.findElements(By.cssSelector("strong[class='product-item-name']"));

    //I wanted to add quantity to the file(we will do it if we have time)
    List<WebElement> qty = driver.findElements(By.cssSelector("input[class='input-text qty']"));


    public CartPage fileSave(){

        //System.out.println();

        try {
            FileWriter myWriter = new FileWriter("src/main/java/myFiles/filename.txt");

            for(int i=2; i< items.size(); i++) {
                myWriter.write(items.get(i).getText() + "\t" + "with Quantity: " + qty.get(i - 2).getAttribute("value"));
                myWriter.write(" " + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return  this;
    }

}

