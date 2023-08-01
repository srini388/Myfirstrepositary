package com.example.jupiterwaves.demoCars.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Entity

public class InspectionDetails {
    @Id
    private long id;
    @ElementCollection
    @MapKeyColumn(name = "string_col")
    @Column(name = "boolean_col")
    private Map<String, Boolean> partsInspected;
    @ElementCollection
    private List<String> notes;
}
