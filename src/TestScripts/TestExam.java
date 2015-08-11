package TestScripts;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by AutomationUser on 8/10/2015.
 */
public class TestExam extends BaseTestCase
{
    private String accountName = "AutoAccount01";
    private String opportunityName = "AutoOpportunity01";
    private String closeDate = "8/30/2015";
    private String stateValue = "Prospecting";

    // Pages
    private AccountPage accountPage;
    private NewAccountPage newAccountPage;
    private AccountInfoPage accountInfoPage;
    private OpportunityPage opportunityPage;
    private NewOpportunityPage newOpportunityPage;
    private OpportunityInfoPage opportunityInfoPage;
    private LookupPage lookupPage;

    @BeforeMethod
    public void CreateAccount()
    {
        accountPage = topMenuBar.Accounts();
        newAccountPage = accountPage.clickNew();
        newAccountPage.setAccountName(accountName).clickSave();
    }

    @Test
    public void CreateOpportunities()
    {
        opportunityPage = topMenuBar.Opportunities();
        newOpportunityPage = opportunityPage.clickNew();
        lookupPage = newOpportunityPage.setOpportunity(opportunityName)
                .setCloseDate(closeDate).selectStage(stateValue).clickLookup();

        lookupPage.clickSearchResult(accountName);

        opportunityInfoPage = newOpportunityPage.clickSave();

        String accountNameApp = opportunityInfoPage.getAccountName();
        String opportunityNameApp = opportunityInfoPage.getOpportunityName();
        String closeDateApp = opportunityInfoPage.getCloseDate();
        String stateValueApp = opportunityInfoPage.getState();

        Assert.assertEquals(accountName, accountNameApp);
        Assert.assertEquals(opportunityName, opportunityNameApp);
        Assert.assertEquals(closeDate, closeDateApp);
        Assert.assertEquals(stateValue, stateValueApp);
    }

    @AfterMethod
    public void DeleteAccountOpportunity()
    {
        opportunityPage = topMenuBar.Opportunities();
        opportunityInfoPage = opportunityPage.clickOpportunity(opportunityName);
        opportunityInfoPage.clickDelete();

        accountPage = topMenuBar.Accounts();
        accountInfoPage = accountPage.clickAccount(accountName);
        accountInfoPage.clickDelete();
    }
}
