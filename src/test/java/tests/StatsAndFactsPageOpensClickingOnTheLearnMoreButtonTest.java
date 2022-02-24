package tests;

import config.AppConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class StatsAndFactsPageOpensClickingOnTheLearnMoreButtonTest extends TestBase {

    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    @Test
    @Disabled
    public void statsAndFactsPageOpensClickingOnTheLearnMoreButtonTest () {
        open(appConfig.webUrl());
        semrushMainPage.clickOnTheLearnMoreButton();
        statsAndFactsPage.checkStatsAndFactsText();
    }
}
