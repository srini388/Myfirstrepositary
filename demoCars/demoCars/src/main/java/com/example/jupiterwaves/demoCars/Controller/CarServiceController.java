package com.example.jupiterwaves.demoCars.Controller;


import com.example.jupiterwaves.demoCars.model.Servicecenter;
import com.example.jupiterwaves.demoCars.service.ServiceCenterServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class CarServiceController {
    @Autowired
    private ServiceCenterServiceI serviceCenterService;

    @GetMapping("/serviceCenters")
    public List<Servicecenter> getAllServiceCenters() {
        return serviceCenterService.getAllServiceCenters();
    }

    @PostMapping("/serviceCenters/register")
    public Servicecenter createServiceCenter(@RequestBody Servicecenter servicecenter){
        return serviceCenterService.createServiceCenter(servicecenter);
    }


    @GetMapping("/serviceCenters/{phoneNumber}")
    public Servicecenter getServiceCenterById(@PathVariable long phoneNumber){
        return serviceCenterService.getServiceCenter(phoneNumber);
    }
}
