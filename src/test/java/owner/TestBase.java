package owner;

import com.codeborne.selenide.Configuration;
import config.ProjectConfig;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://smolensk.hh.ru/employer/3323853";
        Configuration.browserVersion = "99";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

    }
}