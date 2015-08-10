package TestScripts;

import Pages.*;
import org.testng.annotations.Test;

/**
 * Created by AutomationUser on 8/8/2015.
 */
public class TestCreateLead extends BaseTestCase
{
    private LeadPage leadPage;
    private NewLeadPage newLeadPage;
    private LookupPage lookupPage;

    private String firstName = "Elmer03";
    private String lastName = "Alvarado03";
    private String company = "Home";
    private String leadStatus = "Working - Contacted";
    private String sicCode = "Code01";

    public TestCreateLead()
    {
    }

    @Test
    public void TestCreatedLeadTc()
    {
        leadPage = topMenuBar.Leads();
        newLeadPage = leadPage.clickNew();
        lookupPage = newLeadPage.setFirstName(firstName)
                .setLastName(lastName)
                .setCompany(company)
                .selectLeadStatus(leadStatus)
                .setSicCode(sicCode).clickLookup();

        lookupPage.setSearch("g")
                .clickGo();
                //.clickSave();
    }
}
