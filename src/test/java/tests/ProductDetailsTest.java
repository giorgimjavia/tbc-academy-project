package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

public class ProductDetailsTest extends BaseTest {
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test
    public void verifyProductsButtonAndBlank() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .verifyExternalLinkTarget()
                .verifyCTAButton()
                .navigateToProductPage();
    }
}
