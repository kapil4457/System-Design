package Singleton;

public class ChatService {


    public void execute(){
        AppConfigManager config = AppConfigManager.getInstance();
        System.out.println(config.getDefaultProvider());
    }
}
