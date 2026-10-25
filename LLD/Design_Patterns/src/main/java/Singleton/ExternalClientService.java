package Singleton;

public class ExternalClientService {

    public void call(){
        AppConfigManager config = AppConfigManager.getInstance();

        System.out.println(config.getMaxRetries());
    }
}
