package TestScripts;

import Pages.LoginPage;
import Pages.TopMenuBar;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class BaseTestCase
{
    private LoginPage loginPage;
    protected TopMenuBar topMenuBar;
    private String userName = "elmer.al26@gmail.com";
    private String password = "password123";

    public BaseTestCase()
    {
        loginPage = new LoginPage();
        topMenuBar = new TopMenuBar();
    }

    @BeforeClass
    public void Login()
    {
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @AfterClass
    public void Logout()
    {
        topMenuBar.clickUserName();
        topMenuBar.clickLogout();
        topMenuBar.closeBrowser();
    }
}
