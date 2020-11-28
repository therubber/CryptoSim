package api;

import api.cmc.request.CurrencyQuotesRequest;
import api.cmc.factories.CurrencyQuotesFactory;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {

    private Status status;
    private final static CurrencyQuotesFactory currencyQuotesFactory = new CurrencyQuotesFactory();

    @BeforeEach
    void setUp() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TestStatus.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        String formattedString = formatString(stringBuilder.toString());
        CurrencyQuotesRequest currencyQuotesRequest = currencyQuotesFactory.currencyQuotesRequestFromJsonElement(JsonParser.parseString(formattedString));
        status = currencyQuotesRequest.getStatus();
    }

    @Test
    void hasTimestamp() {
        assertEquals("test-timestamp", status.getTimestamp());
    }

    @Test
    void hasErrorCode() {
        assertEquals(1, status.getErrorcode());
    }

    @Test
    void hasErrorMessage() {
        assertEquals("test-error-message", status.getErrormessage());
    }

    @Test
    void hasElapsed() {
        assertEquals(1, status.getElapsed());
    }

    @Test
    void hasCreditCount() {
        assertEquals(1, status.getCreditcount());
    }

    @Test
    void hasNotice() {
        assertEquals("test-notice", status.getNotice());
    }

    private static String formatString(String input) {
        return input.replace("_", "");
    }
}