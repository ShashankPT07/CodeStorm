package com.xworkz.house.external;

import com.xworkz.house.dto.House;

public class HouseRunner {
    public static void main(String[] args) {
        House houseDetails = new House();
        houseDetails.setNumberOfRooms(4);
        int house = houseDetails.getNumberOfRooms();
        System.out.println("House Rooms: " + house);
    }
}