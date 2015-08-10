package TestScripts;

import Pages.CreateNewViewPage;
import Pages.LeadPage;
import org.testng.annotations.Test;

/**
 * Created by AutomationUser on 8/9/2015.
 */
public class TestCreateNewView extends BaseTestCase
{
    private LeadPage leadPage;
    private CreateNewViewPage createNewViewPage;

    private String availableValueText = "First Name";

    public TestCreateNewView()
    {

    }

    @Test
    public void TestCreateNewViewTc()
    {
        leadPage = topMenuBar.Leads();
        createNewViewPage = leadPage.clickCreateNewView();
        createNewViewPage.selectAvailableFields(availableValueText)
                .clickAddAvailableFields();
    }
}
