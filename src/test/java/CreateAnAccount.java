import org.testng.annotations.Test;

// We will create a separate test page for creating an account
public class CreateAnAccount extends BaseTest {

    @Test
    public void test01(){
        startHomePage()
                .navigateToCreateAccount()
                .addAnUser("PnT", "Student", "PnTStudent@email.com", "Qwerty123@");
                //Use other string if you want to try this test because this user is already created.
    }

}
