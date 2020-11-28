package api.cmc.dao;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import scriptrunner.Scriptrunner;
import api.cmc.factories.GlobalMetricsFactory;
import api.cmc.request.GlobalMetricsRequest;

public class GlobalMetricsDao extends Scriptrunner {

    private static final String GLOBAL_METRICS_SCRIPT = "/Users/ruben/IdeaProjects/CryptoSim/cmcapi/globalMetrics.js";

    public static void main(String[] args) {
        GlobalMetricsFactory globalMetricsFactory = new GlobalMetricsFactory();
        GlobalMetricsRequest globalMetricsRequest = globalMetricsFactory.globalMetricsFromJsonElement(new GlobalMetricsDao().fetch());

        System.out.println(new Gson().toJson(globalMetricsRequest));
        System.out.println(globalMetricsRequest);
    }

    public JsonElement fetch() {
        String result = formatString(run(GLOBAL_METRICS_SCRIPT));
        return JsonParser.parseString(result);
    }

    public static String formatString(String input) {
        return input.replace("_", "")
                .replace("data", "globalMetricsData")
                .replace("quote", "globalMetricsDataQuote")
                .replace("USD", "globalMetricsDataQuoteUsdContainer");
    }
}
