package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class AccountPage extends BasicPage
{
    private final String newButtonName="new";

    @FindBy(name = newButtonName) private WebElement newButton;
    public NewAccountPage clickNew()
    {
        wait.until(ExpectedConditions.visibilityOf(newButton));
        newButton.click();
        return new NewAccountPage();
    }

    public AccountInfoPage clickAccount(String account)
    {
        driver.findElement(By.linkText(account)).click();
        return new AccountInfoPage();
    }
}
