package com.xworkz.collage.external;

import com.xworkz.collage.dto.Collage;

public class CollageRunner {
    public static void main(String[] args) {
        Collage collegeDetails = new Collage();
        collegeDetails.setName("IIT Bombay");
        String college = collegeDetails.getName();
        System.out.println("College Name: " + college);
    }
}