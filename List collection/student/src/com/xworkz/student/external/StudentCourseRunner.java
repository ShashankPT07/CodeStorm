package com.xworkz.student.external;

import com.xworkz.student.dto.StudentCourseDto;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseRunner {
    public static void main(String[] args) {
        List<StudentCourseDto> course=new ArrayList<>();
        StudentCourseDto studentCourseDto1  = new StudentCourseDto("Java", 3, 15000); course.add(studentCourseDto1);
        StudentCourseDto studentCourseDto2  = new StudentCourseDto("Python", 4, 14000); course.add(studentCourseDto2);
        StudentCourseDto studentCourseDto3  = new StudentCourseDto("C++", 2, 12000); course.add(studentCourseDto3);
        StudentCourseDto studentCourseDto4  = new StudentCourseDto("JavaScript", 3, 13000); course.add(studentCourseDto4);
        StudentCourseDto studentCourseDto5  = new StudentCourseDto("HTML/CSS", 1, 8000); course.add(studentCourseDto5);
        StudentCourseDto studentCourseDto6  = new StudentCourseDto("SQL", 2, 10000); course.add(studentCourseDto6);
        StudentCourseDto studentCourseDto7  = new StudentCourseDto("React", 3, 16000); course.add(studentCourseDto7);
        StudentCourseDto studentCourseDto8  = new StudentCourseDto("Angular", 3, 15500); course.add(studentCourseDto8);
        StudentCourseDto studentCourseDto9  = new StudentCourseDto("Node.js", 4, 17000); course.add(studentCourseDto9);
        StudentCourseDto studentCourseDto10 = new StudentCourseDto("Spring Boot", 3, 18000); course.add(studentCourseDto10);
        StudentCourseDto studentCourseDto11 = new StudentCourseDto("Django", 3, 15000); course.add(studentCourseDto11);
        StudentCourseDto studentCourseDto12 = new StudentCourseDto("Flutter", 4, 16500); course.add(studentCourseDto12);
        StudentCourseDto studentCourseDto13 = new StudentCourseDto("Kotlin", 3, 15500); course.add(studentCourseDto13);
        StudentCourseDto studentCourseDto14 = new StudentCourseDto("Swift", 3, 15000); course.add(studentCourseDto14);
        StudentCourseDto studentCourseDto15 = new StudentCourseDto("PHP", 3, 14000); course.add(studentCourseDto15);
        StudentCourseDto studentCourseDto16 = new StudentCourseDto("Laravel", 3, 16000); course.add(studentCourseDto16);
        StudentCourseDto studentCourseDto17 = new StudentCourseDto("Ruby", 3, 15500); course.add(studentCourseDto17);
        StudentCourseDto studentCourseDto18 = new StudentCourseDto("Go", 3, 15000); course.add(studentCourseDto18);
        StudentCourseDto studentCourseDto19 = new StudentCourseDto("C#", 3, 17000); course.add(studentCourseDto19);
        StudentCourseDto studentCourseDto20 = new StudentCourseDto("Data Science", 4, 20000); course.add(studentCourseDto20);
        StudentCourseDto studentCourseDto21 = new StudentCourseDto("Machine Learning", 4, 22000); course.add(studentCourseDto21);
        StudentCourseDto studentCourseDto22 = new StudentCourseDto("AI", 4, 23000); course.add(studentCourseDto22);
        StudentCourseDto studentCourseDto23 = new StudentCourseDto("Big Data", 3, 21000); course.add(studentCourseDto23);
        StudentCourseDto studentCourseDto24 = new StudentCourseDto("Cyber Security", 3, 18000); course.add(studentCourseDto24);
        StudentCourseDto studentCourseDto25 = new StudentCourseDto("Cloud Computing", 3, 20000); course.add(studentCourseDto25);
        StudentCourseDto studentCourseDto26 = new StudentCourseDto("DevOps", 3, 19000); course.add(studentCourseDto26);
        StudentCourseDto studentCourseDto27 = new StudentCourseDto("UI/UX Design", 2, 12000); course.add(studentCourseDto27);
        StudentCourseDto studentCourseDto28 = new StudentCourseDto("Android Development", 3, 16000); course.add(studentCourseDto28);
        StudentCourseDto studentCourseDto29 = new StudentCourseDto("iOS Development", 3, 15500); course.add(studentCourseDto29);
        StudentCourseDto studentCourseDto30 = new StudentCourseDto("Blockchain", 4, 25000); course.add(studentCourseDto30);


        course.forEach(n-> System.out.println(n.getCourseFee()+n.getDurationMonths()+n.getCourseName()));

    }
}
