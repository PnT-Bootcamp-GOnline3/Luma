import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{
    
    @Test
    public void Test1() {
        startHomePage()
                .navigateToWomenPage();
    }

    @Test
    public void Test2() {
        startHomePage().navigateToTopsPage();
    }

    @Test
    public void Test3() {
        startHomePage().navigateToHoodiesAndSweatshirtsPage();
    }

    @Test
    public void Test4() {
        startHomePage().navigateToAetherGymPant();
    }



}
