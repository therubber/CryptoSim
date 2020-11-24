const fetch = require('node-fetch');
const {getCmcApiKey} = require("./config");

const apikey = getCmcApiKey();

getLatestQuotes();

function getLatestQuotes() {
    request('https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?CMC_PRO_API_KEY=', apikey);
}

function request(url, apiquery) {
    fetch(url + apiquery)
        .then(function(res) {
            return res.json();})
        .then(function(data){
            console.dir(data, { depth: null });
        });
}