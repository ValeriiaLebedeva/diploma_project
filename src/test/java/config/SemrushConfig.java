package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:config/semrush.properties"
})
public interface SemrushConfig extends Config{
    String webUrl();
    String login();
    String password();

}


