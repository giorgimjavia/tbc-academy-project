package steps;

import data.Constants;
import org.openqa.selenium.Keys;
import pages.HomePage;

import utils.Config;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeSteps {
    HomePage mainPage = new HomePage();

    public HomeSteps openHomePage() {
        open(Constants.TBC_URL);
        return this;
    }

    public HomeSteps rejectCookies() {
        mainPage.rejectCookies.shouldBe(visible, enabled).click();
        return this;
    }

    public HomeSteps openMegaMenuNavbar() {
        if (Config.isMobileDevice()) {
            mainPage.hamburgerMenu.shouldBe(visible).click();
        } else {
            mainPage.megaMenuNavbar.first().hover();
        }
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
                .shouldBe(exactText(Constants.CURRENCY_EXCHANGE_TXT))
                .click();
        return this;
    }

    // ----------------------- SiteSearchTest ------------------------ \\
    public HomeSteps clickSearchButton() {
        mainPage.searchBtn
                .shouldBe(clickable)
                .click();
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

    public HomeSteps clearSearchInput() {
        mainPage.searchBar
                .clear();
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

    public HomeSteps NavigateToResultedPage() {
        mainPage.resultListsBtn
                .shouldHave(sizeGreaterThan(0));
        mainPage.resultListsBtn
                .first()
                .click();
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

    // ----------------------- ChatbotInteractionTest ------------------------ \\
    public HomeSteps openQuickAction() {
        mainPage.quickActionBtn
                .shouldBe(visible)
                .click();
        return this;
    }

    public HomeSteps openChatBot() {
        mainPage.chatbotBtn
                .shouldBe(visible)
                .click();
        return this;
    }

    public HomeSteps sendMessageToChatbot(String value) {
        mainPage.chatbotIFrame
                .should(appear);
        switchTo().frame(mainPage.chatbotIFrame);
        mainPage.chatbotInput
                .shouldBe(enabled)
                .sendKeys(value, Keys.ENTER);
        return this;
    }

    public HomeSteps uploadingFile(File file) {
        mainPage.uploadFileInput
                .uploadFile(file);
        return this;
    }

    public HomeSteps closeChatbot() {
        mainPage.closeChatbotBtn
                .shouldBe(visible)
                .click();
        return this;
    }
}
