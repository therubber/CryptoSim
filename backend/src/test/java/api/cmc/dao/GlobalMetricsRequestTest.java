package api.cmc.dao;

import api.cmc.dao.GlobalMetricsDao;
import api.cmc.factories.GlobalMetricsFactory;
import api.cmc.global.metrics.GlobalMetricsData;
import api.cmc.global.metrics.GlobalMetricsDataQuote;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import api.cmc.request.GlobalMetricsRequest;
import api.Status;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class GlobalMetricsRequestTest {

    private static GlobalMetricsRequest globalMetricsRequest;

    @BeforeAll
    static void setUp() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TestJsonElementAsText.txt"));

        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        String formattedString = GlobalMetricsDao.formatString(stringBuilder.toString());

        JsonElement globalMetricsJsonElement = JsonParser.parseString(formattedString);

        globalMetricsRequest = new GlobalMetricsFactory().globalMetricsFromJsonElement(globalMetricsJsonElement);
    }

    @Test
    void hasStatus() {
        assertNotNull(globalMetricsRequest.getStatus());
    }

    @Nested
    @DisplayName("sets correct status values")
    class StatusValues {

        private final Status status = globalMetricsRequest.getStatus();

        @Test
        void timestamp() {
            assertEquals("2020-11-24T21:14:26.518Z", status.getTimestamp());
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
            assertEquals(13, status.getElapsed());
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
        assertNotNull(globalMetricsRequest.getData());
    }

    @Nested
    @DisplayName("sets correct data values")
    class GlobalMetricsRequestValues {

        private final GlobalMetricsData globalMetricsData = globalMetricsRequest.getData();

        @Test
        void activeCryptocurrencies() {
            assertEquals(BigInteger.valueOf(3821), globalMetricsData.getActiveCryptocurrencies());
        }

        @Test
        void totalCryptocurrencies() {
            assertEquals(BigInteger.valueOf(7764), globalMetricsData.getTotalCryptocurrencies());
        }

        @Test
        void activeMarketPairs() {
            assertEquals(BigInteger.valueOf(33383), globalMetricsData.getActiveMarketPairs());
        }

        @Test
        void activeExchanges() {
            assertEquals(BigInteger.valueOf(389), globalMetricsData.getActiveExchanges());
        }

        @Test
        void total_exchanges() {
            assertEquals(BigInteger.valueOf(1220), globalMetricsData.getTotalExchanges());
        }

        @Test
        void ethDominance() {
            assertEquals(BigDecimal.valueOf(11.946110282419), globalMetricsData.getEthDominance());
        }

        @Test
        void btcDominance() {
            assertEquals(BigDecimal.valueOf(61.264289520741), globalMetricsData.getBtcDominance());
        }

        @Test
        void defiVolumeDay() {
            assertEquals(BigDecimal.valueOf(7924505563.304913), globalMetricsData.getDefiVolume24h());
        }

        @Test
        void defiVolumeDayReported() {
            assertEquals(BigDecimal.valueOf(14056308367.344604), globalMetricsData.getDefiVolume24hReported());
        }

        @Test
        void defiMarketCap() {
            assertEquals(BigDecimal.valueOf(18433299754.62453), globalMetricsData.getDefiMarketCap());
        }

        @Test
        void defiDayPercentageChange() {
            assertEquals(BigDecimal.valueOf(23.511442943495), globalMetricsData.getDefi24hPercentageChange());
        }

        @Test
        void stablecoinVolumeDay() {
            assertEquals(BigDecimal.valueOf(105323548071.49533), globalMetricsData.getStablecoinVolume24h());
        }

        @Test
        void stablecoinVolumeDayReported() {
            assertEquals(BigDecimal.valueOf(189693193838.89014), globalMetricsData.getStablecoinVolume24hReported());
        }

        @Test
        void stablecoinMarketCap() {
            assertEquals(BigDecimal.valueOf(26695537696.31735), globalMetricsData.getStablecoinMarketCap());
        }

        @Test
        void stablecoinDayPercentageChange() {
            assertEquals(BigDecimal.valueOf(23.496608864456), globalMetricsData.getStablecoin24hPercentageChange());
        }

        @Test
        void derivativesVolumeDay() {
            assertEquals(BigDecimal.valueOf(86259371715.6703), globalMetricsData.getDerivativesVolume24h());
        }

        @Test
        void derivativesVolumeDayReported() {
            assertEquals(BigDecimal.valueOf(86260195551.90877), globalMetricsData.getDerivativesVolume24hReported());
        }

        @Test
        void derivativesVolumeDayPercentageChange() {
            assertEquals(BigDecimal.valueOf(24.954017720405), globalMetricsData.getDerivatives24hPercentageChange());
        }

        @Test
        void lastUpdated() {
            assertEquals("2020-11-24T21:10:18.000Z", globalMetricsData.getLastUpdated());
        }

        @Nested
        @DisplayName("Test for quote subobject")
        class dataQuoteTest {

            private final GlobalMetricsDataQuote globalMetricsDataQuote = globalMetricsData.getQuote();

            @Test
            void totalMarketCap() {
                assertEquals(BigDecimal.valueOf(576679621025.4098), globalMetricsDataQuote.getTotalMarketCap());
            }

            @Test
            void totalVolumeDay() {
                assertEquals(BigDecimal.valueOf(272893350807.67905), globalMetricsDataQuote.getTotalVolume24h());
            }

            @Test
            void totalVolumeDayReported() {
                assertEquals(BigDecimal.valueOf(492329655974.9357), globalMetricsDataQuote.getTotalVolume24hReported());
            }

            @Test
            void altcoinVolumeDay() {
                assertEquals(BigDecimal.valueOf(222065388448.8275), globalMetricsDataQuote.getAltcoinVolume24h());
            }

            @Test
            void altcoinVolumeDayReported() {
                assertEquals(BigDecimal.valueOf(392710069462.23), globalMetricsDataQuote.getAltcoinVolume24hReported());
            }

            @Test
            void altcoinMarketCap() {
                assertEquals(BigDecimal.valueOf(223380948393.29254), globalMetricsDataQuote.getAltcoinMarketCap());
            }

            @Test
            void lastUpdated() {
                assertEquals("2020-11-24T21:10:18.000Z", globalMetricsDataQuote.getLastUpdated());
            }
        }
    }
}