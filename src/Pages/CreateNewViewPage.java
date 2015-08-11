package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class CreateNewViewPage extends BasicPage
{
    private final String availableFieldsId = "colselector_select_0";
    private final String addAvailableId = "colselector_select_0_right";

    @FindBy(id = availableFieldsId ) private WebElement availableListBox;
    @FindBy(id = addAvailableId ) private WebElement addAvailableButton;

    public CreateNewViewPage selectAvailableFields(String value)
    {
        Select availableDropDown =  new Select(availableListBox);
        availableDropDown.selectByVisibleText(value);
        return this;
    }

    public CreateNewViewPage clickAddAvailableFields()
    {
        addAvailableButton.click();
        return this;
    }
}
