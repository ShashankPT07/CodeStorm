package com.xworkz.student.dto;

import java.util.Objects;

public class Attendance {
    private float percentage;
    private String studentName;
    private int totalClassAttended;

    public Attendance(float percentage, String studentName, int totalClassAttended) {
        this.percentage = percentage;
        this.studentName = studentName;
        this.totalClassAttended = totalClassAttended;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTotalClassAttended() {
        return totalClassAttended;
    }

    public void setTotalClassAttended(int totalClassAttended) {
        this.totalClassAttended = totalClassAttended;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "percentage=" + percentage +
                ", studentName='" + studentName + '\'' +
                ", totalClassAttended=" + totalClassAttended +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attendance)) return false;
        Attendance that = (Attendance) o;
        return Float.compare(percentage, that.percentage) == 0 && totalClassAttended == that.totalClassAttended && Objects.equals(studentName, that.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentage, studentName, totalClassAttended);
    }
}
