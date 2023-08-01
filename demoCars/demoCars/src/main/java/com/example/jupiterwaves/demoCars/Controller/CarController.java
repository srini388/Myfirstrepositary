package com.example.jupiterwaves.demoCars.Controller;

import com.example.jupiterwaves.demoCars.model.Car;
import com.example.jupiterwaves.demoCars.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class CarController {
    @Autowired
    private Car car;

    @GetMapping("/car")
    public List<CarService> getAllcar() {
        return getAllcar();
    }

    @PostMapping("/car/register")
    public Car createCar(@RequestBody Car Car){
        return Car.createcar(Car);
    }

    @GetMapping("/car/{id}")
    public Car getcarByid(@PathVariable long id){
        return Car.getBy(id);

    }
}
