package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public SelenideElement
            locationsLink = $x("//span[contains(@class, 'item__title') and text()=' Locations']"),
            offersLink = $x("//span[contains(@class, 'item__title') and text()=' Offers']"),
            searchBtn = $x("//button[contains(@class, 'search__button')]"),
            searchBar = $x("//input[contains(@id, 'tbcx-text-input')]"),
            emptyResult = $x("//p[contains(@class, 'not-fount-result__title')]"),
            hamburgerMenu = $x("//button[contains(@class, 'hamburger-menu')]"),
            productBlank = $x("//a[contains(@href, 'tbcconcept') and @target='_blank']"),
            productBlankButton = $x("//a[contains(@href, 'tbcconcept') and @target='_blank']//button[text() ='Read more']");

    public ElementsCollection
            resultsList = $$(".search-result-item__title"),
            megaMenuNavbar = $$x("//div[contains(@class, 'navigation-item__link')]");

}
