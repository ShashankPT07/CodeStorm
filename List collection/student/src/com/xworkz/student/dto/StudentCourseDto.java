package com.xworkz.student.dto;

import java.util.Objects;

public class StudentCourseDto {
    private String courseName;
    private int durationMonths;
    private double courseFee;

    public StudentCourseDto(String courseName, int durationMonths, double courseFee) {
        this.courseName = courseName;
        this.durationMonths = durationMonths;
        this.courseFee = courseFee;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentCourseDto)) return false;
        StudentCourseDto that = (StudentCourseDto) o;
        return durationMonths == that.durationMonths && Double.compare(courseFee, that.courseFee) == 0 && Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, durationMonths, courseFee);
    }

    @Override
    public String toString() {
        return "StudentCourseDto{" +
                "courseName='" + courseName + '\'' +
                ", durationMonths=" + durationMonths +
                ", courseFee=" + courseFee +
                '}';
    }
}

