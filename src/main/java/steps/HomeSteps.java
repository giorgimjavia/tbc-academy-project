package steps;

import com.codeborne.selenide.Selenide;
import data.Constants;
import pages.HomePage;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class HomeSteps {
//    private final String device;
    HomePage mainPage = new HomePage();

//    public HomeSteps(String device) {
//        this.device = device;
//    }

//    private boolean isMobile() {
//        return "mobile".equalsIgnoreCase(device);
//    }

    public HomeSteps openHomePage() {
        open(Constants.TBC_URL);
        return this;
    }

    public HomeSteps rejectCookies() {
        mainPage.rejectCookies
                .shouldBe(visible)
                .click();
        return this;
    }

    public HomeSteps openMegaMenuNavbar() {
        mainPage.hamburgerMenu.shouldBe(visible).click();
//        if (isMobile()) {
//            mainPage.hamburgerMenu.shouldBe(visible).click();
//        } else {}
//            mainPage.megaMenuNavbar.first().hover();

        return this;
    }


    public HomeSteps navigateToLocationsPage() {
            mainPage.locationsLink.shouldBe(visible)
                    .shouldHave(exactText(Constants.LOCATIONS_TXT))
                    .click();
        return this;
    }


    public HomeSteps navigateToOffersPage() {
        mainPage.offersLink
                .shouldBe(visible)
                .shouldHave(exactText(Constants.OFFERS_TXT))
                .click();
        return this;
    }

    public HomeSteps navigateToCurrencyExchangePage() {
        mainPage.currencyExchangeLink
                .shouldBe(visible)
                .shouldBe(exactText("Currency Exchange"))
                .click();
        return this;
    }

    public HomeSteps clickSearchButton() {
        mainPage.searchBtn
                .shouldBe(clickable)
                .click();
        return this;
    }

    public HomeSteps fillSearchBar(String value) {
        mainPage.searchBar
                .shouldBe(enabled)
                .setValue(value);
        return this;
    }

    public HomeSteps validateListResults() {
        mainPage.resultsList
                .shouldHave(sizeGreaterThan(0));
        mainPage.resultsList
                .findBy(text(Constants.SEARCH_DATA)).shouldBe(visible);
        return this;
    }

    public HomeSteps clearSearchInput() {
        mainPage.searchBar
                .clear();
        return this;
    }

    public HomeSteps fillNonValidDataInSearch(String value) {
        mainPage.searchBar
                .setValue(value);
        return this;
    }

    public HomeSteps validateEmptyResults() {
        mainPage.emptyResult
                .shouldHave(text(Constants.EMPTY_RESULT_MESSAGE));
        return this;
    }


    // ----------------------- ProductDetailsTest ------------------------ \\
    public HomeSteps verifyExternalLinkTarget() {
        mainPage.productBlank.shouldBe(visible)
                .shouldHave(attribute("target", "_blank"));
        return this;
    }

    public HomeSteps verifyCTAButton() {
        mainPage.productBlankButton.shouldBe(visible)
                .shouldHave(text(Constants.READ_MORE_TXT));
        return this;
    }

    public HomeSteps navigateToProductPage() {
        mainPage.productBlankButton
                .shouldBe(clickable)
                .click();
        return this;
    }
}
