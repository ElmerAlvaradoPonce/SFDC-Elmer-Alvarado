package Pages;

import Framework.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import java.util.LinkedList;
import java.util.Set;


/**
 * Created by AutomationUser on 8/7/2015.
 */
public class BasicPage
{
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasicPage()
    {
        this.driver = WebDriverManager.getInstance().getDriver();
        this.wait = WebDriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }

    protected void switchToSecondBrowser()
    {
        Set<String> setWindows = driver.getWindowHandles();
        LinkedList<String> listWindows = new LinkedList<String>(setWindows);
        driver.switchTo().window(listWindows.getLast());
    }

    protected void confirmAlert()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    protected void deniedAlert()
    {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}
