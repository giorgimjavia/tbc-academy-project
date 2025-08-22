package runners;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
//    @BeforeClass
//    public void setUp() {
//        Configuration.browser = "chrome";
//        Configuration.timeout = 10000;
//        Configuration.holdBrowserOpen = true;
//    }
protected String device;

    @BeforeClass
    @Parameters("device")
    public void setUp(String device) {
        this.device = device;
        Configuration.browser = "chrome";
        Configuration.timeout = 30000;

        if ("mobile".equalsIgnoreCase(device)) {
            Configuration.browserSize = "375x667";
        }
    }
}
