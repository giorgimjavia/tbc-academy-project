package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.AllOffersSteps;
import steps.HomeSteps;
import steps.OffersSteps;

@Test(groups = {"[Verify filtering and resetting resulted offers  (MSP-T4)]"})
public class FilterOffersTest extends BaseTest {
    HomeSteps homeSteps;
    OffersSteps offersSteps;
    AllOffersSteps allOffersSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
        offersSteps = new OffersSteps();
        allOffersSteps = new AllOffersSteps();
    }

    @Test()
    public void filterAndResetResultedOffersTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
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
