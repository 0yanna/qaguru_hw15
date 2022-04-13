package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"classpath:${Type}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browserName")//читает значение (то что будет передаваться в консоль)
    @DefaultValue("Chrome")
    String browserName();//конвертирует результат

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Key("timeout")
    int timeout();

}
//последовательность:
//добавляем systemProperties в проект (билд гредл)
//добавляем зависимость 'org.aeonbits.owner:owner:1.0.12'
//создаем конфиг и прокидываем туда ключи