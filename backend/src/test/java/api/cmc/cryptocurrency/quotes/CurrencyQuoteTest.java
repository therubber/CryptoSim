package api.cmc.cryptocurrency.quotes;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyQuoteTest {

    private static CurrencyQuote quote;

    @BeforeAll
    static void setUp() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TestQuote.txt"));

        quote = new Gson().fromJson(JsonParser.parseReader(bufferedReader), CurrencyQuote.class);
    }

    @Test
    void getPrice() {
        assertEquals(BigDecimal.valueOf(17118.796896973243), quote.getPrice());
    }

    @Test
    void getVolume24h() {
        assertEquals(BigDecimal.valueOf(38783009614.132904), quote.getVolume24h());
    }

    @Test
    void getPercentchange1h() {
        assertEquals(BigDecimal.valueOf(0.71789048), quote.getPercentchange1h());
    }

    @Test
    void getPercentchange24h() {
        assertEquals(BigDecimal.valueOf(-0.27879593), quote.getPercentchange24h());
    }

    @Test
    void getPercentchange7d() {
        assertEquals(BigDecimal.valueOf(-7.81548197), quote.getPercentchange7d());
    }

    @Test
    void getMarketCap() {
        assertEquals(BigDecimal.valueOf(317657353872.8617), quote.getMarketCap());
    }

    @Test
    void getLastupdated() {
        assertEquals("2020-11-27T23:49:02.000Z", quote.getLastupdated());
    }
}