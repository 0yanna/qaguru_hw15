package owner;

import config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    private WebDriver driver = new WebDriverProvider().get();
    @Test
    public void testGitHubTitle() {
        assertEquals(driver.getTitle(), "GitHub: Where the world builds software · GitHub");

    }
}
