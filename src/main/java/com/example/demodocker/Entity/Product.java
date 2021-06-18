package com.example.demodocker.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@Document(collation = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Integer id;
    @Column(name = "gia")
    private String price;
    @Column(name = "maSp")
    private String code;
}
