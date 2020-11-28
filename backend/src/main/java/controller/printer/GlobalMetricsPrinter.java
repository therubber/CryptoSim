package controller.printer;

import api.cmc.global.metrics.GlobalMetricsData;
import java.math.RoundingMode;

public class GlobalMetricsPrinter {

    private final GlobalMetricsData globalMetricsData;

    public GlobalMetricsPrinter(GlobalMetricsData globalMetricsData) {
        this.globalMetricsData = globalMetricsData;
    }

    public void print() {
        System.out.format("Active Cryptocurrencies: %d%n", globalMetricsData.getActiveCryptocurrencies());
        System.out.format("Total Cryptocurrencies: %d%n", globalMetricsData.getTotalCryptocurrencies());
        System.out.format("Active Market Pairs: %d%n", globalMetricsData.getActiveMarketPairs());
        System.out.format("Active Exchanges: %d%n", globalMetricsData.getActiveExchanges());
        System.out.format("Total Exchanges: %d%n", globalMetricsData.getTotalExchanges());
        System.out.format("ETH Dominance: %s%n", globalMetricsData.getEthDominance().setScale(2, RoundingMode.HALF_UP));
        System.out.format("BTC Dominance: %s%n", globalMetricsData.getBtcDominance().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Defi Volume 24h: %s%n", globalMetricsData.getDefiVolume24h().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Defi Volume 24h Reported: %s%n", globalMetricsData.getDefiVolume24hReported().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Defi Market Cap: %s%n", globalMetricsData.getDefiMarketCap().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Defi 24h Change: %s%n", globalMetricsData.getDefi24hPercentageChange().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Stablecoin Volume 24h: %s%n", globalMetricsData.getStablecoinVolume24h().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Stablecoin Volume 24h Reported: %s%n", globalMetricsData.getStablecoinVolume24hReported().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Stablecoin Market Cap: %s%n", globalMetricsData.getStablecoinMarketCap().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Stablecoin 24h Change: %s%n", globalMetricsData.getStablecoin24hPercentageChange().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Derivatives Volume 24h: %s%n", globalMetricsData.getDerivativesVolume24h().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Derivatives Volume 24h Reported: %s%n", globalMetricsData.getDerivativesVolume24hReported().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Derivatives 24h Change: %s%n", globalMetricsData.getDerivatives24hPercentageChange().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Total Market Cap: %s%n", globalMetricsData.getTotalMarketCap().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Total Volume 24h: %s%n", globalMetricsData.getTotalVolume24h().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Total Volume 24h Reported: %s%n", globalMetricsData.getTotalVolume24hReported().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Altcoin Market Cap: %s%n", globalMetricsData.getAltcoinMarketCap().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Altcoin Volume 24h: %s%n", globalMetricsData.getAltcoinVolume24h().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Altcoin Volume 24h Reported: %s%n", globalMetricsData.getAltcoinVolume24hReported().setScale(2, RoundingMode.HALF_UP));
        System.out.format("Last Updated: %s%n", globalMetricsData.getLastUpdated());
    }
}
