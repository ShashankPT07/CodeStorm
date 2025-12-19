package com.xworkz.Flight.external;

import com.xworkz.Flight.dto.Flight;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flightDetails = new Flight();
        flightDetails.setFlightNumber(607);
        int flight = flightDetails.getFlightNumber();
        System.out.println("Flight Number: " + flight);
    }
}