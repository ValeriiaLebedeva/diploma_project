package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    SelenideElement profileButton = $("#srf-header > div > div > div.srf-navbar__right > div:nth-child(4) > a");


    public void profileButtonIsVisible () {
        profileButton.shouldBe(Condition.visible);
    }


}
