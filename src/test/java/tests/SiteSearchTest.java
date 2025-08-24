package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

public class SiteSearchTest extends BaseTest {
    HomeSteps homeSteps;


    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test
    public void siteSearchingByKeyword() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .clickSearchButton()
                .fillSearchBar(Constants.SEARCH_DATA)
                .validateListResults()
                .clearSearchInput()
                .fillNonValidDataInSearch(Constants.NON_RESULT_DATA)
                .validateEmptyResults();
    }
}
