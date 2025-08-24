package steps;

import com.codeborne.selenide.Selenide;
import pages.AllOffersPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;


public class AllOffersSteps {
//    private final String device;
    AllOffersPage allOffersPage = new AllOffersPage();

//    public AllOffersSteps(String device) {
//        this.device = device;
//    }
//
//    private boolean isMobile() {
//        return "mobile".equalsIgnoreCase(device);
//    }

    public AllOffersSteps checkAnyCategoryInOffers() {
                   allOffersPage.mobileFilter.click();
           Selenide.executeJavaScript(
                   "arguments[0].click();",
                   allOffersPage.offersCheckboxes.first().toWebElement()
           );
           allOffersPage.mobileApplyFilter.click();

//        if (isMobile()) {
//            allOffersPage.mobileFilter.click();
//            Selenide.executeJavaScript(
//                    "arguments[0].click();",
//                    allOffersPage.offersCheckboxes.first().toWebElement()
//            );
//            allOffersPage.mobileApplyFilter.click();
//        }

//        allOffersPage.offersCheckboxes
//                    .first()
//                    .shouldBe(clickable)
//                    .click();
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
        allOffersPage.mobileFilter.shouldBe(visible).click();
        Selenide.executeJavaScript(
                "arguments[0].click();",
                allOffersPage.offersCheckboxes.first().toWebElement()
        );
        allOffersPage.mobileApplyFilter.shouldBe(visible).click();

//        allOffersPage.offersCheckboxes
//                .first()
//                .click();
        return this;
    }
}
