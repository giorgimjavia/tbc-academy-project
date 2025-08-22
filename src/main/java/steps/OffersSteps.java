package steps;

import pages.OffersPage;

import static com.codeborne.selenide.Condition.clickable;

public class OffersSteps {
    OffersPage offersPage = new OffersPage();

    public void navigateToAllOffersPage() {
        offersPage.allOffersLink
                .forEach(el -> el.shouldBe(clickable));
        offersPage.allOffersLink
                .first()
                .click();
    }
}
