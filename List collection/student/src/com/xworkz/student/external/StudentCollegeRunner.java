package com.xworkz.student.external;

import com.xworkz.student.dto.StudentCollegeDto;

import java.util.ArrayList;
import java.util.List;

public class StudentCollegeRunner {
    public static void main(String[] args) {

        List<StudentCollegeDto> student=new ArrayList<>();
        StudentCollegeDto studentCollegeDto1  = new StudentCollegeDto("Shreedevi", "Mangaluru", 2000); student.add(studentCollegeDto1);
        StudentCollegeDto studentCollegeDto2  = new StudentCollegeDto("St. Aloysius", "Mangaluru", 1958); student.add(studentCollegeDto2);
        StudentCollegeDto studentCollegeDto3  = new StudentCollegeDto("NMAM Institute", "Nitte", 1986); student.add(studentCollegeDto3);
        StudentCollegeDto studentCollegeDto4  = new StudentCollegeDto("Canara College", "Mangaluru", 1970); student.add(studentCollegeDto4);
        StudentCollegeDto studentCollegeDto5  = new StudentCollegeDto("Srinivas College", "Mangaluru", 1988); student.add(studentCollegeDto5);
        StudentCollegeDto studentCollegeDto6  = new StudentCollegeDto("Alva's College", "Moodbidri", 1979); student.add(studentCollegeDto6);
        StudentCollegeDto studentCollegeDto7  = new StudentCollegeDto("PES College", "Mangaluru", 1983); student.add(studentCollegeDto7);
        StudentCollegeDto studentCollegeDto8  = new StudentCollegeDto("SVS College", "Mangaluru", 2001); student.add(studentCollegeDto8);
        StudentCollegeDto studentCollegeDto9  = new StudentCollegeDto("Shivaji College", "Mangaluru", 1965); student.add(studentCollegeDto9);
        StudentCollegeDto studentCollegeDto10 = new StudentCollegeDto("St. Agnes College", "Mangaluru", 1921); student.add(studentCollegeDto10);
        StudentCollegeDto studentCollegeDto11 = new StudentCollegeDto("KMC College", "Mangaluru", 1999); student.add(studentCollegeDto11);
        StudentCollegeDto studentCollegeDto12 = new StudentCollegeDto("St. Joseph College", "Mangaluru", 1975); student.add(studentCollegeDto12);
        StudentCollegeDto studentCollegeDto13 = new StudentCollegeDto("Govt College", "Mangaluru", 1960); student.add(studentCollegeDto13);
        StudentCollegeDto studentCollegeDto14 = new StudentCollegeDto("Mangala College", "Mangaluru", 1992); student.add(studentCollegeDto14);
        StudentCollegeDto studentCollegeDto15 = new StudentCollegeDto("St. Mary College", "Mangaluru", 1980); student.add(studentCollegeDto15);
        StudentCollegeDto studentCollegeDto16 = new StudentCollegeDto("Shanti College", "Mangaluru", 2005); student.add(studentCollegeDto16);
        StudentCollegeDto studentCollegeDto17 = new StudentCollegeDto("St. Ann College", "Mangaluru", 1978); student.add(studentCollegeDto17);
        StudentCollegeDto studentCollegeDto18 = new StudentCollegeDto("Rama College", "Mangaluru", 1984); student.add(studentCollegeDto18);
        StudentCollegeDto studentCollegeDto19 = new StudentCollegeDto("St. Thomas College", "Mangaluru", 1962); student.add(studentCollegeDto19);
        StudentCollegeDto studentCollegeDto20 = new StudentCollegeDto("St. Peter College", "Mangaluru", 1972); student.add(studentCollegeDto20);
        StudentCollegeDto studentCollegeDto21 = new StudentCollegeDto("St. Paul College", "Mangaluru", 1989); student.add(studentCollegeDto21);
        StudentCollegeDto studentCollegeDto22 = new StudentCollegeDto("Karnataka College", "Mangaluru", 1968); student.add(studentCollegeDto22);
        StudentCollegeDto studentCollegeDto23 = new StudentCollegeDto("St. Xavier College", "Mangaluru", 1955); student.add(studentCollegeDto23);
        StudentCollegeDto studentCollegeDto24 = new StudentCollegeDto("Shree College", "Mangaluru", 2003); student.add(studentCollegeDto24);
        StudentCollegeDto studentCollegeDto25 = new StudentCollegeDto("St. Josephs", "Mangaluru", 1971); student.add(studentCollegeDto25);
        StudentCollegeDto studentCollegeDto26 = new StudentCollegeDto("Govt First Grade", "Mangaluru", 1981); student.add(studentCollegeDto26);
        StudentCollegeDto studentCollegeDto27 = new StudentCollegeDto("Shivaji Arts College", "Mangaluru", 1967); student.add(studentCollegeDto27);
        StudentCollegeDto studentCollegeDto28 = new StudentCollegeDto("Sahyadri College", "Mangaluru", 1995); student.add(studentCollegeDto28);
        StudentCollegeDto studentCollegeDto29 = new StudentCollegeDto("St. Theresa College", "Mangaluru", 1987); student.add(studentCollegeDto29);
        StudentCollegeDto studentCollegeDto30 = new StudentCollegeDto("Shree Devi College", "Mangaluru", 2000); student.add(studentCollegeDto30);

        student.add(new StudentCollegeDto("rmsa","koppal",1990));

        student.forEach(n-> System.out.println(n.getCollegeName()+n.getLocation()+n.getEstablishedYear()));
    }
}
