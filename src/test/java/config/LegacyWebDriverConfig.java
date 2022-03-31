package config;

import java.net.URL;
import java.util.Objects;

//разный браузер в заивсимости от входных параметров
//в файл прописывается конфигурация
public class LegacyWebDriverConfig {
    public String getBaseURL() {
        //return "https://github.com/";
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl="https://github.com/";
        }
        return baseUrl; //при использовании проперти
    }

    public boolean isRemote() {
        //return false; //дефолтное значение false без проперти
        String isRemote = System.getProperty("isRemote");
        if (Objects.isNull(isRemote)) {
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }
    public Browser getBrowser() {
        //return Browser.CHROME;//дефолтный запуск в хроме без проперти
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    //если есть удаленный браузер (развернули селенид)
    public URL getRemouteURL () {
        return null;
    }
}
