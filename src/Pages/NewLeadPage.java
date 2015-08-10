package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class NewLeadPage extends BasicPage
{
    private String firstNameId = "name_firstlea2";
    private String lastNameId = "name_lastlea2";
    private String companyId = "lea3";
    private String leadStatusId = "lea13";
    private String saveId = "save";
    private String sicCodeXpath = "//*[contains(text(),'SIC Code')]/parent::*/following-sibling::*[1]//input[@type='text']";
    private String lookupClass = "lookupIcon";

    public NewLeadPage setFirstName(String firstName)
    {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(firstNameId))));
        driver.findElement(By.id(firstNameId)).sendKeys(firstName);
        return this;
    }

    public NewLeadPage setLastName(String lastName)
    {
        driver.findElement(By.id(lastNameId)).sendKeys(lastName);
        return this;
    }

    public NewLeadPage setCompany(String company)
    {
        driver.findElement(By.id(companyId)).sendKeys(company);
        return this;
    }

    public NewLeadPage selectLeadStatus(String lead)
    {
        Select leadStatusDropDown = new Select(driver.findElement(By.id(leadStatusId)));
        leadStatusDropDown.selectByVisibleText(lead);
        return this;
    }

    public NewLeadPage clickSave()
    {
        driver.findElement(By.name(saveId)).click();
        return this;
    }

    public NewLeadPage setSicCode(String code)
    {
        WebElement sicCodeElement = driver.findElement(By.xpath(sicCodeXpath));
        wait.until(ExpectedConditions.visibilityOf(sicCodeElement));

        Actions action = new Actions(driver);
        action.moveToElement(sicCodeElement).build().perform();
        sicCodeElement.sendKeys(code);
        return this;
    }

    public LookupPage clickLookup()
    {
        driver.findElement(By.className(lookupClass)).click();
        return new LookupPage();
    }
}
