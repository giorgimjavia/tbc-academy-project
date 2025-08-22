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

    // ----------------------- LocationTabsTest ------------------------ \\
    public LocationsSteps selectAtmsTab() {
        locationsPage.tabs
                .findBy(text("ATMs"))
                .should(appear)
                .click();
    return this;
    }

    public LocationsSteps selectATMsSubTab24_7() {
        locationsPage.subTabs
                .findBy(text("24/7"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectATMsSubTab24_7() {
        locationsPage.subTabs
                .findBy(text("24/7"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectATMsSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text("Open Now"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectATMsSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text("Open Now"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesTab() {
        locationsPage.tabs
                .findBy(text("Branches"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesSubTab24_7() {
        locationsPage.subTabs
                .findBy(text("24/7"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectBranchesSubTab24_7() {
        locationsPage.subTabs
                .findBy(text("24/7"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text("Open Now"))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectBranchesSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text("Open Now"))
                .should(appear)
                .click();
        return this;
    }

    // ----------------------- LocationFilterTest ------------------------ \\
    public LocationsSteps chooseCityWithDropdown(String value) {
        locationsPage.dropdown
                .click();
        locationsPage.dropdownList
                .findBy(exactText(value))
                .click();
        return this;
    }

    public LocationsSteps searchLocationInSearchBar(String value) {
                locationsPage.enableSearchBar
                        .shouldBe(clickable)
                        .click();
                locationsPage.searchInput
                        .shouldBe(enabled)
                        .setValue(value)
                        .pressEnter();
                return this;
    }


}
