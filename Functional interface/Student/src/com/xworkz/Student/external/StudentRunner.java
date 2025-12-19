package com.xworkz.Student.external;


import com.xworkz.Student.bridge.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = (first, last) -> first + " " + last;
        String name = student.fullName("Ravi", "Kumar");
        System.out.println("Student Name: " + name);
    }
}
