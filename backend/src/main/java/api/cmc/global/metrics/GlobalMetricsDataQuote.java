package api.cmc.global.metrics;

import java.math.BigDecimal;

public class GlobalMetricsDataQuote {

    private GlobalMetricsDataQuoteUsdContainer globalMetricsDataQuoteUsdContainer;

    public BigDecimal getTotalMarketCap() {
        return globalMetricsDataQuoteUsdContainer.totalmarketcap;
    }

    public BigDecimal getTotalVolume24h() {
        return globalMetricsDataQuoteUsdContainer.totalvolume24h;
    }

    public BigDecimal getTotalVolume24hReported() {
        return globalMetricsDataQuoteUsdContainer.totalvolume24hreported;
    }

    public BigDecimal getAltcoinVolume24h() {
        return globalMetricsDataQuoteUsdContainer.altcoinvolume24h;
    }

    public BigDecimal getAltcoinVolume24hReported() {
        return globalMetricsDataQuoteUsdContainer.altcoinvolume24hreported;
    }

    public BigDecimal getAltcoinMarketCap() {
        return globalMetricsDataQuoteUsdContainer.altcoinmarketcap;
    }

    public String getLastUpdated() {
        return globalMetricsDataQuoteUsdContainer.lastupdated;
    }

    private static class GlobalMetricsDataQuoteUsdContainer {

        private BigDecimal totalmarketcap;
        private BigDecimal totalvolume24h;
        private BigDecimal totalvolume24hreported;
        private BigDecimal altcoinvolume24h;
        private BigDecimal altcoinvolume24hreported;
        private BigDecimal altcoinmarketcap;
        private String lastupdated;

    }
}
