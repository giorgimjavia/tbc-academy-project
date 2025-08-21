package steps;

import data.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LocationsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LocationsSteps {
    private static final Logger log = LoggerFactory.getLogger(LocationsSteps.class);
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
    public LocationsSteps chooseCityWithDropdown() {
        locationsPage.dropdown
                .click();
        locationsPage.dropdownList
                .findBy(exactText("VANI"))
                .click();
        return this;
    }

    public LocationsSteps searchLocationInSearchBar() {
                locationsPage.enableSearchBar
                        .shouldBe(clickable)
                        .click();
                locationsPage.searchInput
                        .shouldBe(enabled)
                        .setValue(" #2 Tavisupleba Str. ")
                        .pressEnter();
                return this;
    }


}
