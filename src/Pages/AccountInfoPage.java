package Pages;

import org.openqa.selenium.By;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class AccountInfoPage extends BasicPage
{
    private String deleteName = "delete";

    public AccountPage clickDelete()
    {
        driver.findElement(By.name(deleteName)).click();
        this.confirmAlert();
        return new AccountPage();
    }
}