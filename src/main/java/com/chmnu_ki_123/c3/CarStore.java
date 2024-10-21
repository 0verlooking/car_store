package com.chmnu_ki_123.c3;

import java.util.ArrayList;

public class CarStore {
    private String storeName;
    private ArrayList<Car> cars;

    public CarStore(String storeName) {
        this.storeName = storeName;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void displayAllCars() {
        System.out.println("Cars available at " + storeName + ":");
        for (Car car : cars) {
            car.displayCarInfo();
            System.out.println("-------------------------");
        }
    }

    public ArrayList<Car> searchCarByMake(String make) {
        ArrayList<Car> foundCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make)) {
                foundCars.add(car);
            }
        }
        return foundCars; // Повертаємо знайдені автомобілі
    }
}
