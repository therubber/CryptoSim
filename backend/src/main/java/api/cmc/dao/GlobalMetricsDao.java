package api.cmc.dao;

import api.cmc.factories.GlobalMetricsFactory;
import api.cmc.request.GlobalMetricsRequest;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import scriptrunner.Scriptrunner;
public class GlobalMetricsDao extends Scriptrunner {

    private static final String GLOBAL_METRICS_SCRIPT = "/Users/ruben/IdeaProjects/CryptoSim/cmcapi/globalMetrics.js";

    public GlobalMetricsRequest getRequest() {
        return new GlobalMetricsFactory().globalMetricsFromJsonElement(fetch());
    }

    JsonElement fetch() {
        String result = formatString(run(GLOBAL_METRICS_SCRIPT));
        return JsonParser.parseString(result);
    }

    static String formatString(String input) {
        return input.replace("_", "")
                .replace("data", "globalMetricsData")
                .replace("quote", "globalMetricsDataQuote")
                .replace("USD", "globalMetricsDataQuoteUsdContainer");
    }
}
