package config;

import org.aeonbits.owner.Config;

public interface TypeConfig  extends Config {

    @Key("Integer")
    Integer getInteger();

}
