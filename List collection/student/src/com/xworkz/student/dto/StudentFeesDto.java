package com.xworkz.student.dto;

import java.util.Objects;

public class StudentFeesDto {
    private double totalFees;
    private double paidFees;
    private double remainingFees;

    public StudentFeesDto(double totalFees, double paidFees) {
        this.totalFees = totalFees;
        this.paidFees = paidFees;
        this.remainingFees = totalFees - paidFees;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
        this.remainingFees = this.totalFees - this.paidFees;
    }

    public double getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(double paidFees) {
        this.paidFees = paidFees;
        this.remainingFees = this.totalFees - this.paidFees;
    }

    public double getRemainingFees() {
        return remainingFees;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof StudentFeesDto)) return false;
        StudentFeesDto that = (StudentFeesDto) o;
        return Double.compare(totalFees, that.totalFees) == 0 && Double.compare(paidFees, that.paidFees) == 0 && Double.compare(remainingFees, that.remainingFees) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalFees, paidFees, remainingFees);
    }

    @Override
    public String toString() {
        return "StudentFeesDto{" +
                "totalFees=" + totalFees +
                ", paidFees=" + paidFees +
                ", remainingFees=" + remainingFees +
                '}';
    }
}

