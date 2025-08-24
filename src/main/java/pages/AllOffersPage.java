package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AllOffersPage {
    public ElementsCollection
//            offersCheckboxes = $$x("//input[@type ='checkbox' and @class ='filter-item__input']"),
              offersCheckboxes = $$x("//div[@class ='filter-item__label']"),
            offerCards = $$x("//div[@class ='marketing__cards-list ng-star-inserted']//a");

    public SelenideElement
            mobileFilter = $x("//div[@class = 'marketing__filter-chip__title']"),
            mobileApplyFilter = $x("//button[text() ='Filter']");
}
