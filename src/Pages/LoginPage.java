package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by AutomationUser on 8/7/2015.
 */
public class LoginPage extends BasicPage
{
    private String userNameId = "username";
    private String passwordId = "password";
    private String loginButtonId = "Login";

    public void setUserName(String userName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(userNameId)) );
        this.driver.findElement(By.id(userNameId)).sendKeys(userName);
    }

    public void setPassword(String password)
    {
        driver.findElement(By.id(passwordId)).sendKeys(password);
    }

    public void clickLogin()
    {
        driver.findElement(By.id(loginButtonId)).click();
    }

    public void Login(String user, String password)
    {
        this.setUserName(user);
        this.setPassword(password);
        this.clickLogin();
    }
}
