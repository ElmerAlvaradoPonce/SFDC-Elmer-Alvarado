package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class CreateNewViewPage extends BasicPage
{
    private String availableFieldsId = "colselector_select_0";
    private String addAvailableId = "colselector_select_0_right";

    public CreateNewViewPage selectAvailableFields(String value)
    {
        Select availableDropDown =  new Select(driver.findElement(By.id(availableFieldsId)));
        availableDropDown.selectByVisibleText(value);
        return this;
    }

    public CreateNewViewPage clickAddAvailableFields()
    {
        driver.findElement(By.id(addAvailableId)).click();
        return this;
    }
}
