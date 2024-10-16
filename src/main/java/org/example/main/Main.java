package org.example.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.vehicle.*;
import org.example.beans.*;
public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(projectconfig.class);
        Person per= context.getBean("PersonBean",Person.class);
        per.getVehicle().setCarName("Huandai");
        System.out.println(per.getName());
        System.out.println(per.getVehicle().CarName);
        Vehicle veh=context.getBean("VehicleBean", Vehicle.class);
        veh.getService().makeSound("Boat");
    }
}