package com.example.jupiterwaves.demoCars.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String add1;
    private String add2;
    private String city;
    private String pincode;
    private Double latitude;
    private Double longitude;
}
