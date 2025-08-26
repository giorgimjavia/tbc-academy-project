package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CurrencyExchangePage {
    public SelenideElement
            firstInput = $("#tbcx-text-input-1"),
            swapIcon = $x("//div[contains(@class, 'swap')]");

    public ElementsCollection
            dropdowns = $$("div.tbcx-dropdown-selector"),
            dropdownList = $$x("//tbcx-dropdown-popover-item[@class = 'tbcx-dropdown-popover-item ng-star-inserted']");
}
