package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

@Test(groups = {"[Verify product details page displays key CTA and external links correctly (MSP-T5)]"})
public class ProductDetailsTest extends BaseTest {
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test()
    public void productsButtonAndVisibilityTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .verifyExternalLinkTarget()
                .verifyCTAButton()
                .navigateToProductPage();
    }
}
