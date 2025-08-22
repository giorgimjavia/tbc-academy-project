package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

public class SiteSearchTest extends BaseTest {
    HomeSteps homeSteps;
    private String device;

    @BeforeClass
    @Parameters("device")
    public void setUpSteps(String device) {
        this.device = device;
        homeSteps = new HomeSteps(device);
    }

    @Test
    public void siteSearchingByKeyword() {
        homeSteps
                .openHomePage()
                .clickSearchButton()
                .fillSearchBar(Constants.SEARCH_DATA)
                .validateListResults()
                .clearSearchInput()
                .fillNonValidDataInSearch(Constants.NON_RESULT_DATA)
                .validateEmptyResults();
    }
}
