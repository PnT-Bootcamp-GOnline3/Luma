import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{

    @Test
    public void test1() {
        startHomePage()
                .navigateToLogin()
                .loginToAccount();
    }

}
