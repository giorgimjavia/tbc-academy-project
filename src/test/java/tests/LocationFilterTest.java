package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;
import steps.LocationsSteps;

public class LocationFilterTest extends BaseTest {
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
    public void varifyLocationFilterTest() {
        homeSteps
                .openHomePage()
                .openMegaMenuNavbar()
                .navigateToLocationsPage();
        locationsSteps
                .openLocationPage()
                .chooseCityWithDropdown(Constants.CITY_DATA)
                .searchLocationInSearchBar(Constants.CITY_LOCATION_DATA);
    }
}
