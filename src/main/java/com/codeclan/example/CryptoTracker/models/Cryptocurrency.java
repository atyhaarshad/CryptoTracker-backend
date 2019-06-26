package com.codeclan.example.CryptoTracker.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cryptocurrencies")
public class Cryptocurrency implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cryptocurrency_id")
    private Long Id;

    @Column
    private String name;

    @Column
    private String code;

    @Column
    private int quantity;


    public Cryptocurrency( String name, String code, int quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;

    }

    public Cryptocurrency() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
