package com.example.jupiterwaves.demoCars.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

@Data
@Entity

public class InspectionDetails {
    @Id
    private long id;
    private Map<String, Boolean> partsInspected;
    private List<String> notes;
}
