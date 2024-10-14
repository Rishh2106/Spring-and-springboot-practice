package org.example.vehicle;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
public class vehicleuse {
    private String name;
    public void nameuse(String name)
    {
        this.name=name;
    }

    public void sayHello()
    {
        System.out.println("Hello the name is "+ name);
    }
    @PreDestroy
    public void enduse()
    {
        System.out.println("Uda diya bomb se");
    }
}
