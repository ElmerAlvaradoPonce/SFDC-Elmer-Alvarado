package Pages;

import org.openqa.selenium.By;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class LeadPage extends BasicPage
{
    private String newName = "new";
    private String createNewView = "Create New View";

    public NewLeadPage clickNew()
    {
        driver.findElement(By.name(newName)).click();
        return new NewLeadPage();
    }

    public CreateNewViewPage clickCreateNewView()
    {
        driver.findElement(By.linkText(createNewView)).click();
        return new CreateNewViewPage();
    }
}
