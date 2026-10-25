package Factory_and_Abstract_Factory_Pattern;

public interface IProviderFactory {

    IProvider CreateProvider();
    IContextFormatter CreateContextFormatter();
    IResponseFormatter CreateResponseFormatter();
}
