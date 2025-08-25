package steps;

import data.Constants;
import pages.LocationsPage;

import static com.codeborne.selenide.Condition.*;

public class LocationsSteps {
    LocationsPage locationsPage = new LocationsPage();


    // ----------------------- LocationTabsTest ------------------------ \\
    public LocationsSteps selectAtmsTab() {
        locationsPage.tabs
                .findBy(text(Constants.ATMS_TXT))
                .should(appear)
                .click();
    return this;
    }

    public LocationsSteps selectATMsSubTab24_7() {
        locationsPage.subTabs
                .findBy(text(Constants.TWENTY_FOUR_SEVEN_TX))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectATMsSubTab24_7() {
        locationsPage.subTabs
                .findBy(text(Constants.TWENTY_FOUR_SEVEN_TX))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectATMsSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text(Constants.OPEN_NOW_TXT))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectATMsSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text(Constants.OPEN_NOW_TXT))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesTab() {
        locationsPage.tabs
                .findBy(text(Constants.BRANCHES_TXT))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesSubTab24_7() {
        locationsPage.subTabs
                .findBy(text(Constants.TWENTY_FOUR_SEVEN_TX))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectBranchesSubTab24_7() {
        locationsPage.subTabs
                .findBy(text(Constants.TWENTY_FOUR_SEVEN_TX))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps selectBranchesSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text(Constants.OPEN_NOW_TXT))
                .should(appear)
                .click();
        return this;
    }

    public LocationsSteps unSelectBranchesSubTabOpenNow() {
        locationsPage.subTabs
                .findBy(text(Constants.OPEN_NOW_TXT))
                .should(appear)
                .click();
        return this;
    }

    // ----------------------- LocationFilterTest ------------------------ \\
//  This step fails. it's actually a bug in mobile responsive, because at mobile resolution
//  the dropdown menu disappears, making it impossible to select a city
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
