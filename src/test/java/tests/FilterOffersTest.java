package tests;

import com.github.dockerjava.api.model.Device;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.AllOffersSteps;
import steps.HomeSteps;
import steps.OffersSteps;

public class FilterOffersTest extends BaseTest {
    HomeSteps homeSteps;
    OffersSteps offersSteps;
    AllOffersSteps allOffersSteps;
    private String device;

    @BeforeClass
    @Parameters("device")
    public void setUpSteps(String device) {
        this.device = device;
        homeSteps = new HomeSteps(device);
        offersSteps = new OffersSteps();
        allOffersSteps = new AllOffersSteps();
    }

    @Test
    public void FilterAndResetOffersTest() {
        homeSteps
                .openHomePage()
                .openMegaMenuNavbar()
                .navigateToOffersPage();
        offersSteps
                .navigateToAllOffersPage();
        allOffersSteps
                .checkAnyCategoryInOffers()
                .validateListUpdate()
                .uncheckSelectedCategory();
    }
}
