package com.xworkz.student.external;

import com.xworkz.student.dto.StudentDetails;

import java.util.ArrayList;
import java.util.List;

public class StudentDetailsRunner {
    public static void main(String[] args) {

        List<StudentDetails> details=new ArrayList<>();
        StudentDetails studentDetails1 = new StudentDetails(21, 586498568L, "Bengaluru");
        details.add(studentDetails1);
        StudentDetails studentDetails2 = new StudentDetails(22, 986532145L, "Mysuru");
        details.add(studentDetails2);
        StudentDetails studentDetails3 = new StudentDetails(23, 785412369L, "Mangaluru");
        details.add(studentDetails3);
        StudentDetails studentDetails4 = new StudentDetails(24, 998877665L, "Hubballi");
        details.add(studentDetails4);
        StudentDetails studentDetails5 = new StudentDetails(25, 889900112L, "Belagavi");
        details.add(studentDetails5);
        StudentDetails studentDetails6 = new StudentDetails(26, 778899665L, "Shivamogga");
        details.add(studentDetails6);
        StudentDetails studentDetails7 = new StudentDetails(27, 998844221L, "Tumakuru");
        details.add(studentDetails7);
        StudentDetails studentDetails8 = new StudentDetails(28, 887766554L, "Hassan");
        details.add(studentDetails8);
        StudentDetails studentDetails9 = new StudentDetails(29, 775544332L, "Davanagere");
        details.add(studentDetails9);
        StudentDetails studentDetails10 = new StudentDetails(30, 889977441L, "Udupi");
        details.add(studentDetails10);
        StudentDetails studentDetails11 = new StudentDetails(31, 778866553L, "Mandya");
        details.add(studentDetails11);
        StudentDetails studentDetails12 = new StudentDetails(32, 665544332L, "Kodagu");
        details.add(studentDetails12);
        StudentDetails studentDetails13 = new StudentDetails(33, 998822113L, "Chikkamagaluru");
        details.add(studentDetails13);
        StudentDetails studentDetails14 = new StudentDetails(34, 886644221L, "Vijayapura");
        details.add(studentDetails14);
        StudentDetails studentDetails15 = new StudentDetails(35, 778855441L, "Bagalkot");
        details.add(studentDetails15);
        StudentDetails studentDetails16 = new StudentDetails(36, 664433221L, "Kalaburagi");
        details.add(studentDetails16);
        StudentDetails studentDetails17 = new StudentDetails(37, 903344221L, "Raichur");
        details.add(studentDetails17);
        StudentDetails studentDetails18 = new StudentDetails(38, 987654321L, "Bidar");
        details.add(studentDetails18);
        StudentDetails studentDetails19 = new StudentDetails(39, 778899221L, "Chitradurga");
        details.add(studentDetails19);
        StudentDetails studentDetails20 = new StudentDetails(40, 889900221L, "Ballari");
        details.add(studentDetails20);
        StudentDetails studentDetails21 = new StudentDetails(41, 776655443L, "Ramanagara");
        details.add(studentDetails21);
        StudentDetails studentDetails22 = new StudentDetails(42, 998811223L, "Karwar");
        details.add(studentDetails22);
        StudentDetails studentDetails23 = new StudentDetails(43, 887755331L, "Sirsi");
        details.add(studentDetails23);
        StudentDetails studentDetails24 = new StudentDetails(44, 778899665L, "Kolar");
        details.add(studentDetails24);
        StudentDetails studentDetails25 = new StudentDetails(45, 667788991L, "Chikkaballapur");
        details.add(studentDetails25);
        StudentDetails studentDetails26 = new StudentDetails(46, 903322119L, "Hospet");
        details.add(studentDetails26);
        StudentDetails studentDetails27 = new StudentDetails(47, 889966441L, "Yadgir");
        details.add(studentDetails27);
        StudentDetails studentDetails28 = new StudentDetails(48, 776699521L, "Haveri");
        details.add(studentDetails28);
        StudentDetails studentDetails29 = new StudentDetails(49, 998833112L, "Gadag");
        details.add(studentDetails29);
        StudentDetails studentDetails30 = new StudentDetails(50, 887722331L, "Chamrajnagar");
        details.add(studentDetails30);

        details.add(new StudentDetails(20,5858555,"mysuru"));
        details.forEach(n-> System.out.println(n.getAge()+" "+n.getPhNumber()+" "+n.getHometown()));
    }
}
