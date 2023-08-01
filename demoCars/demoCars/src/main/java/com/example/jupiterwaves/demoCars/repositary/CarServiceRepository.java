package com.example.jupiterwaves.demoCars.repositary;

import com.example.jupiterwaves.demoCars.model.CarService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarServiceRepository extends JpaRepository<CarService,Long> {
}
