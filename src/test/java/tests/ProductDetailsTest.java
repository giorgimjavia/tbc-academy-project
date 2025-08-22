package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

public class ProductDetailsTest extends BaseTest {
    HomeSteps homeSteps;
    private String device;

    @BeforeClass
    @Parameters("device")
    public void setUpSteps(String device) {
        this.device = device;
        homeSteps = new HomeSteps(device);
    }

    @Test
    public void verifyProductsButtonAndBlank() {
        homeSteps
                .openHomePage()
                .verifyExternalLinkTarget()
                .verifyCTAButton()
                .navigateToProductPage();
    }
}
