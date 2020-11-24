package api.cmc.factories;

import api.cmc.global.metrics.GlobalMetricsRequest;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * Factory for cmc global metrics
 */
public class GlobalMetricsFactory {

    private final Gson gson = new Gson();

    public GlobalMetricsRequest globalMetricsFromJsonElement(JsonElement jsonElement) {
        return gson.fromJson(jsonElement.getAsJsonObject(), GlobalMetricsRequest.class);
    }
}
