package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class NewOpportunityPage extends BasicPage
{
    private final String opportunityId = "opp3";
    private final String stageId = "opp11";
    private final String closeDateId = "opp9";
    private final String saveName = "save";
    private final String lookupClass   = "lookupIcon";


    @FindBy(id = opportunityId) private WebElement opportunityTextField;
    @FindBy(id = stageId) private WebElement stageDropdown;
    @FindBy(id = closeDateId) private WebElement closeDateTextField;
    @FindBy(name = saveName) private WebElement saveButton;
    @FindBy(className = lookupClass) private WebElement lookupButton;

    public NewOpportunityPage setOpportunity(String value)
    {
        opportunityTextField.sendKeys(value);
        return this;
    }

    public NewOpportunityPage selectStage(String value)
    {
        Select stageDropDown =  new Select(stageDropdown);
        stageDropDown.selectByVisibleText(value);
        return this;
    }

    public NewOpportunityPage setCloseDate(String value)
    {
        closeDateTextField.sendKeys(value);
        return this;
    }

    public OpportunityInfoPage clickSave()
    {
        saveButton.click();
        return new OpportunityInfoPage();
    }

    public LookupPage clickLookup()
    {
        lookupButton.click();
        return new LookupPage();
    }
}
