package owner;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launch}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browserstack.userName")
    String getUserName();

    @Key("browserstack.accessKey")
    String getAccessKey();


    @Key("browserstack.url")
    String getUrl();

    @Key("browserstack.device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("browserstack.os_version")
    @DefaultValue("9.0")
    String getOS();

    @Key("browserstack.app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getApp();
}