package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;
import steps.LocationsSteps;

public class LocationTabsTest extends BaseTest {
    LocationsSteps locationsSteps;
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
        homeSteps = new HomeSteps();
    }

    @Test
    public void varifyLocationsTabTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openMegaMenuNavbar()
                .navigateToLocationsPage();
        locationsSteps
                .openLocationPage()
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
