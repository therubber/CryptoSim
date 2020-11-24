package api.cmc;

import java.math.BigInteger;

public class Coin {

    private final String NAME;
    private final String TICKER;
    private final BigInteger MAX_SUPPLY;
    private Double currentPrice;

    public Coin(String name, String ticker, BigInteger maxSupply) {
        this.NAME = name;
        this.TICKER = ticker;
        this.MAX_SUPPLY = maxSupply;
    }

    public String getName() {
        return NAME;
    }

    public String getTicker() {
        return TICKER;
    }

    public BigInteger getMaxSupply() {
        return MAX_SUPPLY;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }
}
