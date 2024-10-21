package com.chmnu_ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testCarConstructor() {
        Car car = new Car("Toyota", "Camry", 2022, 25000, "Red");

        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(25000, car.getPrice());
        assertEquals("Red", car.getColor());
    }

    @Test
    public void testSettersAndGetters() {
        Car car = new Car("Toyota", "Camry", 2022, 25000, "Red");

        car.setMake("Honda");
        car.setModel("Civic");
        car.setYear(2021);
        car.setPrice(20000);
        car.setColor("Blue");

        assertEquals("Honda", car.getMake());
        assertEquals("Civic", car.getModel());
        assertEquals(2021, car.getYear());
        assertEquals(20000, car.getPrice());
        assertEquals("Blue", car.getColor());
    }
}
