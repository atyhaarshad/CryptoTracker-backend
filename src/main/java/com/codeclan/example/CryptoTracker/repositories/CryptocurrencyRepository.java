package com.codeclan.example.CryptoTracker.repositories;

import com.codeclan.example.CryptoTracker.models.Cryptocurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long> {
}