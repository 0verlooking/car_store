package com.chmnu_ki_123.c3;

public class Main {
    public static void main(String[] args) {
        CarStore store = new CarStore("Super Auto Store");

        Car car1 = new Car("Toyota", "Camry", 2022, 25000, "Red");
        Car car2 = new Car("Honda", "Civic", 2021, 20000, "Blue");
        Car car3 = new Car("Ford", "Mustang", 2023, 45000, "Black");

        store.addCar(car1);
        store.addCar(car2);
        store.addCar(car3);

        store.displayAllCars();

        store.searchCarByMake("Toyota");
    }
}
