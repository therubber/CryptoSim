const fetch = require("node-fetch");
const {getCmcApiKey} = require("./config");

const apikey = getCmcApiKey();

getGlobalMetrics();

function getGlobalMetrics () {
    request('https://pro-api.coinmarketcap.com/v1/global-metrics/quotes/latest?CMC_PRO_API_KEY=', apikey);
}

function request(url, apiquery) {
    fetch(url + apiquery)
        .then(function(res) {
            return res.json();})
        .then(function(data){
            console.dir(data, { depth: null });
        });
}