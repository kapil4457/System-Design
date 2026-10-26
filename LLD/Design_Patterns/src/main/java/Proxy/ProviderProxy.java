package Proxy;

public class ProviderProxy implements Provider{

    private Provider realProvider;
    private final ProviderType type;

    public ProviderProxy(ProviderType _type){
        this.type = _type;
    }


    @Override
    public String execute(String query) {
        if(realProvider == null){
            realProvider = ProviderFactory.create(type);
        }

        System.out.println("Proxy: authorizing request");
        return realProvider.execute(query);
    }
}
