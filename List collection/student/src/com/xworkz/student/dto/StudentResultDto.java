package com.xworkz.student.dto;

import java.util.Objects;

public class StudentResultDto {
    private int studentId;
    private String studentName;
    private float percentage;
    private String grade;

    public StudentResultDto(int studentId, String studentName, float percentage, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.percentage = percentage;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentResultDto)) return false;
        StudentResultDto that = (StudentResultDto) o;
        return studentId == that.studentId && Float.compare(percentage, that.percentage) == 0 && Objects.equals(studentName, that.studentName) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, percentage, grade);
    }

    @Override
    public String toString() {
        return "StudentResultDto{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", percentage=" + percentage +
                ", grade='" + grade + '\'' +
                '}';
    }
}

