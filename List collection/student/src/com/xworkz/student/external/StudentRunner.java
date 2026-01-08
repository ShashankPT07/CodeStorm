package com.xworkz.student.external;

import com.xworkz.student.dto.StudentDto;
import sun.awt.image.ImageWatched;
import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {



        List<StudentDto> dto=new ArrayList<>();
        StudentDto studentDto1=new StudentDto(1,"abc",true);
        dto.add(studentDto1);
        StudentDto studentDto2=new StudentDto(2,"ms",true);
        dto.add(studentDto2);
        StudentDto studentDto3=new StudentDto(3,"ram",false);
        dto.add(studentDto3);
        StudentDto studentDto4=new StudentDto(4,"sam",true);
        dto.add(studentDto4);
        StudentDto studentDto5=new StudentDto(5,"kiran",false);
        dto.add(studentDto5);
        StudentDto studentDto6=new StudentDto(6,"manu",true);
        dto.add(studentDto6);
        StudentDto studentDto7=new StudentDto(7,"ravi",false);
        dto.add(studentDto7);
        StudentDto studentDto8=new StudentDto(8,"shyam",true);
        dto.add(studentDto8);
        StudentDto studentDto9=new StudentDto(9,"arun",false);
        dto.add(studentDto9);
        StudentDto studentDto10=new StudentDto(10,"john",true);
        dto.add(studentDto10);
        StudentDto studentDto11=new StudentDto(11,"prajwal",true);
        dto.add(studentDto11);
        StudentDto studentDto12=new StudentDto(12,"varun",false);
        dto.add(studentDto12);
        StudentDto studentDto13=new StudentDto(13,"darshan",true);
        dto.add(studentDto13);
        StudentDto studentDto14=new StudentDto(14,"ganesh",false);
        dto.add(studentDto14);
        StudentDto studentDto15=new StudentDto(15,"naveen",true);
        dto.add(studentDto15);
        StudentDto studentDto16=new StudentDto(16,"arvind",false);dto.add(studentDto16);
        StudentDto studentDto17=new StudentDto(17,"akash",true);dto.add(studentDto17);
        StudentDto studentDto18=new StudentDto(18,"uday",false);dto.add(studentDto18);
        StudentDto studentDto19=new StudentDto(19,"manoj",true);dto.add(studentDto19);
        StudentDto studentDto20=new StudentDto(20,"yogesh",false);dto.add(studentDto20);
        StudentDto studentDto21=new StudentDto(21,"sudeep",true);dto.add(studentDto21);
        StudentDto studentDto22=new StudentDto(22,"akash",false);dto.add(studentDto22);
        StudentDto studentDto23=new StudentDto(23,"pavan",true);dto.add(studentDto23);
        StudentDto studentDto24=new StudentDto(24,"ramesh",false);dto.add(studentDto24);
        StudentDto studentDto25=new StudentDto(25,"mahesh",true);dto.add(studentDto25);
        StudentDto studentDto26=new StudentDto(26,"rithik",false);dto.add(studentDto26);
        StudentDto studentDto27=new StudentDto(27,"lokesh",true);dto.add(studentDto27);
        StudentDto studentDto28=new StudentDto(28,"dheeraj",false);dto.add(studentDto28);
        StudentDto studentDto29=new StudentDto(29,"praveen",true);dto.add(studentDto29);
        StudentDto studentDto30=new StudentDto(30,"karthik",false);dto.add(studentDto30);


        dto.add(new StudentDto(1,"name",false));
        dto.forEach(n-> System.out.println(n.getId()+" "+n.getName()+" "+n.isPassed()));



    }
}
