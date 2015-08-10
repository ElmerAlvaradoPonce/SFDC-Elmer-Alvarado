package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by AutomationUser on 8/8/2015.
 */
public class TopMenuBar extends BasicPage
{
    private String leadLinkText ="Leads";
    private String accountLinkText = "Accounts";
    private String opportunitiesLinkText = "Opportunities";

    private String userNameId = "userNavButton";
    private String logoutText = "Logout";


    public LeadPage Leads()
    {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LeadId)));
        WebElement leadLink = driver.findElement(By.linkText(leadLinkText));
        wait.until(ExpectedConditions.elementToBeClickable(leadLink));
        leadLink.click();
        return new LeadPage();
    }

    public AccountPage Accounts()
    {
        WebElement accountMenu = driver.findElement(By.linkText(accountLinkText));
        wait.until(ExpectedConditions.visibilityOf(accountMenu));
        accountMenu.click();
        return new AccountPage();
    }

    public OpportunityPage Opportunities()
    {
        WebElement opportunitiesMenu = driver.findElement(By.linkText(opportunitiesLinkText));
        wait.until(ExpectedConditions.visibilityOf(opportunitiesMenu));
        opportunitiesMenu.click();
        return new OpportunityPage();
    }

    public void clickUserName()
    {
        driver.findElement(By.id(userNameId)).click();
    }

    public void clickLogout()
    {
        driver.findElement(By.linkText(logoutText)).click();
    }

    public void closeBrowser()
    {
        //driver.close(); Close a single Browser
        driver.quit(); // End the Whole
    }
}
