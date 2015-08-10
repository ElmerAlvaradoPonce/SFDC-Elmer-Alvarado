package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;
import java.util.Set;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class LookupPage extends BasicPage
{
    private String searchTextFieldId = "lksrch";
    private String goButtonName = "go";

    private String searchFrameId =  "searchFrame";
    private String resultsFrameId =  "resultsFrame";

    public LookupPage()
    {

    }

    public LookupPage setSearch(String value)
    {
        this.switchToSecondBrowser();
        driver.switchTo().frame(searchFrameId);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(searchTextFieldId)));
        driver.findElement(By.id(searchTextFieldId)).sendKeys(value);
        return this;
    }

    public LookupPage clickGo()
    {
        driver.findElement(By.name(goButtonName)).click();
        return this;
    }

    public void clickSearchResult()
    {
        driver.switchTo().frame(resultsFrameId);
        //
        driver.switchTo().defaultContent();
    }
}
