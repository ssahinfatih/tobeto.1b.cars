package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao{

     public  void  add(Car car){
         System.out.println(car.getBrand()+" "+car.getModel() +" Araba Jdbc ile veritabanına eklendi");
     }
    public  void  delete(Car car){
        System.out.println(car.getBrand()+" "+car.getModel() +" Araba Jdbc ile veritabanına silindi");
    }
    public  void  update(Car car){
        System.out.println(car.getBrand()+" "+car.getModel() +" Araba Jdbc ile veritabanına güncellendi");
    }
}
