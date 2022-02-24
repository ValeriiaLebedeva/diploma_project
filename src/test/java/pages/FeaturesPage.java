package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FeaturesPage {

    //selectors
    SelenideElement tabAllElement = $(".semrush-features__choose-tabs label");

    //actions
    public void CheckAllTabHasTextAll() {
        tabAllElement.shouldBe(visible);
        tabAllElement.shouldHave(text("All"));
    }
}
