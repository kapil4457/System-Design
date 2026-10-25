package Factory_and_Abstract_Factory_Pattern.ResponseFormatter;

import Factory_and_Abstract_Factory_Pattern.IResponseFormatter;

public class OpenAIResponseFormatter implements IResponseFormatter {
    @Override
    public String Format(String response) {
        return response.toLowerCase();
    }
}
