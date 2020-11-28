package api.cmc;

import api.cmc.cryptocurrency.quotes.CurrencyQuote;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class Coin {

    private BigInteger id;
    private String name;
    private String symbol;
    private String slug;
    private BigInteger nummarketpairs;
    private String dateadded;
    private List<String> tags;
    private BigDecimal maxsupply;
    private BigDecimal circulatingsupply;
    private BigDecimal totalsupply;
    private Object platform;
    private BigInteger cmcrank;
    private String lastupdated;
    private CurrencyQuote currencyQuote;

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSlug() {
        return slug;
    }

    public BigInteger getMarketPairCount() {
        return nummarketpairs;
    }

    public String getDateAdded() {
        return dateadded;
    }

    public List<String> getTags() {
        return tags;
    }

    public BigDecimal getMaxSupply() {
        return maxsupply;
    }

    public BigDecimal getCirculatingSupply() {
        return circulatingsupply;
    }

    public BigDecimal getTotalSupply() {
        return totalsupply;
    }

    public Object getPlatform() {
        return platform;
    }

    public BigInteger getCmcRank() {
        return cmcrank;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public CurrencyQuote getCurrencyQuote() {
        return currencyQuote;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", slug='" + slug + '\'' +
                ", nummarketpairs=" + nummarketpairs +
                ", dateadded='" + dateadded + '\'' +
                ", tags=" + tags +
                ", totalsupply=" + totalsupply +
                ", circulatingsupply=" + circulatingsupply +
                ", platform=" + platform +
                ", cmcrank=" + cmcrank +
                ", lastupdated='" + lastupdated + '\'' +
                ", currencyQuote=" + currencyQuote +
                '}';
    }
}
