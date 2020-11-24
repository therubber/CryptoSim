package api.cmc.cryptocurrency.quotes;

import api.Status;

/**
 * Data structure for cryptocurrency quotes latest request
 */
public class CurrencyQuotesRequest {

    private Status status;
    private CurrencyQuotesData currencyQuotesData;

    private CurrencyQuotesRequest() {}

    public Status getStatus() {
        return status;
    }

    public CurrencyQuotesData getCryptocurrencyQuotesData() {
        return currencyQuotesData;
    }
}
