package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.LocationsSteps;
import steps.HomeSteps;

public class BranchesTest extends BaseTest {
    HomeSteps mainSteps;
    LocationsSteps locationsSteps;

    @BeforeClass
    public void setUpSteps() {
        mainSteps = new HomeSteps();
        locationsSteps = new LocationsSteps();
    }


    @Test
    public void e2e_goToLocationsTabTest() {
        mainSteps
                .openMainPage()
                .navigateToLocationsPage();
        locationsSteps
                .clickAllTab()
                .clickAtmsTab()
                .clickBranchesTab();
    }

    @Test
    public void smoke_goToLocationsTabTest() {
        locationsSteps
                .openLocationPage()
                .clickAllTab()
                .clickBranchesTab()
                .clickAtmsTab();
    }
}
