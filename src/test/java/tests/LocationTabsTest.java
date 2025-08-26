package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;
import steps.LocationsSteps;

@Test(groups = {"[Verify branch/ATM tab navigation and service sub-tab filtering (24/7, Open Now) (MSP-T1)]"})
public class LocationTabsTest extends BaseTest {
    LocationsSteps locationsSteps;
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
        homeSteps = new HomeSteps();
    }

    @Test()
    public void locationsTabAndSubtabsTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openMegaMenuNavbar()
                .navigateToLocationsPage();
        locationsSteps
                .selectAtmsTab()
                .selectATMsSubTab24_7()
                .unSelectATMsSubTab24_7()
                .selectATMsSubTabOpenNow()
                .unSelectATMsSubTabOpenNow()
                .selectBranchesTab()
                .selectBranchesSubTab24_7()
                .unSelectBranchesSubTab24_7()
                .selectBranchesSubTabOpenNow()
                .unSelectBranchesSubTabOpenNow();
    }
}
