package ui.tests;

import config.SemrushConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SemrushMainPageTests extends TestBase {

    public static SemrushConfig semrushConfig = ConfigFactory.create(SemrushConfig.class, System.getProperties());


    @Test
    void loginTest() {
        step("Open main page", () -> {
                    open(semrushConfig.webUrl());
        });

        step("Click on the login button (main page)", () -> {
        semrushMainPage.clickOnTheLoginButton();
        });

        step("Type email into email input field", () -> {
            loginPage.setEmailInput(semrushConfig.login());
        });

        step("Type password into password input field", () -> {
        loginPage.setPasswordInput(semrushConfig.password());
        });

        step("Click on the login button (Login page)", () -> {
            loginPage.clickOnTheLoginButton();
        });

        //add test with checking profile page
    }


    @Test
    public void changeLocaleTest() {
        step("Open main page", () -> {
        open(semrushConfig.webUrl());
        });

        step("Click on the switch locale button", () -> {
        semrushMainPage.clickOnTheSwitchLocaleButton();
        });

        step("Select ru locale", () -> {
        semrushMainPage.selectRuLocale();
        });

        step("Check main text is on ru language", () -> {
            semrushMainPage.checkMainTextOnRu();
        });

        step("Check features in header is on ru language", () -> {
        semrushMainPage.checkFeaturesInHeaderOnRu();
        });
    }


    @Test
    public void tabAllisVisibleAtFeaturesPageTest () {
        step("Open main page", () -> {
            open(semrushConfig.webUrl());
        });

        step("Click on the features in header", () -> {
        semrushMainPage.clickOnTheFeaturesInHeader();
        });

        step("Check 'choose your area of interest' first tab has text 'All'", () -> {
        featuresPage.CheckAllTabHasTextAll();
        });
    }


    @Test
    public void startButtonTakesUserToCreateAccountPageTest () {
        step("Open main page", () -> {
            open(semrushConfig.webUrl());
        });
        step("Click on the 'start now' button", () -> {
        semrushMainPage.clickOnTheStartNowButton();
        });
        step("Check user is on 'Create Account' page", () -> {
            createAccountPage.checkCreateAccountPageText();
        });
    }


    @Test
    @Disabled
    public void statsAndFactsPageOpensClickingOnTheLearnMoreButtonTest () {
        open(semrushConfig.webUrl());
        semrushMainPage.clickOnTheLearnMoreButton();
        statsAndFactsPage.checkStatsAndFactsText();
    }

}
