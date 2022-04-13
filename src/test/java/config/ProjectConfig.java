package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import java.net.URL;

public class ProjectConfig {
    public static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !webConfig.remoteUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !webConfig.videoStorage().equals("");
    }

    public static String browserName() {
        return webConfig.browserName();
    }
    public static String configBrowserSize() {
        return webConfig.browserSize();
    }

}
