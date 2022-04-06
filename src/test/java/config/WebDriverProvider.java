package config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;
// для запуска на разных стендах, например
//в файле используется конфигурация которая написана где то
//public class WebDriverProvider implements Supplier<WebDriver> {
//    //private LegacyWebDriverConfig config = new LegacyWebDriverConfig(); для легаси
//    private final WebDriverConfig config;
//    public WebDriverProvider() {
//        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
 //   }

//   @Override
//   public WebDriver get() {
//       WebDriver driver = createWebDriver();
//       driver.get(config.getBaseURL());
//       return driver;

//   }
//   private WebDriver createWebDriver() {
//       if (Objects.nonNull(config.getBrowser())) {
//           switch (config.getBrowser()) {
//               case CHROME: {
//                   return new ChromeDriver();
//               }
//               case FIREFOX: {
//                   return new FirefoxDriver();
//               }
//               default: {
//                   throw new RuntimeException("Тип браузера не поддерживается");
//               }
//           }
//       }
//       throw new RuntimeException("Тип браузер не может быть null");
//   }

//
