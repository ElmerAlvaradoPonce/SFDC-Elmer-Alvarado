package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by AutomationUser on 8/7/2015.
 */
public class WebDriverManager
{
    private WebDriver driver;
    private WebDriverWait wait;
    private static WebDriverManager instance;
    private String baseUrl = "https://login.salesforce.com/";
    private static int TIMEOUT_NORMAL = 15;
    private String browser = "Firefox";

    private static final String FIREFOX = "Firefox";
    private static final String CHROME = "Chrome";
    private static final String IE = "IE";
    private static final String SAFARI = "Safari";

    private WebDriverManager()
    {
        initializeDriver();
        startPage();
    }

    public static WebDriverManager getInstance()
    {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initializeDriver()
    {
        if(browser.equalsIgnoreCase(FIREFOX))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase(CHROME))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase(IE))
        {
            driver = new InternetExplorerDriver();
        }
        else if (browser.equalsIgnoreCase(SAFARI))
        {
            driver = new SafariDriver();
        }

        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, TIMEOUT_NORMAL);
    }

    private void startPage()
    {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public void setBaseUrl(String baseUrl)
    {
        this.baseUrl = baseUrl;
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public WebDriverWait getWait()
    {
        return wait;
    }
}
