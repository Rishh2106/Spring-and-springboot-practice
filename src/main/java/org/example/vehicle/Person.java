
package org.example.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person {
    public String Name="Rishi";
    private final Vehicle veh;
    @Autowired
    public Person(Vehicle veh)
    {
        this.veh=veh;
    }
    public String getName()
    {
        return Name;
    }
    public Vehicle getVehicle()
    {
        return veh;
    }

}
