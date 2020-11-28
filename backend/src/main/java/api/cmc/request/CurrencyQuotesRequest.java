package api.cmc.request;

import api.Status;
import api.cmc.Coin;
import java.util.List;

/**
 * Data structure for cryptocurrency quotes latest request
 */
public class CurrencyQuotesRequest {

    private Status status;
    private List<Coin> coins;

    private CurrencyQuotesRequest() {}

    public Status getStatus() {
        return status;
    }

    public List<Coin> getData() {
        return coins;
    }

    @Override
    public String toString() {
        return "CurrencyQuotesRequest{" +
                "status=" + status +
                ", currencyQuotesData=" + coins +
                '}';
    }
}
