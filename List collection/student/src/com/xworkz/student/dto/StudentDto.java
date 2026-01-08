package com.xworkz.student.dto;

import java.util.Objects;

public class StudentDto {
    private int id;
    private String name;
    private boolean isPassed;

    public StudentDto(int id, String name, boolean isPassed) {
        this.id = id;
        this.name = name;
        this.isPassed = isPassed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDto)) return false;
        StudentDto that = (StudentDto) o;
        return id == that.id && isPassed == that.isPassed && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isPassed);
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPassed=" + isPassed +
                '}';
    }
}
