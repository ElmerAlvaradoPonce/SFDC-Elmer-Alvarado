package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class OpportunityPage extends BasicPage
{
    private String newButtonName = "new";

    public NewOpportunityPage clickNew()
    {
        WebElement newButton = driver.findElement(By.name(newButtonName));
        wait.until(ExpectedConditions.visibilityOf(newButton));
        newButton.click();
        return new NewOpportunityPage();
    }

    public OpportunityInfoPage clickOpportunity(String opportunity)
    {
        driver.findElement(By.linkText(opportunity)).click();
        return new OpportunityInfoPage();
    }
}
