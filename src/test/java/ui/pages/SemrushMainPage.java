package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SemrushMainPage {

    //selectors

    SelenideElement switchLocaleButton = $("[data-test=header_lang_switcher_button]");
    SelenideElement ruLocaleInDropdownList = $("[value=ru]");
    SelenideElement mainText = $$(".index-title").get(0);
    SelenideElement headerFeatures = $("#srf-header div div nav a:nth-child(1)");
    SelenideElement headerFeatures1= $("[data-test=header_features]");
    SelenideElement startNowButton = $("[data-test=main-cta__btn]");
    SelenideElement learnMoreButton = $("[data-ga-label=stats]");
    SelenideElement loginButton = $("[data-ga-label=login]");



    // actions

    public void clickOnTheSwitchLocaleButton(){
        switchLocaleButton.click();
    }

    public void selectRuLocale() {
        ruLocaleInDropdownList.click();
    }

    public void checkMainTextOnRu(){
        mainText.shouldHave(text("Получайте измеримые результаты от интернет-маркетинга"));
    }

    public void checkFeaturesInHeaderOnRu(){
        headerFeatures.shouldHave(text("Возможности"));
    }

    public void clickOnTheFeaturesInHeader(){
        headerFeatures1.click();
    }

    public void clickOnTheStartNowButton(){
        startNowButton.click();
    }

    public void clickOnTheLearnMoreButton(){
        learnMoreButton.click();
    }

    public void clickOnTheLoginButton(){
        loginButton.click();
    }
}
