package com.example.jupiterwaves.demoCars.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
    @Entity
    public class Servicecenter {

        @Id
        private long phoneNumber;
        private boolean isActivated;
        private String name;
        private String ownerName;

        @OneToOne
        @JoinColumn(name = "address_id")
        private Address address;

        @OneToOne
        @JoinColumn(name = "template_id")
        private JobTemplate template;



        //@One To Many
        //private List<CarService> carServices;
    }

