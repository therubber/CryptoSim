package api.cmc.dao;

import api.cmc.factories.CurrencyQuotesFactory;
import api.cmc.request.CurrencyQuotesRequest;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import scriptrunner.Scriptrunner;

public class CurrencyQuotesDao extends Scriptrunner {

    private static final String GLOBAL_METRICS_SCRIPT = "/Users/ruben/IdeaProjects/CryptoSim/cmcapi/quotesLatest.js";
    private static final CurrencyQuotesFactory currencyQuotesFactory = new CurrencyQuotesFactory();

    public CurrencyQuotesRequest getRequest() {
        return currencyQuotesFactory.currencyQuotesRequestFromJsonElement(fetch());
    }

    JsonElement fetch() {
        String result = formatString(run(GLOBAL_METRICS_SCRIPT));
        return JsonParser.parseString(result);
    }

    static String formatString(String input) {
        return input.replace("_", "")
                .replace("data", "coins")
                .replace("quote", "currencyQuote")
                .replace("USD", "usd");
    }
}
