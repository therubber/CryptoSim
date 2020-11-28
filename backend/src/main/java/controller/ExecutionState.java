package controller;

import api.cmc.Coin;
import api.cmc.dao.CurrencyQuotesDao;
import api.cmc.dao.GlobalMetricsDao;
import api.cmc.global.metrics.GlobalMetricsData;
import controller.printer.CoinDataPrinter;
import controller.printer.GlobalMetricsPrinter;
import java.util.ArrayList;
import java.util.List;

public class ExecutionState {

    private List<Coin> coins = new ArrayList<>();
    private GlobalMetricsData globalMetricsData;
    private boolean finished;

    public ExecutionState(boolean finished) {
        this.finished = finished;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished() {
        this.finished = true;
    }

    public void printGlobalMetrics() {
        if(globalMetricsData == null) {
            globalMetricsData = new GlobalMetricsDao().getRequest().getData();
        }
        new GlobalMetricsPrinter(globalMetricsData).print();
    }

    public void printCoinPriceList() {
        if(coins.isEmpty()) {
            coins = new CurrencyQuotesDao().getRequest().getData();
        }
        new CoinDataPrinter(coins).printCoinPriceList();
    }
}
