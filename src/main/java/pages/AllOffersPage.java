package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class AllOffersPage {
    public ElementsCollection
            offersCheckboxes = $$x("//input[@type ='checkbox' and @class ='filter-item__input']"),
            offerCards = $$x("//div[@class ='marketing__cards-list ng-star-inserted']//a");
}
