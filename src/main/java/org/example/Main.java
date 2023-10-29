package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.HibernateCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1= new Car(1,"BMW","320 ied",1350000);
        Car car2= new Car(2,"Mercedes","A180",1100000);
        Car car3= new Car(3,"Audi","A6",1450000);

        CarManager carManager=new CarManager(new HibernateCarDao());
        carManager.add(car1);
        carManager.delete(car2);
        carManager.update(car3);


    }
}