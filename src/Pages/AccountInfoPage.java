package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class AccountInfoPage extends BasicPage
{
    private final String deleteName = "delete";

    @FindBy(name = deleteName) private WebElement deleteButton;

    public AccountPage clickDelete()
    {
        deleteButton.click();
        this.confirmAlert();
        return new AccountPage();
    }
}