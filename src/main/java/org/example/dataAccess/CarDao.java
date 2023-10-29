package org.example.dataAccess;

import org.example.entities.Car;

public interface CarDao {
    //şablon oluşturuyoruz.
    void add(Car car);
    void delete(Car car);
    void update(Car car);
}
