package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.CurrencyExchangeSteps;
import steps.HomeSteps;

@Test(groups = {"[Verify currency exchange page displays accurate rates and conversions (MSP-T6)]"})
public class CurrencyConvertorTest extends BaseTest {
    CurrencyExchangeSteps currencyExchangeSteps;
    HomeSteps homeSteps;


    @BeforeClass
    public void setUpSteps() {
        currencyExchangeSteps = new CurrencyExchangeSteps();
        homeSteps = new HomeSteps();
    }

    @Test()
    public void validateCurrencyExchangeTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openMegaMenuNavbar()
                .navigateToCurrencyExchangePage();
        currencyExchangeSteps
                .chooseFirstCurrency(Constants.FIRST_CURRENCY_DATA)
                .chooseSecondCurrency(Constants.SECOND_CURRENCY_DATA)
                .enterFirstCurrencyAmount(Constants.AMOUNT_DATA)
                .swapCurrencies();
    }
}
