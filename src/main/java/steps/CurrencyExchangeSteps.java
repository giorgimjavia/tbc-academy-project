package steps;

import pages.CurrencyExchangePage;

import static com.codeborne.selenide.Condition.*;

public class CurrencyExchangeSteps {
    CurrencyExchangePage currencyExchangePage = new CurrencyExchangePage();

    public CurrencyExchangeSteps chooseFirstCurrency(String value) {
        currencyExchangePage.dropdowns
                .forEach(el -> el.shouldBe(clickable));
        currencyExchangePage.dropdowns
                .first()
                .click();
        currencyExchangePage.dropdownList
                .findBy(text(value))
                .click();
        return this;
    }

    public CurrencyExchangeSteps chooseSecondCurrency(String value) {
        currencyExchangePage.dropdowns
                .forEach(el -> el.shouldBe(clickable));
        currencyExchangePage.dropdowns
                .get(1)
                .click();
        currencyExchangePage.dropdownList
                .findBy(text(value))
                .click();
        return this;
    }

    public CurrencyExchangeSteps enterFirstCurrencyAmount(String value) {
        currencyExchangePage.firstInput
                .shouldBe(enabled)
                .setValue(value);
        return this;
    }

    public CurrencyExchangeSteps swapCurrencies() {
        currencyExchangePage.swapIcon
                .shouldBe(clickable)
                .click();
        return this;
    }
}
