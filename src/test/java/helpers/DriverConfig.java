package helpers;

import com.codeborne.selenide.Configuration;
import config.ProjectConfig;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

public class DriverConfig {
    public static void configure() {
        Properties properties = System.getProperties();
        String system = properties.getProperty("switch");
        if (system == null) {
            System.setProperty("switch", "local");
        }

        Configuration.browser = ProjectConfig.webConfig.browserName();
        Configuration.browserVersion = ProjectConfig.webConfig.browserVersion();
        Configuration.browserSize = ProjectConfig.webConfig.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        OperaOptions operaOptions = new OperaOptions();

        switch (Configuration.browser) {
            case "chrome":
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--disable-popup-blocking");
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("--lang=en-en");
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                break;
            case "firefox":
                firefoxOptions.addArguments("--fast-start");
                firefoxOptions.addArguments("--enable-logging");
                firefoxOptions.addArguments("--ignore-certificate-errors");
                firefoxOptions.addArguments("--disable-gpu");
                capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
                break;
            case "opera":
                operaOptions.addArguments("--disable-gpu");
                capabilities.setCapability(OperaOptions.CAPABILITY, operaOptions);
                break;
        }

        if (ProjectConfig.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = ProjectConfig.webConfig.remoteUrl();
        }

        Configuration.browserCapabilities = capabilities;

    }
}
