package runners;

import com.codeborne.selenide.Configuration;
import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "384x824";
    }
}