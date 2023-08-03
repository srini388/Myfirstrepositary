package com.example.jupiterwaves.demoCars.Controller;

import com.example.jupiterwaves.demoCars.model.Car;
import com.example.jupiterwaves.demoCars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{carId}")
    public ResponseEntity<Car> getCarById(@PathVariable long carId) {
        Car car = carService.getCarById(carId);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }



    @PostMapping
    public ResponseEntity<Car> saveCar(@RequestBody Car car) {
        Car savedCar = carService.saveCar(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }



    @DeleteMapping("/{carId}")
    public ResponseEntity<Void> deleteCarById(@PathVariable long carId) {
        carService.deleteCarById(carId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
