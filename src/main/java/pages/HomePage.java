package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement locationsLink = $x("//tbcx-pw-link[contains(@class, 'footer')]//a[@href='/en/atms&branches']");
}
