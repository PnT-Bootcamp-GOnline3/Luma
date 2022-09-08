import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test
    public void Test1() {
        startHomePage()
                .navigateToWomenPage();
    }

}
