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
    private String device;

    @BeforeClass
    @Parameters("device")
    public void setUpSteps(String device) {
        this.device = device;
        locationsSteps = new LocationsSteps();
        homeSteps = new HomeSteps(device);
    }

    @Test
    public void varifyLocationsTabTest() {
        homeSteps
                .openHomePage()
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
