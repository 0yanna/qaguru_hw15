package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:iphone.properties")//classpath-все файлы из папки ресурсес(путь после папки ресурсес)
public interface IOSConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

}
