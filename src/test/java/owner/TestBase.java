package owner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfig;
import helpers.DriverConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        DriverConfig.configure();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
