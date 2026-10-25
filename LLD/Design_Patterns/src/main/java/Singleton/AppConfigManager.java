package Singleton;

public final class AppConfigManager {

        private String defaultProvider = "openai";
        private int requestTimeout = 30;
        private int maxRetries = 3;

        // EAGER
        // private static final AppConfigManager INSTANCE = new AppConfigManager();



        private AppConfigManager(){
            System.out.println("Config manager is initialized!");
        }



        // LAZY: NOT Thread sage
        private  static AppConfigManager INSTANCE;

        /*
        Thread A
        1: INSTANCE==NULL check passed
        2: CONTEXT SWITCH

        Thread B
        3: INSTANCE==NULL check passed
        4: CONTEXT SWITCH

         */
//        public static AppConfigManager getInstance(){
//            if(INSTANCE == null){
//                INSTANCE = new AppConfigManager();
//            }
//            return INSTANCE;
//        }



        // LAZY: Thread safe way

        private static class Holder{
            private static final AppConfigManager  INSTANCE = new AppConfigManager();
        }

        public static AppConfigManager getInstance(){
           return Holder.INSTANCE;
        }



        public String getDefaultProvider(){
            return this.defaultProvider;
        }

        public int getRequestTimeout(){
            return this.requestTimeout;
        }

        public int getMaxRetries(){
            return this.maxRetries;
        }

}
