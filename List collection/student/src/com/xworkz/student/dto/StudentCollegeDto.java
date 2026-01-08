package com.xworkz.student.dto;

import java.util.Objects;

public class StudentCollegeDto {
    private String collegeName;
    private String location;
    private int establishedYear;

    public StudentCollegeDto(String collegeName, String location, int establishedYear) {
        this.collegeName = collegeName;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentCollegeDto)) return false;
        StudentCollegeDto that = (StudentCollegeDto) o;
        return establishedYear == that.establishedYear && Objects.equals(collegeName, that.collegeName) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collegeName, location, establishedYear);
    }

    @Override
    public String toString() {
        return "StudentCollegeDto{" +
                "collegeName='" + collegeName + '\'' +
                ", location='" + location + '\'' +
                ", establishedYear=" + establishedYear +
                '}';
    }
}

