package tests;

import config.AppConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ChangeLocaleTest extends TestBase{

    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    @Test
    public void changeLocaleTest() {
        step("Open main page", () -> {
            open(appConfig.webUrl());});

        step("Click on the switch locale button", () -> {
            semrushMainPage.clickOnTheSwitchLocaleButton();});

        step("Select ru locale", () -> {
            semrushMainPage.selectRuLocale();});

        step("Check main text is on ru language", () -> {
            semrushMainPage.checkMainTextOnRu();});

        step("Check features in header is on ru language", () -> {
            semrushMainPage.checkFeaturesInHeaderOnRu();});
    }
}
