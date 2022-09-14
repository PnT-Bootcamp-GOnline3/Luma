import org.testng.annotations.Test;
import pages.WomenPage;

public class WomenPageTest {
    WomenPage wp = new WomenPage();

    @Test
    public void TestAction() {
        try {
            wp.executeAction();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
