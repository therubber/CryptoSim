package api.cmc.global.metrics;

import api.cmc.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    private Coin coin;
    private final String TEST_NAME = "TEST";
    private final String TEST_TICKER = "TCN";
    private static final BigInteger TEST_MAX_SUPPLY = new BigInteger("21000000");

    @BeforeEach
    public void setUp() {
        coin = new Coin(TEST_NAME, TEST_TICKER, TEST_MAX_SUPPLY);
    }

    @Test
    @DisplayName("Has name")
    void hasName() {
        assertEquals(TEST_NAME, coin.getName());
    }

    @Test
    @DisplayName("Has ticker")
    void hasTicker() {
        assertEquals(TEST_TICKER, coin.getTicker());
    }

    @Test
    @DisplayName("Has max supply")
    void hasMaxSupply() {
        assertEquals(TEST_MAX_SUPPLY, coin.getMaxSupply());
    }

    @Test
    @DisplayName("Price can be set")
    void priceCanBeSet() {

        Double priceToBeSet = 123.456;

        coin.setCurrentPrice(priceToBeSet);

        assertEquals(priceToBeSet, coin.getCurrentPrice());
    }

}