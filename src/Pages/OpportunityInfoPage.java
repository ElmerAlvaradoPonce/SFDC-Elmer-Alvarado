package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class OpportunityInfoPage extends BasicPage
{
    private String opportunityNameId = "opp3_ileinner";
    private String accountNameId = "opp4_ileinner";
    private String closeDateId = "opp9_ileinner";
    private String stageId = "opp11_ileinner";
    private String deleteName = "del";

    public String getOpportunityName()
    {
        return driver.findElement(By.id(opportunityNameId)).getText();
    }

    public String getAccountName()
    {
        return driver.findElement(By.id(accountNameId)).getText();
    }

    public String getCloseDate()
    {
        return driver.findElement(By.id(closeDateId)).getText();
    }

    public String getState()
    {
        return driver.findElement(By.id(stageId)).getText();
    }

    public OpportunityPage clickDelete()
    {
        WebElement deleteButton = driver.findElement(By.name(deleteName));
        wait.until(ExpectedConditions.visibilityOf(deleteButton));
        deleteButton.click();
        this.confirmAlert();
        return new OpportunityPage();
    }
}
