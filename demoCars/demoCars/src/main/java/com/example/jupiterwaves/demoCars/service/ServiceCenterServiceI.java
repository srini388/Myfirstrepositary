package com.example.jupiterwaves.demoCars.service;
import com.example.jupiterwaves.demoCars.model.Servicecenter;

import java.util.List;

public interface ServiceCenterServiceI {
    public List<Servicecenter>getAllServiceCenters();
    public Servicecenter createServiceCenter(Servicecenter serviceCenter);
    public Servicecenter getServiceCenter(Long phoneNumber);
    public Servicecenter deleteServiceCenter(Long phoneNumber);
    public Servicecenter updateServiceCenter(Long phoneNumber, Servicecenter serviceCenterDetails);

}
