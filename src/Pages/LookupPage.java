package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;
import java.util.Set;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class LookupPage extends BasicPage
{
    private final String searchTextFieldId = "lksrch";
    private final String goButtonName = "go";

    private String searchFrameId =  "searchFrame";
    private String resultsFrameId =  "resultsFrame";

    private String contentId;

    @FindBy(id = searchTextFieldId) @CacheLookup private WebElement searchTextField;
    @FindBy(name = goButtonName) private WebElement goButton;

    public LookupPage()
    {
        contentId = driver.getWindowHandle();
        this.switchToSecondBrowser();
    }

    public LookupPage setSearch(String value)
    {
        driver.switchTo().frame(searchFrameId);
        wait.until(ExpectedConditions.visibilityOf(searchTextField));
        searchTextField.sendKeys(value);
        return this;
    }

    public LookupPage clickGo()
    {
        goButton.click();
        return this;
    }

    public void clickSearchResult(String value)
    {
        driver.switchTo().frame(resultsFrameId);
        driver.findElement(By.linkText(value)).click();
        driver.switchTo().window(contentId);
    }
}
