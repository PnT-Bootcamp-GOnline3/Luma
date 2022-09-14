import org.testng.annotations.Test;

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

}
