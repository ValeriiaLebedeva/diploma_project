package tests;

import config.AppConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StartButtonTakesUserToCreateAccountPageTest extends TestBase{

    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    @Test
    public void startButtonTakesUserToCreateAccountPageTest () {
        step("Open main page", () -> {
            open(appConfig.webUrl());});

        step("Click on the 'start now' button", () -> {
            semrushMainPage.clickOnTheStartNowButton();});

        step("Check user is on 'Create Account' page", () -> {
            createAccountPage.checkCreateAccountPageText();});
    }
}
