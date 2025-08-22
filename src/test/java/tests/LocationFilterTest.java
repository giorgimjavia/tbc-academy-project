package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;
import steps.LocationsSteps;

public class LocationFilterTest extends BaseTest {
    LocationsSteps locationsSteps;
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
        homeSteps = new HomeSteps();
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
