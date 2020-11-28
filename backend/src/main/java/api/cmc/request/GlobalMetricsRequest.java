package api.cmc.request;

import api.Status;
import api.cmc.global.metrics.GlobalMetricsData;
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

    @Override
    public String toString() {
        return "GlobalMetricsRequest{" +
                "status=" + status +
                ", globalMetricsData=" + globalMetricsData +
                '}';
    }
}