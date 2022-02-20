package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    //selectors
    SelenideElement createAccountPageText = $("[data-ui-name=Text]");

    //actions

    public void checkCreateAccountPageText(){
        createAccountPageText.shouldHave(text("Создать учетную запись"));

    }


}
