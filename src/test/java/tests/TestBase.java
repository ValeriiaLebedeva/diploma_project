package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import static java.lang.String.format;

public class TestBase {

    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    SemrushMainPage semrushMainPage = new SemrushMainPage();
    LoginPage loginPage = new LoginPage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    FeaturesPage featuresPage = new FeaturesPage();
    StatsAndFactsPage statsAndFactsPage = new StatsAndFactsPage();
    ProfilePage profilePage = new ProfilePage();

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        String value = System.getProperty("url", "selenoid.autotests.cloud/wd/hub/");
        String login = credentials.login();
        String password = credentials.password();
        String urlRemote = format("https://%s:%s@%s", login, password, value);
        Configuration.remote = urlRemote;
             System.out.println(urlRemote);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
