package com.codeclan.example.CryptoTracker.components;

import com.codeclan.example.CryptoTracker.models.Cryptocurrency;


import com.codeclan.example.CryptoTracker.repositories.CryptocurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CryptocurrencyRepository cryptocurrencyRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Cryptocurrency bitcoin = new Cryptocurrency("Bitcoin", "BTC", 5);
        cryptocurrencyRepository.save(bitcoin);

        Cryptocurrency dash = new Cryptocurrency("Dash", "DASH", 2);
        cryptocurrencyRepository.save(dash);

        Cryptocurrency ethereum = new Cryptocurrency("Ethereum", "ETH", 1);
        cryptocurrencyRepository.save(ethereum);

        Cryptocurrency litecoin = new Cryptocurrency("Litecoin", "LTC", 2);
        cryptocurrencyRepository.save(litecoin);

    }

}
