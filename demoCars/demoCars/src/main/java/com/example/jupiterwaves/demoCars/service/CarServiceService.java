package com.example.jupiterwaves.demoCars.service;

import com.example.jupiterwaves.demoCars.exception.ResourceNotFoundException;

import com.example.jupiterwaves.demoCars.model.Car;
import com.example.jupiterwaves.demoCars.model.CarService;
import com.example.jupiterwaves.demoCars.model.InspectionDetails;
import com.example.jupiterwaves.demoCars.repositary.CarRepository;
import com.example.jupiterwaves.demoCars.repositary.CarServiceRepository;
import com.example.jupiterwaves.demoCars.repositary.InspectionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class CarServiceService implements CarServiceServiceI {
    @Autowired
    private CarServiceRepository carServiceRepository;
    @Autowired
    private InspectionDetailRepository inspectionDetailRepository;

    @Override
    public List<CarService> getAllCarService() {
        return carServiceRepository.findAll();
    }

    @Override
    public CarService createCarService(CarService carService) {


        InspectionDetails inspectionDetails = carService.getInspectionDetails();
        InspectionDetails inspectionDetailsDB = inspectionDetailRepository.save(inspectionDetails);
        carService.setInspectionDetails(inspectionDetailsDB);


        return carServiceRepository.save(carService);
    }

    @Override
    public CarService getCarService(Long id) {
        CarService carService = carServiceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car service not exist with id:" + id));
        return carService;
    }

    @Override
    public List<CarService> getAllCarservicesForACar(String carNumber) {
        List<CarService> allCarServices = carServiceRepository.findAll();


        List<CarService> carServicesOfACar = new ArrayList<>();
        for (CarService carService : allCarServices) {
            if (carNumber.equals(carService.getCar().getCarNumber()))
                carServicesOfACar.add(carService);

        }

        return carServicesOfACar;
    }

    @Override
    public CarService deleteCarService(Long id) {
        CarService carService= carServiceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car service not exist with id:" + id));
        carServiceRepository.delete(carService);
        return carService;


    }

    @Override
    public CarService updateCarService(Long id, CarService CarServiceDetails) {
        CarService carService = carServiceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car service not exist with id:" + id));
        return carServiceRepository.save(carService);
    }
}
