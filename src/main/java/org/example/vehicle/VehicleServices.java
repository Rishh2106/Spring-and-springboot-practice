package org.example.vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("VehicleServiesBean")
public class VehicleServices {
    public void makeSound(String s)
    {
        System.out.println("Sounds sponsored by "+ s);
    }
    public void rotate(String s)
    {
        System.out.println("Rotation Sponsored by " +s);
    }

}
