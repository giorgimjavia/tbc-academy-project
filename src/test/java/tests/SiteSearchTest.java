package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

@Test(groups = {"[Verify site search by keyword and results/empty state behavior  (MSP-T3)]"})
public class SiteSearchTest extends BaseTest {
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test()
    public void siteSearchingByKeywordTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .clickSearchButton()
                .fillNonValidDataInSearch(Constants.NON_RESULT_DATA)
                .validateEmptyResults()
                .clearSearchInput()
                .fillSearchBar(Constants.SEARCH_DATA)
                .validateListResults()
                .NavigateToResultedPage();
    }
}
