package org.example;
import org.example.beanuse.*;
import org.example.vehicle.*;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.image.AffineTransformOp;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var vehuse = new AnnotationConfigApplicationContext(beanss.class);
        vehicleuse bmw=new vehicleuse();
        bmw.nameuse("BMW");
        Supplier<vehicleuse> bmwSupplier=()->bmw;
        vehicleuse audi=new vehicleuse();
        audi.nameuse("Audi");
        Supplier<vehicleuse> audiSupplier=()->audi;
        Random rand=new Random();
        int random=rand.nextInt(10);
        System.out.println(random);
        if(random%2==0)
        {
            vehuse.registerBean("Bmw",vehicleuse.class,bmwSupplier);
        }
        else
        {
            vehuse.registerBean("Audi", vehicleuse.class,audiSupplier);
        }
        vehicleuse bmwcheck=null;
        vehicleuse audicheck=null;
        try
        {
            bmwcheck=vehuse.getBean("Bmw",vehicleuse.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException)
        {
            System.out.println("Bmw bean not created");
        }
        try
        {
            audicheck=vehuse.getBean("Audi",vehicleuse.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException)
        {
            System.out.println("Audi bean not created");
        }
        if(null!=bmwcheck)
        {
            bmw.sayHello();
        }
        else
        {
            audi.sayHello();
        }
    }
}