package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class StatsAndFactsPage {

    //selectors
    SelenideElement statsAndFactsText = $(".MainSection__title--2m8RC");

    //actions
    public void checkStatsAndFactsText() {
        statsAndFactsText.shouldHave(text("Stats and Facts"));
    }
}
