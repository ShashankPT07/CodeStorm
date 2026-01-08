package com.xworkz.student.dto;

import java.util.Objects;

public class StudentMarksDto {
    private int kannada;
    private int english;
    private int maths;

    public StudentMarksDto(int kannada, int english, int maths) {
        this.kannada = kannada;
        this.english = english;
        this.maths = maths;
    }

    public int getKannada() {
        return kannada;
    }

    public void setKannada(int kannada) {
        this.kannada = kannada;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMarksDto)) return false;
        StudentMarksDto that = (StudentMarksDto) o;
        return kannada == that.kannada && english == that.english && maths == that.maths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kannada, english, maths);
    }

    @Override
    public String toString() {
        return "StudentMarksDto{" +
                "kannada=" + kannada +
                ", english=" + english +
                ", maths=" + maths +
                '}';
    }
}

