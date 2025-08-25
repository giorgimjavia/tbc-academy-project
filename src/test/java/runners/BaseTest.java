package runners;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;
import utils.Config;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeClass
    @Parameters("device")
    public void setUp(@Optional("mobile") String device) {
        Configuration.browser = "chrome";
        Configuration.timeout = 20000;
        if ("desktop".equalsIgnoreCase(device)) {
            Config.setMobileDevice(false);
            Configuration.browserSize = "1920x1080";
        } else {
            Config.setMobileDevice(true);
            Configuration.browserSize = "384x824";
        }
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }

}