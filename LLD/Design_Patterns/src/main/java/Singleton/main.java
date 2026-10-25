package Singleton;

public class main {
    public static void main(String[] args) {

        ChatService chatService = new ChatService();
        ExternalClientService externalClientService = new ExternalClientService();


        chatService.execute();
        externalClientService.call();



//        AppConfigManager config1 = AppConfigManager.getInstance();
//        AppConfigManager config2 = AppConfigManager.getInstance();

//        System.out.println(config1==config2);


    }
}
