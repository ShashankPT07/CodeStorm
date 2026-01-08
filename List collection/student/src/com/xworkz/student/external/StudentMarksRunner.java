package com.xworkz.student.external;

import com.xworkz.student.dto.StudentMarksDto;

import java.util.ArrayList;
import java.util.List;

public class StudentMarksRunner {
    public static void main(String[] args) {

        List<StudentMarksDto> marks=new ArrayList<>();
        StudentMarksDto studentMarksDto1  = new StudentMarksDto(20, 30, 40); marks.add(studentMarksDto1);
        StudentMarksDto studentMarksDto2  = new StudentMarksDto(25, 35, 45); marks.add(studentMarksDto2);
        StudentMarksDto studentMarksDto3  = new StudentMarksDto(30, 40, 50); marks.add(studentMarksDto3);
        StudentMarksDto studentMarksDto4  = new StudentMarksDto(28, 38, 48); marks.add(studentMarksDto4);
        StudentMarksDto studentMarksDto5  = new StudentMarksDto(22, 32, 42); marks.add(studentMarksDto5);
        StudentMarksDto studentMarksDto6  = new StudentMarksDto(26, 36, 46); marks.add(studentMarksDto6);
        StudentMarksDto studentMarksDto7  = new StudentMarksDto(24, 34, 44); marks.add(studentMarksDto7);
        StudentMarksDto studentMarksDto8  = new StudentMarksDto(29, 39, 49); marks.add(studentMarksDto8);
        StudentMarksDto studentMarksDto9  = new StudentMarksDto(31, 41, 51); marks.add(studentMarksDto9);
        StudentMarksDto studentMarksDto10 = new StudentMarksDto(23, 33, 43); marks.add(studentMarksDto10);
        StudentMarksDto studentMarksDto11 = new StudentMarksDto(27, 37, 47); marks.add(studentMarksDto11);
        StudentMarksDto studentMarksDto12 = new StudentMarksDto(21, 31, 41); marks.add(studentMarksDto12);
        StudentMarksDto studentMarksDto13 = new StudentMarksDto(25, 35, 45); marks.add(studentMarksDto13);
        StudentMarksDto studentMarksDto14 = new StudentMarksDto(28, 38, 48); marks.add(studentMarksDto14);
        StudentMarksDto studentMarksDto15 = new StudentMarksDto(30, 40, 50); marks.add(studentMarksDto15);
        StudentMarksDto studentMarksDto16 = new StudentMarksDto(22, 32, 42); marks.add(studentMarksDto16);
        StudentMarksDto studentMarksDto17 = new StudentMarksDto(24, 34, 44); marks.add(studentMarksDto17);
        StudentMarksDto studentMarksDto18 = new StudentMarksDto(26, 36, 46); marks.add(studentMarksDto18);
        StudentMarksDto studentMarksDto19 = new StudentMarksDto(29, 39, 49); marks.add(studentMarksDto19);
        StudentMarksDto studentMarksDto20 = new StudentMarksDto(31, 41, 51); marks.add(studentMarksDto20);
        StudentMarksDto studentMarksDto21 = new StudentMarksDto(20, 30, 40); marks.add(studentMarksDto21);
        StudentMarksDto studentMarksDto22 = new StudentMarksDto(25, 35, 45); marks.add(studentMarksDto22);
        StudentMarksDto studentMarksDto23 = new StudentMarksDto(28, 38, 48); marks.add(studentMarksDto23);
        StudentMarksDto studentMarksDto24 = new StudentMarksDto(22, 32, 42); marks.add(studentMarksDto24);
        StudentMarksDto studentMarksDto25 = new StudentMarksDto(26, 36, 46); marks.add(studentMarksDto25);
        StudentMarksDto studentMarksDto26 = new StudentMarksDto(24, 34, 44); marks.add(studentMarksDto26);
        StudentMarksDto studentMarksDto27 = new StudentMarksDto(29, 39, 49); marks.add(studentMarksDto27);
        StudentMarksDto studentMarksDto28 = new StudentMarksDto(31, 41, 51); marks.add(studentMarksDto28);
        StudentMarksDto studentMarksDto29 = new StudentMarksDto(23, 33, 43); marks.add(studentMarksDto29);
        StudentMarksDto studentMarksDto30 = new StudentMarksDto(27, 37, 47); marks.add(studentMarksDto30);

        marks.add(new StudentMarksDto(1,20,58));
        marks.forEach(n-> System.out.println(n.getEnglish()+n.getKannada()+n.getMaths()));
    }
}
