package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LocationsPage {
    public ElementsCollection
            tabs = $$x("//button[contains(@class , 'tbcx-pw-tab')]//span"),
            subTabs = $$("span.tbcx-pw-chip__checkmark"),
            dropdownList = $$x("//div[@class ='tbcx-dropdown-popover-item__title']");

    public SelenideElement
            dropdown = $x("//div[@class ='tbcx-dropdown-selector']"),
            enableSearchBar = $x("//tbcx-text-input[contains(@class, 'size-normal')]"),
            searchInput = $("#tbcx-text-input-1");


}
