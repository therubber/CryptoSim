package api.cmc.dao;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import scriptrunner.Scriptrunner;

public class CurrencyQuotesDao extends Scriptrunner {

    private static final String GLOBAL_METRICS_SCRIPT = "/Users/ruben/IdeaProjects/CryptoSim/cmcapi/quotesLatest.js";

    public JsonElement fetch() {
        String result = formatString(run(GLOBAL_METRICS_SCRIPT));
        return JsonParser.parseString(result);
    }

    public static String formatString(String input) {
        return input.replace("_", "")
                .replace("data", "coins")
                .replace("quote", "currencyQuote")
                .replace("USD", "usd");
    }
}
