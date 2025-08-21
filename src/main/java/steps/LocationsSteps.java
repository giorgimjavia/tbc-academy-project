package steps;

import data.Constants;
import pages.LocationsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class LocationsSteps {
    LocationsPage locationsPage = new LocationsPage();

    public LocationsSteps openLocationPage() {
        open(Constants.TBC_LOCATIONS_URL);
        return this;
    }

    public LocationsSteps clickAllTab() {
        locationsPage.tabs
                .findBy(text("All"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps clickAtmsTab() {
        locationsPage.tabs
                .findBy(text("ATMs"))
                .should(appear)
                .click();
    return this;
    }

    public LocationsSteps clickBranchesTab() {
        locationsPage.tabs
                .findBy(text("Branches"))
                .should(appear)
                .click();
        return this;
    }
}
