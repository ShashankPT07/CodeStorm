package com.xworkz.student.dto;

import java.util.Objects;

public class StudentAddressDto {
    private String city;
    private String state;
    private int pincode;

    public StudentAddressDto(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentAddressDto)) return false;
        StudentAddressDto that = (StudentAddressDto) o;
        return pincode == that.pincode && Objects.equals(city, that.city) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, pincode);
    }

    @Override
    public String toString() {
        return "StudentAddressDto{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
