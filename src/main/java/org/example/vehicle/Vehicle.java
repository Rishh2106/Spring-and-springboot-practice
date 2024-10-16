package org.example.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("VehicleBean")
public class Vehicle {
    private final VehicleServices per;
@Autowired
    public Vehicle(VehicleServices vehService)
   {
       per=vehService;
   }
   public String CarName="BMW";
public void setCarName(String s)
{
    CarName=s;
}
public VehicleServices getService()
{
    return per;
}
}
