package api.cmc.global.metrics;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Data structure for data in GlobalMetrics
 */
public class GlobalMetricsData {

    private BigInteger activecryptocurrencies;
    private BigInteger totalcryptocurrencies;
    private BigInteger activemarketpairs;
    private BigInteger activeexchanges;
    private BigInteger totalexchanges;
    private BigDecimal ethdominance;
    private BigDecimal btcdominance;
    private BigDecimal defivolume24h;
    private BigDecimal defivolume24hreported;
    private BigDecimal defimarketcap;
    private BigDecimal defi24hpercentagechange;
    private BigDecimal stablecoinvolume24h;
    private BigDecimal stablecoinvolume24hreported;
    private BigDecimal stablecoinmarketcap;
    private BigDecimal stablecoin24hpercentagechange;
    private BigDecimal derivativesvolume24h;
    private BigDecimal derivativesvolume24hreported;
    private BigDecimal derivatives24hpercentagechange;
    private GlobalMetricsDataQuote globalMetricsDataQuote;
    private String lastupdated;

    public BigInteger getActiveCryptocurrencies() {
        return activecryptocurrencies;
    }

    public BigInteger getTotalCryptocurrencies() {
        return totalcryptocurrencies;
    }

    public BigInteger getActiveMarketPairs() {
        return activemarketpairs;
    }

    public BigInteger getActiveExchanges() {
        return activeexchanges;
    }

    public BigInteger getTotalExchanges() {
        return totalexchanges;
    }

    public BigDecimal getEthDominance() {
        return ethdominance;
    }

    public BigDecimal getBtcDominance() {
        return btcdominance;
    }

    public BigDecimal getDefiVolume24h() {
        return defivolume24h;
    }

    public BigDecimal getDefiVolume24hReported() {
        return defivolume24hreported;
    }

    public BigDecimal getDefiMarketCap() {
        return defimarketcap;
    }

    public BigDecimal getDefi24hPercentageChange() {
        return defi24hpercentagechange;
    }

    public BigDecimal getStablecoinVolume24h() {
        return stablecoinvolume24h;
    }

    public BigDecimal getStablecoinVolume24hReported() {
        return stablecoinvolume24hreported;
    }

    public BigDecimal getStablecoinMarketCap() {
        return stablecoinmarketcap;
    }

    public BigDecimal getStablecoin24hPercentageChange() {
        return stablecoin24hpercentagechange;
    }

    public BigDecimal getDerivativesVolume24h() {
        return derivativesvolume24h;
    }

    public BigDecimal getDerivativesVolume24hReported() {
        return derivativesvolume24hreported;
    }

    public BigDecimal getDerivatives24hPercentageChange() {
        return derivatives24hpercentagechange;
    }

    public GlobalMetricsDataQuote getQuote() {
        return globalMetricsDataQuote;
    }

    public String getLastUpdated() {
        return lastupdated;
    }

    @Override
    public String toString() {
        return "GlobalMetricsData{" +
                "activecryptocurrencies=" + activecryptocurrencies +
                ", totalcryptocurrencies=" + totalcryptocurrencies +
                ", activemarketpairs=" + activemarketpairs +
                ", activeexchanges=" + activeexchanges +
                ", totalexchanges=" + totalexchanges +
                ", ethdominance=" + ethdominance +
                ", btcdominance=" + btcdominance +
                ", defivolume24h=" + defivolume24h +
                ", defivolume24hreported=" + defivolume24hreported +
                ", defimarketcap=" + defimarketcap +
                ", defi24hpercentagechange=" + defi24hpercentagechange +
                ", stablecoinvolume24h=" + stablecoinvolume24h +
                ", stablecoinvolume24hreported=" + stablecoinvolume24hreported +
                ", stablecoinmarketcap=" + stablecoinmarketcap +
                ", stablecoin24hpercentagechange=" + stablecoin24hpercentagechange +
                ", derivativesvolume24h=" + derivativesvolume24h +
                ", derivativesvolume24hreported=" + derivativesvolume24hreported +
                ", derivatives24hpercentagechange=" + derivatives24hpercentagechange +
                ", globalMetricsDataQuote=" + globalMetricsDataQuote +
                ", lastupdated='" + lastupdated + '\'' +
                '}';
    }
}
