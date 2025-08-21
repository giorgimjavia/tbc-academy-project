package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.LocationsSteps;

public class LocationFilterTest extends BaseTest {
    LocationsSteps locationsSteps;

    @BeforeClass
    public void setUpSteps() {
        locationsSteps = new LocationsSteps();
    }

    @Test
    public void varifyLocationFilterTest() {
        locationsSteps
                .openLocationPage()
                .chooseCityWithDropdown()
                .searchLocationInSearchBar();
    }
}
