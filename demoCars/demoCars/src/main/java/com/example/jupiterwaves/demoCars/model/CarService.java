package com.example.jupiterwaves.demoCars.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Entity

public class CarService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    private int kmsRan;
    private Date serviceStartDate;
    private Date serviceEndDate;
    private ServiceStatus status;

    @OneToOne
    @JoinColumn(name="inspectionDetails_id")
    private InspectionDetails inspectionDetails;

    @ElementCollection
    @MapKeyColumn(name = "string_col")
    @Column(name = "boolean_col")
    private Map<String,Boolean> services;
    @ElementCollection
    private List<String> serviceNotes;
}
