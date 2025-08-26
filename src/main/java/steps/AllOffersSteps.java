package steps;

import com.codeborne.selenide.Selenide;
import pages.AllOffersPage;
import utils.Config;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;


public class AllOffersSteps {
    AllOffersPage allOffersPage = new AllOffersPage();


    public AllOffersSteps checkAnyCategoryInOffers() {
        if (Config.isMobileDevice()) {
            allOffersPage.mobileFilter.click();
            Selenide.executeJavaScript(
                    "arguments[0].click();",
                    allOffersPage.offersCheckboxes.first().toWebElement()
            );
            allOffersPage.mobileApplyFilter.click();
        } else {
            allOffersPage.offersCheckboxes
                    .first()
                    .shouldBe(clickable)
                    .click();
        }
        return this;
    }

    public AllOffersSteps validateListUpdate() {
        allOffersPage.offerCards
                .shouldHave(sizeGreaterThan(0));
        allOffersPage.offerCards
                .forEach(el -> el.shouldBe(visible));
        return this;
    }

    public AllOffersSteps uncheckSelectedCategory() {
        if (Config.isMobileDevice()) {
            allOffersPage.mobileFilter.shouldBe(visible).click();
            Selenide.executeJavaScript(
                    "arguments[0].click();",
                    allOffersPage.offersCheckboxes.first().toWebElement()
            );
            allOffersPage.mobileApplyFilter.shouldBe(visible).click();
        } else {
            allOffersPage.offersCheckboxes
                    .first()
                    .click();
        }
        return this;
    }
}
