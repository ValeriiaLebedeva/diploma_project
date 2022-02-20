package ui.tests;

import config.SemrushConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SemrushMainPageTests extends TestBase {

    public static SemrushConfig semrushConfig = ConfigFactory.create(SemrushConfig.class, System.getProperties());


    @Test
    void loginTest() {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheLoginButton();
        loginPage.setEmailInput(semrushConfig.login());
        loginPage.setPasswordInput(semrushConfig.password());
        loginPage.clickOnTheLoginButton();
    }


    @Test
    public void changeLocaleTest() {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheSwitchLocaleButton();
        semrushMainPage.selectRuLocale();
        semrushMainPage.checkMainTextOnRu();
        semrushMainPage.checkFeaturesInHeaderOnRu();
    }


    @Test
    public void tabAllisVisibleAtFeaturesPageTest () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheFeaturesInHeader();
        featuresPage.CheckAllTabHasTextAll();
    }


    @Test
    public void startButtonTakesUserToCreateAccountPageTest () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheStartNowButton();
        createAccountPage.checkCreateAccountPageText();
    }


    @Test
    @Disabled
    public void statsAndFactsPageOpensClickingOnTheLearnMoreButtonTest () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheLearnMoreButton();
        statsAndFactsPage.checkStatsAndFactsText();
    }

}
