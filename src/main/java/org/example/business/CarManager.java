package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class CarManager {
    private  CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public void add(Car car) throws Exception {

        if (car.getUnitPrice()<100000){
            throw  new Exception("Ürün fiyatı 100.000₺ den küçük olamaz");
        }


        carDao.add(car);
    }
    public void delete(Car car) throws Exception {

        if (car.getId()<-1){
            throw  new Exception("Yalnış id Araba silinemez");
        }


        carDao.delete(car);
    }
    public void update (Car car) throws  Exception{
        if(car.getId()<-1){
            throw  new Exception("Yalnış id Araba güncellenemez");
        }

        carDao.update(car);
    }

}
