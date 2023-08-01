package com.example.jupiterwaves.demoCars.repositary;

import com.example.jupiterwaves.demoCars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<Car,Long> {
}
