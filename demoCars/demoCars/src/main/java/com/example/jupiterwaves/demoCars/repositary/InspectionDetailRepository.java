package com.example.jupiterwaves.demoCars.repositary;

import com.example.jupiterwaves.demoCars.model.InspectionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InspectionDetailRepository extends JpaRepository<InspectionDetails,Long> {
}
