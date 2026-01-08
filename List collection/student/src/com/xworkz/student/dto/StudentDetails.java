package com.xworkz.student.dto;

import java.util.Objects;

public class StudentDetails {
    private int age;
    private long phNumber;
    private String hometown;

    public StudentDetails(int age, long phNumber, String hometown) {
        this.age = age;
        this.phNumber = phNumber;
        this.hometown = hometown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "age=" + age +
                ", phNumber=" + phNumber +
                ", hometown='" + hometown + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDetails)) return false;
        StudentDetails that = (StudentDetails) o;
        return age == that.age && phNumber == that.phNumber && Objects.equals(hometown, that.hometown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, phNumber, hometown);
    }
}
