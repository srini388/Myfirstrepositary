package com.example.jupiterwaves.demoCars.Controller;

import com.example.jupiterwaves.demoCars.model.CarService;
import com.example.jupiterwaves.demoCars.service.CarServiceServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class CarServiceController {

    @Autowired
    private CarServiceServiceI CarServiceService;


    @GetMapping("/services")
    public List<CarService> getAllcarservices() {
        return getAllcarservices();
    }

    @PostMapping("/services/register")
    public CarService createCarService(@RequestBody CarService CarService){
        return CarServiceService.createCarService(CarService);
    }

    @GetMapping("/services/{id}")
    public CarService getcarserviceByid(@PathVariable long id){
        return CarServiceService.getCarService(id);

    }
}
