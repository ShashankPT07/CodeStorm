package com.xworkz.student.external;

import com.xworkz.student.dto.StudentResultDto;

import java.util.ArrayList;
import java.util.List;

public class StudentResultRunner {
    public static void main(String[] args) {

        List<StudentResultDto> result =new ArrayList<>();
        StudentResultDto studentResultDto1  = new StudentResultDto(1,"Ravi", 75.5f,"A"); result.add(studentResultDto1);
        StudentResultDto studentResultDto2  = new StudentResultDto(2,"Sanjay", 55.2f,"B"); result.add(studentResultDto2);
        StudentResultDto studentResultDto3  = new StudentResultDto(3,"Manu", 65.3f,"B"); result.add(studentResultDto3);
        StudentResultDto studentResultDto4  = new StudentResultDto(4,"Arun", 45.5f,"C"); result.add(studentResultDto4);
        StudentResultDto studentResultDto5  = new StudentResultDto(5,"Kiran", 80.0f,"A"); result.add(studentResultDto5);
        StudentResultDto studentResultDto6  = new StudentResultDto(6,"Ramesh", 58.4f,"B"); result.add(studentResultDto6);
        StudentResultDto studentResultDto7  = new StudentResultDto(7,"Mahesh", 72.3f,"A"); result.add(studentResultDto7);
        StudentResultDto studentResultDto8  = new StudentResultDto(8,"Darshan", 49.5f,"C"); result.add(studentResultDto8);
        StudentResultDto studentResultDto9  = new StudentResultDto(9,"Varun", 66.0f,"B"); result.add(studentResultDto9);
        StudentResultDto studentResultDto10 = new StudentResultDto(10,"Naveen", 77.2f,"A"); result.add(studentResultDto10);
        StudentResultDto studentResultDto11 = new StudentResultDto(11,"Sudeep", 54.5f,"B"); result.add(studentResultDto11);
        StudentResultDto studentResultDto12 = new StudentResultDto(12,"Uday", 62.3f,"B"); result.add(studentResultDto12);
        StudentResultDto studentResultDto13 = new StudentResultDto(13,"Rithik", 70.0f,"A"); result.add(studentResultDto13);
        StudentResultDto studentResultDto14 = new StudentResultDto(14,"Lokesh", 48.5f,"C"); result.add(studentResultDto14);
        StudentResultDto studentResultDto15 = new StudentResultDto(15,"Praveen", 55.0f,"B"); result.add(studentResultDto15);
        StudentResultDto studentResultDto16 = new StudentResultDto(16,"Akash", 68.3f,"B"); result.add(studentResultDto16);
        StudentResultDto studentResultDto17 = new StudentResultDto(17,"Yogesh", 73.5f,"A"); result.add(studentResultDto17);
        StudentResultDto studentResultDto18 = new StudentResultDto(18,"Dheeraj", 59.2f,"B"); result.add(studentResultDto18);
        StudentResultDto studentResultDto19 = new StudentResultDto(19,"Manoj", 45.0f,"C"); result.add(studentResultDto19);
        StudentResultDto studentResultDto20 = new StudentResultDto(20,"Prajwal", 67.5f,"B"); result.add(studentResultDto20);
        StudentResultDto studentResultDto21 = new StudentResultDto(21,"Arvind", 76.0f,"A"); result.add(studentResultDto21);
        StudentResultDto studentResultDto22 = new StudentResultDto(22,"Shyam", 51.5f,"B"); result.add(studentResultDto22);
        StudentResultDto studentResultDto23 = new StudentResultDto(23,"Ravi", 64.2f,"B"); result.add(studentResultDto23);
        StudentResultDto studentResultDto24 = new StudentResultDto(24,"John", 58.0f,"B"); result.add(studentResultDto24);
        StudentResultDto studentResultDto25 = new StudentResultDto(25,"Ganesh", 72.5f,"A"); result.add(studentResultDto25);
        StudentResultDto studentResultDto26 = new StudentResultDto(26,"Pavan", 49.5f,"C"); result.add(studentResultDto26);
        StudentResultDto studentResultDto27 = new StudentResultDto(27,"Rithvik", 66.2f,"B"); result.add(studentResultDto27);
        StudentResultDto studentResultDto28 = new StudentResultDto(28,"Akash", 71.0f,"A"); result.add(studentResultDto28);
        StudentResultDto studentResultDto29 = new StudentResultDto(29,"Manu", 53.5f,"B"); result.add(studentResultDto29);
        StudentResultDto studentResultDto30 = new StudentResultDto(30,"Sanjay", 60.0f,"B"); result.add(studentResultDto30);

        result.add(new StudentResultDto(1,"theja",22.35f,"A"));
        result.forEach(n-> System.out.println(n.getStudentId()+n.getPercentage()+n.getStudentName()+n.getGrade()));
    }
}
