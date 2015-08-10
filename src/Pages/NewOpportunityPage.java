package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class NewOpportunityPage extends BasicPage
{
    private String opportunityId = "opp3";
    private String stageId = "opp11";
    private String closeDateId = "opp9";
    private String saveName = "save";

    public NewOpportunityPage setOpportunity(String value)
    {
        driver.findElement(By.id(opportunityId)).sendKeys(value);
        return this;
    }

    public NewOpportunityPage selectStage(String value)
    {

        Select stageDropDown =  new Select(driver.findElement(By.id(stageId)));
        stageDropDown.selectByVisibleText(value);
        return this;
    }

    public NewOpportunityPage setCloseDate(String value)
    {
        driver.findElement(By.id(closeDateId)).sendKeys(value);
        return this;
    }

    public OpportunityInfoPage clickSave()
    {
        driver.findElement(By.name(saveName)).click();
        return new OpportunityInfoPage();
    }

}
