package com.xworkz.student.external;

import com.xworkz.student.dto.StudentFeesDto;

import java.util.ArrayList;
import java.util.List;

public class StudentFeesRunner {
    public static void main(String[] args) {

        List<StudentFeesDto> fee=new ArrayList<>();
        StudentFeesDto studentFeesDto1  = new StudentFeesDto(52000, 25000); fee.add(studentFeesDto1);
        StudentFeesDto studentFeesDto2  = new StudentFeesDto(48000, 30000); fee.add(studentFeesDto2);
        StudentFeesDto studentFeesDto3  = new StudentFeesDto(60000, 45000); fee.add(studentFeesDto3);
        StudentFeesDto studentFeesDto4  = new StudentFeesDto(55000, 35000); fee.add(studentFeesDto4);
        StudentFeesDto studentFeesDto5  = new StudentFeesDto(50000, 20000); fee.add(studentFeesDto5);
        StudentFeesDto studentFeesDto6  = new StudentFeesDto(65000, 40000); fee.add(studentFeesDto6);
        StudentFeesDto studentFeesDto7  = new StudentFeesDto(70000, 50000); fee.add(studentFeesDto7);
        StudentFeesDto studentFeesDto8  = new StudentFeesDto(48000, 28000); fee.add(studentFeesDto8);
        StudentFeesDto studentFeesDto9  = new StudentFeesDto(53000, 30000); fee.add(studentFeesDto9);
        StudentFeesDto studentFeesDto10 = new StudentFeesDto(56000, 35000); fee.add(studentFeesDto10);
        StudentFeesDto studentFeesDto11 = new StudentFeesDto(49000, 25000); fee.add(studentFeesDto11);
        StudentFeesDto studentFeesDto12 = new StudentFeesDto(61000, 40000); fee.add(studentFeesDto12);
        StudentFeesDto studentFeesDto13 = new StudentFeesDto(57000, 30000); fee.add(studentFeesDto13);
        StudentFeesDto studentFeesDto14 = new StudentFeesDto(52000, 26000); fee.add(studentFeesDto14);
        StudentFeesDto studentFeesDto15 = new StudentFeesDto(50000, 20000); fee.add(studentFeesDto15);
        StudentFeesDto studentFeesDto16 = new StudentFeesDto(54000, 30000); fee.add(studentFeesDto16);
        StudentFeesDto studentFeesDto17 = new StudentFeesDto(60000, 40000); fee.add(studentFeesDto17);
        StudentFeesDto studentFeesDto18 = new StudentFeesDto(58000, 35000); fee.add(studentFeesDto18);
        StudentFeesDto studentFeesDto19 = new StudentFeesDto(62000, 45000); fee.add(studentFeesDto19);
        StudentFeesDto studentFeesDto20 = new StudentFeesDto(50000, 25000); fee.add(studentFeesDto20);
        StudentFeesDto studentFeesDto21 = new StudentFeesDto(55000, 30000); fee.add(studentFeesDto21);
        StudentFeesDto studentFeesDto22 = new StudentFeesDto(53000, 27000); fee.add(studentFeesDto22);
        StudentFeesDto studentFeesDto23 = new StudentFeesDto(59000, 35000); fee.add(studentFeesDto23);
        StudentFeesDto studentFeesDto24 = new StudentFeesDto(56000, 30000); fee.add(studentFeesDto24);
        StudentFeesDto studentFeesDto25 = new StudentFeesDto(52000, 25000); fee.add(studentFeesDto25);
        StudentFeesDto studentFeesDto26 = new StudentFeesDto(61000, 40000); fee.add(studentFeesDto26);
        StudentFeesDto studentFeesDto27 = new StudentFeesDto(57000, 35000); fee.add(studentFeesDto27);
        StudentFeesDto studentFeesDto28 = new StudentFeesDto(60000, 45000); fee.add(studentFeesDto28);
        StudentFeesDto studentFeesDto29 = new StudentFeesDto(55000, 30000); fee.add(studentFeesDto29);
        StudentFeesDto studentFeesDto30 = new StudentFeesDto(58000, 35000); fee.add(studentFeesDto30);

        fee.add(new StudentFeesDto(20000,15895));
        fee.forEach(n-> System.out.println(n.getPaidFees()+n.getRemainingFees()));

    }
}
