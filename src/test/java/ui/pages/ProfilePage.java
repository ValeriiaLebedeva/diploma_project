package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    SelenideElement profileButton = $("[data-test=header-menu__user]");


    public void profileButtonIsVisible () {
        profileButton.shouldBe(Condition.visible);
    }


}
