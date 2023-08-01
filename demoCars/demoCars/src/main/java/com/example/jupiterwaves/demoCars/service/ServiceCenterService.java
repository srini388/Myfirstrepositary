package com.example.jupiterwaves.demoCars.service;
import com.example.jupiterwaves.demoCars.exception.ResourceNotFoundException;
import com.example.jupiterwaves.demoCars.model.*;
import com.example.jupiterwaves.demoCars.repositary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCenterService implements ServiceCenterServiceI {


    @Autowired
    private ServiceCenterRepository serviceCenterRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private JobTemplateRepository templateRepository;


    public List<Servicecenter> getAllServiceCenters(){
        return serviceCenterRepository.findAll();
    }
    public Servicecenter createServiceCenter(Servicecenter serviceCenter){
        Address address = serviceCenter.getAddress();
        Address addressDB = addressRepository.save(address);
        serviceCenter.setAddress(addressDB);

        JobTemplate template = serviceCenter.getTemplate();
        System.out.println(template);
        JobTemplate templateDB = templateRepository.save(template);
        serviceCenter.setTemplate(templateDB);
        return serviceCenterRepository.save(serviceCenter);
    }

    public Servicecenter getServiceCenter(Long phoneNumber){
        Servicecenter serviceCenter = serviceCenterRepository.findById(phoneNumber).orElseThrow(()-> new ResourceNotFoundException("Service Center not exist with Phone Number:"+phoneNumber));
        return serviceCenter;
    }

    public Servicecenter deleteServiceCenter(Long phoneNumber){
        Servicecenter serviceCenter = serviceCenterRepository.findById(phoneNumber).orElseThrow(()
                -> new ResourceNotFoundException("Service Center not exist with Phone Number:"+phoneNumber));
        serviceCenterRepository.delete(serviceCenter);
        return serviceCenter;

    }

    public Servicecenter updateServiceCenter(Long phoneNumber, Servicecenter serviceCenterDetails){
        Servicecenter serviceCenter = serviceCenterRepository.findById(phoneNumber).orElseThrow(()
                -> new ResourceNotFoundException("Service Center not exist with Phone Number:"+phoneNumber));
        serviceCenter.setOwnerName(serviceCenterDetails.getOwnerName());
        return serviceCenterRepository.save(serviceCenter);


    }



}
