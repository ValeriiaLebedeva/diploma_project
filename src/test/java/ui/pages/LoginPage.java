package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    //selectors

    SelenideElement emailInput = $("[type=email]");
    SelenideElement passwordInput = $("#password");
    SelenideElement logInButton = $("[data-ui-name=Box]");


    //actions

    public LoginPage setEmailInput (String value) {
        emailInput.setValue(value);
        return this;

    }

    public LoginPage setPasswordInput (String value) {
        passwordInput.setValue(value);
        return this;

    }

    public void clickOnTheLoginButton () {
        logInButton.click();

    }


}
