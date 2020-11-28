package api.cmc.cryptocurrency.quotes;

import java.math.BigDecimal;

public class CurrencyQuote {

    private CurrencyQuote() {}

    private CurrencyQuoteUsdContainer usd;

    public BigDecimal getPrice() {
        return usd.price;
    }

    public BigDecimal getVolume24h() {
        return usd.volume24h;
    }

    public BigDecimal getPercentchange1h() {
        return usd.percentchange1h;
    }

    public BigDecimal getPercentchange24h() {
        return usd.percentchange24h;
    }

    public BigDecimal getPercentchange7d() {
        return usd.percentchange7d;
    }

    public BigDecimal getMarketcap() {
        return usd.marketcap;
    }

    public String getLastupdated() {
        return usd.lastupdated;
    }

    private static class CurrencyQuoteUsdContainer {

        private BigDecimal price;
        private BigDecimal volume24h;
        private BigDecimal percentchange1h;
        private BigDecimal percentchange24h;
        private BigDecimal percentchange7d;
        private BigDecimal marketcap;
        private String lastupdated;

    }
}
