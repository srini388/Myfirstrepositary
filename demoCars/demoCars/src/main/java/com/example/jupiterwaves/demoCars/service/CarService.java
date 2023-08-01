package com.example.jupiterwaves.demoCars.service;

import com.example.jupiterwaves.demoCars.exception.ResourceNotFoundException;
import com.example.jupiterwaves.demoCars.model.Car;
import com.example.jupiterwaves.demoCars.repositary.CarRepository;
import org.springframework.stereotype.Service;

@Service

 public class CarService {

    private CarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(long carId) {
        return carRepository.findById(carId).orElseThrow(() -> new ResourceNotFoundException("Car service not exist with carId:" + carId));

    }

    public void deleteCarById(long carId) {
         carRepository.deleteById(carId);

    }
}
