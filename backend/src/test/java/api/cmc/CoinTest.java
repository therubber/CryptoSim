package api.cmc;

import api.cmc.cryptocurrency.quotes.CurrencyQuote;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    private static Coin coin;

    @BeforeAll
    static void setUp() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TestCoin.txt"));

        coin = new Gson().fromJson(JsonParser.parseReader(bufferedReader), Coin.class);
    }

    @Test
    void getId() {
        assertEquals(BigInteger.ONE, coin.getId());
    }

    @Test
    void getName() {
        assertEquals("Bitcoin", coin.getName());
    }

    @Test
    void getSymbol() {
        assertEquals("BTC", coin.getSymbol());
    }

    @Test
    void getSlug() {
        assertEquals("bitcoin", coin.getSlug());
    }

    @Test
    void getNummarketpairs() {
        assertEquals(BigInteger.valueOf(9550), coin.getMarketPairCount());
    }

    @Test
    void getDateadded() {
        assertEquals("2013-04-28T00:00:00.000Z", coin.getDateAdded());
    }

    @Test
    void getTags() {
        assertEquals(List.of("mineable", "pow", "sha-256", "store-of-value", "state-channels"), coin.getTags());
    }

    @Test
    void getMaxSupply() {
        assertEquals(BigDecimal.valueOf(21000000), coin.getMaxSupply());
    }

    @Test
    void getCirculatingsupply() {
        assertEquals(BigDecimal.valueOf(18556056), coin.getCirculatingSupply());
    }

    @Test
    void getTotalsupply() {
        assertEquals(BigDecimal.valueOf(18556056), coin.getTotalSupply());
    }

    @Test
    void getPlatform() {
        assertNull(coin.getPlatform());
    }

    @Test
    void getCmcrank() {
        assertEquals(BigInteger.ONE, coin.getCmcRank());
    }

    @Test
    void getLastupdated() {
        assertEquals("2020-11-27T23:49:02.000Z", coin.getLastupdated());
    }

    @Nested
    @DisplayName("currency quote data is set")
    class currencyQuote {

        private final CurrencyQuote quote = coin.getCurrencyQuote();

        @Test
        void quoteDataSet() {
            assertNotNull(quote);
        }

        @Test
        void setsValues() {
            assertEquals(BigDecimal.valueOf(317657353872.8617), quote.getMarketCap());
        }
    }
}