package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class OffersPage {
    public ElementsCollection allOffersLink = $$x("//a[contains(@href, 'TBCCard')]");
}
