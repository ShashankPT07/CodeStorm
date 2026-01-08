package com.xworkz.student.external;

import com.xworkz.student.dto.StudentAddressDto;
import com.xworkz.student.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentAddressRunner {
    public static void main(String[] args) {

        StudentAddressDto studentAddressDto1  = new StudentAddressDto("Bengaluru", "Karnataka", 58945);
        StudentAddressDto studentAddressDto2  = new StudentAddressDto("Mysuru", "Karnataka", 570001);
        StudentAddressDto studentAddressDto3  = new StudentAddressDto("Mangaluru", "Karnataka", 575001);
        StudentAddressDto studentAddressDto4  = new StudentAddressDto("Hubballi", "Karnataka", 580020);
        StudentAddressDto studentAddressDto5  = new StudentAddressDto("Belagavi", "Karnataka", 590001);
        StudentAddressDto studentAddressDto6  = new StudentAddressDto("Shivamogga", "Karnataka", 577201);
        StudentAddressDto studentAddressDto7  = new StudentAddressDto("Ballari", "Karnataka", 583101);
        StudentAddressDto studentAddressDto8  = new StudentAddressDto("Davanagere", "Karnataka", 577002);
        StudentAddressDto studentAddressDto9  = new StudentAddressDto("Tumakuru", "Karnataka", 572101);
        StudentAddressDto studentAddressDto10 = new StudentAddressDto("Hassan", "Karnataka", 573201);
        StudentAddressDto studentAddressDto11 = new StudentAddressDto("Mandya", "Karnataka", 571401);
        StudentAddressDto studentAddressDto12 = new StudentAddressDto("Chikkamagaluru", "Karnataka", 577101);
        StudentAddressDto studentAddressDto13 = new StudentAddressDto("Udupi", "Karnataka", 576101);
        StudentAddressDto studentAddressDto14 = new StudentAddressDto("Kodagu", "Karnataka", 571201);
        StudentAddressDto studentAddressDto15 = new StudentAddressDto("Kolar", "Karnataka", 563101);
        StudentAddressDto studentAddressDto16 = new StudentAddressDto("Raichur", "Karnataka", 584101);
        StudentAddressDto studentAddressDto17 = new StudentAddressDto("Kalaburagi", "Karnataka", 585101);
        StudentAddressDto studentAddressDto18 = new StudentAddressDto("Bidar", "Karnataka", 585401);
        StudentAddressDto studentAddressDto19 = new StudentAddressDto("Bagalkot", "Karnataka", 587101);
        StudentAddressDto studentAddressDto20 = new StudentAddressDto("Vijayapura", "Karnataka", 586101);
        StudentAddressDto studentAddressDto21 = new StudentAddressDto("Ramanagara", "Karnataka", 562159);
        StudentAddressDto studentAddressDto22 = new StudentAddressDto("Chitradurga", "Karnataka", 577501);
        StudentAddressDto studentAddressDto23 = new StudentAddressDto("Gadag", "Karnataka", 582101);
        StudentAddressDto studentAddressDto24 = new StudentAddressDto("Haveri", "Karnataka", 581110);
        StudentAddressDto studentAddressDto25 = new StudentAddressDto("Chikkaballapur", "Karnataka", 562101);
        StudentAddressDto studentAddressDto26 = new StudentAddressDto("Yadgir", "Karnataka", 585202);
        StudentAddressDto studentAddressDto27 = new StudentAddressDto("Karwar", "Karnataka", 581301);
        StudentAddressDto studentAddressDto28 = new StudentAddressDto("Sirsi", "Karnataka", 581401);
        StudentAddressDto studentAddressDto29 = new StudentAddressDto("Hospet", "Karnataka", 583201);
        StudentAddressDto studentAddressDto30 = new StudentAddressDto("Chamrajnagar", "Karnataka", 571313);

        List<StudentAddressDto> studentDto = new ArrayList<>();
        studentDto.add(studentAddressDto1);
        studentDto.add(studentAddressDto2);
        studentDto.add(studentAddressDto3);
        studentDto.add(studentAddressDto4);
        studentDto.add(studentAddressDto5);
        studentDto.add(studentAddressDto6);
        studentDto.add(studentAddressDto7);
        studentDto.add(studentAddressDto8);
        studentDto.add(studentAddressDto9);
        studentDto.add(studentAddressDto10);
        studentDto.add(studentAddressDto11);
        studentDto.add(studentAddressDto12);
        studentDto.add(studentAddressDto13);
        studentDto.add(studentAddressDto14);
        studentDto.add(studentAddressDto15);
        studentDto.add(studentAddressDto16);
        studentDto.add(studentAddressDto17);
        studentDto.add(studentAddressDto18);
        studentDto.add(studentAddressDto19);
        studentDto.add(studentAddressDto20);
        studentDto.add(studentAddressDto21);
        studentDto.add(studentAddressDto22);
        studentDto.add(studentAddressDto23);
        studentDto.add(studentAddressDto24);
        studentDto.add(studentAddressDto25);
        studentDto.add(studentAddressDto26);
        studentDto.add(studentAddressDto27);
        studentDto.add(studentAddressDto28);
        studentDto.add(studentAddressDto29);
        studentDto.add(studentAddressDto30);

        studentDto.add(new StudentAddressDto("koppal","karnnataka",583277));
        studentDto.forEach(n-> System.out.println(n.getCity()+" "+n.getState()+" "+n.getPincode()));

    }
}
