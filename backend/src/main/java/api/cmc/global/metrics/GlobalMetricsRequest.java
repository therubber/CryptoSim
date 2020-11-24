package api.cmc.global.metrics;

import api.Status;

/**
 * Data Structure for cmc global metrics
 */
public class GlobalMetricsRequest {

    private GlobalMetricsRequest() {}

    private Status status;
    private GlobalMetricsData globalMetricsData;

    public Status getStatus() {
        return status;
    }

    public GlobalMetricsData getData() {
        return globalMetricsData;
    }
}