package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")//читает значение (то что будет передаваться в консоль)
    @DefaultValue("https://github.com")//если ключ пустой то берет дефелтное
    String getBaseURL();//конвертирует результат

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    URL getRemoteUrl();
}
//последовательность:
//добавляем systemProperties в проект (билд гредл)
//добавляем зависимость 'org.aeonbits.owner:owner:1.0.12'
//создаем конфиг и прокидываем туда ключи