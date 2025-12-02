package com.xworkz.Car.external;

import com.xworkz.Car.dto.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car carDetails = new Car();
        carDetails.setModel("Tesla Model 3");
        String car = carDetails.getModel();
        System.out.println("Car Model: " + car);
    }
}