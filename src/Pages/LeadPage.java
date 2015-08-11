package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class LeadPage extends BasicPage
{
    private final String newName = "new";
    private final String createNewViewText = "Create New View";

    @FindBy(name = newName) private WebElement newButton;
    @FindBy(linkText = createNewViewText) private WebElement createNewViewLink;

    public NewLeadPage clickNew()
    {
        newButton.click();
        return new NewLeadPage();
    }

    public CreateNewViewPage clickCreateNewView()
    {
        createNewViewLink.click();
        return new CreateNewViewPage();
    }
}
