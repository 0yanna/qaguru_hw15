package owner;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest extends TestBase{
    @Test
    public void simpleTest() {
        open("https://ru.wikipedia.org/");
        $(".vector-search-box-input").setValue("Github").pressEnter();
        $("#bodyContent")
                .shouldHave(Condition.text("веб-сервис для хостинга IT-проектов и их совместной разработки"));
    }
}
