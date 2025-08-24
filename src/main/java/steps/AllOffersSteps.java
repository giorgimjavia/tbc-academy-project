package steps;

import com.codeborne.selenide.Selenide;
import pages.AllOffersPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;


public class AllOffersSteps {
    AllOffersPage allOffersPage = new AllOffersPage();

    public AllOffersSteps checkAnyCategoryInOffers() {
        allOffersPage.mobileFilter.click();
        Selenide.executeJavaScript(
                "arguments[0].click();",
                allOffersPage.offersCheckboxes.first().toWebElement()
        );
        allOffersPage.mobileApplyFilter.click();

//        allOffersPage.offersCheckboxes
//                .first()
//                .shouldBe(clickable)
//                .click();
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
        allOffersPage.mobileFilter.click();
        Selenide.executeJavaScript(
                "arguments[0].click();",
                allOffersPage.offersCheckboxes.first().toWebElement()
        );
        allOffersPage.mobileApplyFilter.click();

//        allOffersPage.offersCheckboxes
//                .first()
//                .click();
        return this;
    }
}
