package Pages;

import org.openqa.selenium.By;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class NewAccountPage extends BasicPage
{
    private String accountNameId = "acc2";
    private String saveName = "save";

    public NewAccountPage setAccountName(String name)
    {
        driver.findElement(By.id(accountNameId)).sendKeys(name);
        return this;
    }

    public AccountInfoPage clickSave()
    {
        driver.findElement(By.name(saveName)).click();
        return new AccountInfoPage();
    }
}
