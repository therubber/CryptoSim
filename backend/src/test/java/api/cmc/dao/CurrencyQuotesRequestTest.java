package api.cmc.dao;

import api.Status;
import api.cmc.Coin;
import api.cmc.request.CurrencyQuotesRequest;
import api.cmc.factories.CurrencyQuotesFactory;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyQuotesRequestTest {

    private static CurrencyQuotesRequest currencyQuotesRequest;

    @BeforeAll
    static void setUp() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TestListingsFile.txt"));

        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        String formattedString = CurrencyQuotesDao.formatString(stringBuilder.toString());

        JsonElement globalMetricsJsonElement = JsonParser.parseString(formattedString);

        currencyQuotesRequest = new CurrencyQuotesFactory().currencyQuotesRequestFromJsonElement(globalMetricsJsonElement);
    }

    @Test
    void hasStatus() {
        assertNotNull(currencyQuotesRequest.getStatus());
    }

    @Test
    void hasCurrencyQuotesData() {
        assertNotNull(currencyQuotesRequest.getData());
    }

    @Nested
    @DisplayName("sets correct status values")
    class StatusValues {

        private final Status status = currencyQuotesRequest.getStatus();

        @Test
        void timestamp() {
            assertEquals("2020-11-27T23:50:36.262Z", status.getTimestamp());
        }

        @Test
        void errorCode() {
            assertEquals(0, status.getErrorcode());
        }

        @Test
        void errorMessage() {
            assertEquals("", status.getErrormessage());
        }

        @Test
        void elapsed() {
            assertEquals(16, status.getElapsed());
        }

        @Test
        void creditCount() {
            assertEquals(1, status.getCreditcount());
        }

        @Test
        void notice() {
            assertEquals("", status.getNotice());
        }
    }

    @Test
    void hasData() {
        assertNotNull(currencyQuotesRequest.getData());
    }

    @Nested
    @DisplayName("gets coin data")
    class RequestValues {

        private final List<Coin> currencyQuotesData = currencyQuotesRequest.getData();
        private final Coin bitcoin = currencyQuotesData.get(0);

        @Test
        void dataIsArray() {
            assertNotNull(currencyQuotesData);
        }

        @Test
        void dataCointainsAllRequestedCoins() {
            assertEquals(100, currencyQuotesData.size());
        }

        @Test
        void arrayContainsCoinObjects() {
            assertNotNull(bitcoin);
        }

        @Test
        void setsTags() {
            List<String> tags = bitcoin.getTags();
            assertTrue(tags.contains("store-of-value"));
        }

        @Test
        void setsQuote() {
            assertNotNull(bitcoin.getCurrencyQuote());
        }

        @Test
        void setsCorrectPrice() {
            assertEquals(BigDecimal.valueOf(17118.796896973243), bitcoin.getCurrencyQuote().getPrice());
        }
    }
}