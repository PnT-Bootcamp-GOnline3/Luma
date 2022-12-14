import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = TestListener.class)
public class HomepageTest extends BaseTest{

    @Test
    public void test1() {
        startHomePage()
                .navigateToLogin()
                .loginToAccount();
    }
    
    @Test
    public void myAccountTest(){

        startHomePage()
                .navigateToLogin()
                .loginToAccount()
                .addToHoodiesCart()
                .selectHoodies(2,3)//We specify numbers of stuff we want to add to cart
                .fileSave();

    }

    /* Subscribe to the newsletter */
    @Test
    public void test30() {
        startHomePage()
                .subscribeToNewsletter("pntbootcamp@gmail.com");
    }

    /*
    Navigate to What's New page.
    Navigate to Men Pants Page.
    Find "Thorpe Track Pant" and click on it.
     */
    @Test
    public void test912() {
        startHomePage()
                .navigateToWhatsNewPage()
                .navigateToMenPantsPage()
                .selectAnItem("Thorpe Track Pant");
    }

    /*
    Confirming that it actually navigated to the Men pants page
    by Asserting the page title
    */
    @Test
    public void test913() {
        startHomePage()
                .navigateToWhatsNewPage()
                .navigateToMenPantsPage()
                .assertPageTitle();
    }
}
