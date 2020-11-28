package api.cmc.factories;

import api.cmc.request.CurrencyQuotesRequest;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class CurrencyQuotesFactory {

    private final Gson gson = new Gson();

    public CurrencyQuotesRequest currencyQuotesRequestFromJsonElement(JsonElement jsonElement) {
        return gson.fromJson(jsonElement.getAsJsonObject(), CurrencyQuotesRequest.class);
    }
}
