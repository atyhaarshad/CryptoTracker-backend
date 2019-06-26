package com.codeclan.example.CryptoTracker.repositories;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CryptocurrencyRepositoryImpl implements CryptocurrencyRepositoryCustom {

    @Autowired
    EntityManager entityManager;


}
