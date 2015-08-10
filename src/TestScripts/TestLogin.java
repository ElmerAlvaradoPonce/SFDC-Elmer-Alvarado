package TestScripts;

/**
 * Created by AutomationUser on 8/8/2015.
 */
import Pages.LoginPage;
import org.testng.annotations.*;

public class TestLogin
{
    private LoginPage loginPage;

    private String userName = "elmer.al26@gmail.com";
    private String password = "password123";

    public TestLogin()
    {
        loginPage = new LoginPage();
    }

    @Test
    public void LoginTc()
    {
        System.out.println("Login");
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }
}
