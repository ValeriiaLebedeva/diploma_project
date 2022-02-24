package tests;

import config.AppConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TabAllIsVisibleAtFeaturesPageTest extends TestBase{

    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    @Test
    public void tabAllisVisibleAtFeaturesPageTest () {
        step("Open main page", () -> {
            open(appConfig.webUrl());});

        step("Click on the features in header", () -> {
            semrushMainPage.clickOnTheFeaturesInHeader();});

        step("Check 'choose your area of interest' first tab has text 'All'", () -> {
            featuresPage.CheckAllTabHasTextAll();});
    }
}
