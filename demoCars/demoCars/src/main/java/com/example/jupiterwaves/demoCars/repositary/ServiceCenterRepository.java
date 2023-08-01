package com.example.jupiterwaves.demoCars.repositary;

import com.example.jupiterwaves.demoCars.model.Servicecenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCenterRepository extends JpaRepository<Servicecenter, Long> {
}

