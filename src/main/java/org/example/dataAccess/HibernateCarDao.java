package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements  CarDao{
    public  void  add(Car car){
        System.out.println(car.getBrand()+" "+car.getModel() +" Araba Hibernate ile veritabanına eklendi");
    }
    public  void  delete(Car car){
        System.out.println(car.getBrand()+" "+car.getModel() +" Araba Hibernate ile veritabanına silindi");
    }
    public  void  update(Car car){
        System.out.println(car.getBrand()+" "+car.getModel() +" Araba Hibernate ile veritabanına güncellendi");
    }
}
