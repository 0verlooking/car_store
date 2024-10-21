package com.chmnu_ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class CarStoreTest {

    @Test
    public void testAddCar() {
        CarStore store = new CarStore("Auto Store");

        Car car = new Car("Toyota", "Camry", 2022, 25000, "Red");

        store.addCar(car);

        ArrayList<Car> carsInStore = store.getCars();
        assertEquals(1, carsInStore.size());
        assertEquals("Toyota", carsInStore.get(0).getMake());
    }

    @Test
    public void testSearchCarByMake() {
        CarStore store = new CarStore("Auto Store");

        Car car1 = new Car("Toyota", "Camry", 2022, 25000, "Red");
        Car car2 = new Car("Honda", "Civic", 2021, 20000, "Blue");
        store.addCar(car1);
        store.addCar(car2);

        ArrayList<Car> foundCars = store.searchCarByMake("Toyota");

        assertEquals(1, foundCars.size());
        assertEquals("Toyota", foundCars.get(0).getMake());
    }
}
