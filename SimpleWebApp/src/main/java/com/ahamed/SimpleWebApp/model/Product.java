package com.ahamed.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {

    }
}
