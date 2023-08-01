package com.example.jupiterwaves.demoCars.service;

import com.example.jupiterwaves.demoCars.model.CarService;


import java.util.List;

public interface CarServiceServiceI {
    public List<CarService> getAllCarService();
    public CarService create(CarService carService);
    public CarService getCarService(Long id);
    public  List<CarService> getAllCarservicesForACar(String carNumber);
    public CarService deleteCarService(Long id);
    public CarService updateCarService(Long id, CarService CarServiceDetails);
}
