import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{

    @Test
    public void Test1() {
        startHomePage()
                .navigateToWomenPage();
    }

}
