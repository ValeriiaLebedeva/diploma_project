package tests;

import config.AppConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LoginTest extends TestBase{

    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    @Test
    void loginTest() {
        step("Open main page", () -> {
            open(appConfig.webUrl());});

        step("Click on the login button (main page)", () -> {
            semrushMainPage.clickOnTheLoginButton();});

        step("Type email into email input field", () -> {
            loginPage.setEmailInput(appConfig.login());});

        step("Type password into password input field", () -> {
            loginPage.setPasswordInput(appConfig.password());});

        step("Click on the login button (Login page)", () -> {
            loginPage.clickOnTheLoginButton();});

        step("Check profile button is visible on profile page", () -> {
            profilePage.profileButtonIsVisible();});
    }
}
