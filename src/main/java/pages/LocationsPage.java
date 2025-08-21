package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class LocationsPage {
    public ElementsCollection tabs = $$x("//button[contains(@class , 'tbcx-pw-tab')]//span");
}
