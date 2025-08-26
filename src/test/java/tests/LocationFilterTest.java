package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;
import steps.LocationsSteps;

@Test(groups = {"[Verify location filter updates map and list with correct details (MSP-T2)]"})
public class LocationFilterTest extends BaseTest {
    LocationsSteps locationsSteps;
    HomeSteps homeSteps;


    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
        homeSteps = new HomeSteps();
    }

    @Test()
    public void validateCityAndLocationFilterTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openMegaMenuNavbar()
                .navigateToLocationsPage();
        locationsSteps
                .chooseCityWithDropdown(Constants.CITY_DATA)
                .searchLocationInSearchBar(Constants.CITY_LOCATION_DATA);
    }
}
