package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.LocationsSteps;

public class LocationTabsTest extends BaseTest {
    LocationsSteps locationsSteps;

    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
    }

    @Test
    public void varifyLocationsTabTest() {
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
