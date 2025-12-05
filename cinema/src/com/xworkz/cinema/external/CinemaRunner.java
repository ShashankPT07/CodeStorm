package com.xworkz.cinema.external;

import com.xworkz.cinema.dto.CinemaDeatils;

public class CinemaRunner {
    public static void main(String[] args) {
        CinemaDeatils cinemaDeatils = new CinemaDeatils();
        cinemaDeatils.setPrice(120);
        int cinema =cinemaDeatils.getPrice();
        System.out.println(cinema);
    }
}
