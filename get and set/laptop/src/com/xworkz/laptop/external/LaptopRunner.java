package com.xworkz.laptop.external;

import com.xworkz.laptop.dto.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptopDetails = new Laptop();
        laptopDetails.setScreenSize(15);
        int laptop = laptopDetails.getScreenSize();
        System.out.println("Laptop Screen Size (in inches): " + laptop);
    }
}