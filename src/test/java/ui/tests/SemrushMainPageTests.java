package ui.tests;

import config.SemrushConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SemrushMainPageTests extends TestBase {

    public static SemrushConfig semrushConfig = ConfigFactory.create(SemrushConfig.class, System.getProperties());


    @Test
    void login2() {
        open(semrushConfig.webUrl());
        loginPage.setEmailInput(semrushConfig.login());
        loginPage.setPasswordInput(semrushConfig.password());
        loginPage.clickOnTheLoginButton();
    }

    @Test
    public void loginTest() {
        open("https://www.semrush.com/");
        $("[type=email]").setValue("valeria+1@segterra.com");
        $("#password").setValue("Azsxdcfvgb12345!");
        $("[data-ui-name=Box]").click();

    }



    @Test
    public void changeLocaleTest2() {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheSwitchLocaleButton();
        semrushMainPage.selectRuLocale();
        semrushMainPage.checkMainTextOnRu();
        semrushMainPage.checkFeaturesInHeaderOnRu();
    }


    @Test
    public void changeLocaleTest() {
        open("https://www.semrush.com/");
        $("[data-test=header_lang_switcher_button]").click();
        $("[value=ru]").click();
        $$(".index-title").get(0).shouldHave(text("Получайте измеримые результаты от интернет-маркетинга"));
        $("#srf-header div div nav a:nth-child(1)").shouldHave(text("Возможности"));

    }

    @Test
    public void tabAllisVisibleAtFeaturesPage () {
        open("https://www.semrush.com/");
        $("[data-test=header_features]").click();
        $(".semrush-features__choose-tabs label").shouldHave(text("All"));
    }

    @Test
    public void tabAllisVisibleAtFeaturesPage2 () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheFeaturesInHeader();
        featuresPage.CheckAllTabHasTextAll();
    }


    @Test
    public void startButtonTakesUserToCreateAccountPage () {
        open("https://www.semrush.com/");
        $("[data-test=main-cta__btn]").click();
        $("[data-ui-name=Text]").shouldHave(text("Create your account"));
    }


    @Test
    public void startButtonTakesUserToCreateAccountPage2 () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheStartNowButton();
        createAccountPage.checkCreateAccountPageText();
    }

    @Test
    public void statsAndFactsPageOpensClickingOnTheLearnMoreButton () {
        open("https://www.semrush.com/");
        $("[data-ga-label=stats]").click();
        $(".MainSection__title--2m8RC").shouldHave(text("Stats and Facts"));
    }

    @Test
    public void statsAndFactsPageOpensClickingOnTheLearnMoreButton2 () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheLearnMoreButton();
        statsAndFactsPage.checkStatsAndFactsText();
    }

}
