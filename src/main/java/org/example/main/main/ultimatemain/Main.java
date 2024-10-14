package org.example.main.main.ultimatemain;
import org.example.main.main.bean.*;
import org.example.main.main.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
       var empuse=new AnnotationConfigApplicationContext(configurationuse.class);
       Employee emp=empuse.getBean(Employee.class);
       emp.sayHello();
    }
}