package steps;

import data.Constants;
import pages.HomePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class HomeSteps {
    HomePage mainPage = new HomePage();

    public HomeSteps openHomePage() {
        open(Constants.TBC_URL);
        return this;
    }

    public HomeSteps navigateToLocationsPage() {
        mainPage.locationsLink
                .should(appear)
                .shouldHave(exactText("Locations"))
                .click();
        return this;
    }
}
