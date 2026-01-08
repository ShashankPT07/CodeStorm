package com.xworkz.student.external;

import com.xworkz.student.dto.Attendance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AttendanceRunner {
    public static void main(String[] args) {


        List<Attendance> attendanceList=new ArrayList<>();
        Attendance attendance1  = new Attendance(55.2f, "jd", 50);   attendanceList.add(attendance1);
        Attendance attendance2  = new Attendance(60.5f, "sam", 48);  attendanceList.add(attendance2);
        Attendance attendance3  = new Attendance(72.8f, "ram", 49);  attendanceList.add(attendance3);
        Attendance attendance4  = new Attendance(45.1f, "kiran", 47); attendanceList.add(attendance4);
        Attendance attendance5  = new Attendance(68.3f, "arun", 46);  attendanceList.add(attendance5);
        Attendance attendance6  = new Attendance(80.0f, "sita", 50);  attendanceList.add(attendance6);
        Attendance attendance7  = new Attendance(52.4f, "geetha", 49);attendanceList.add(attendance7);
        Attendance attendance8  = new Attendance(77.7f, "vinay", 50); attendanceList.add(attendance8);
        Attendance attendance9  = new Attendance(69.9f, "kumar", 48); attendanceList.add(attendance9);
        Attendance attendance10 = new Attendance(59.0f, "priya", 47); attendanceList.add(attendance10);

        Attendance attendance11 = new Attendance(73.3f, "raj", 50);   attendanceList.add(attendance11);
        Attendance attendance12 = new Attendance(81.6f, "mahesh", 49);attendanceList.add(attendance12);
        Attendance attendance13 = new Attendance(66.2f, "tejas", 48); attendanceList.add(attendance13);
        Attendance attendance14 = new Attendance(44.8f, "manu", 47);  attendanceList.add(attendance14);
        Attendance attendance15 = new Attendance(90.5f, "divya", 50); attendanceList.add(attendance15);
        Attendance attendance16 = new Attendance(85.1f, "shashi", 49);attendanceList.add(attendance16);
        Attendance attendance17 = new Attendance(71.0f, "megha", 48); attendanceList.add(attendance17);
        Attendance attendance18 = new Attendance(63.4f, "varun", 47); attendanceList.add(attendance18);
        Attendance attendance19 = new Attendance(79.2f, "pooja", 50); attendanceList.add(attendance19);
        Attendance attendance20 = new Attendance(54.6f, "yash", 48);  attendanceList.add(attendance20);

        Attendance attendance21 = new Attendance(88.0f, "neha", 49);  attendanceList.add(attendance21);
        Attendance attendance22 = new Attendance(67.7f, "akash", 48); attendanceList.add(attendance22);
        Attendance attendance23 = new Attendance(74.9f, "rekha", 50); attendanceList.add(attendance23);
        Attendance attendance24 = new Attendance(58.3f, "suresh", 47);attendanceList.add(attendance24);
        Attendance attendance25 = new Attendance(82.4f, "madhu", 49); attendanceList.add(attendance25);
        Attendance attendance26 = new Attendance(47.5f, "ankit", 48); attendanceList.add(attendance26);
        Attendance attendance27 = new Attendance(93.1f, "shruti", 50);attendanceList.add(attendance27);
        Attendance attendance28 = new Attendance(69.0f, "darshan", 49);attendanceList.add(attendance28);
        Attendance attendance29 = new Attendance(76.6f, "anusha", 48); attendanceList.add(attendance29);
        Attendance attendance30 = new Attendance(64.2f, "chethan", 47);attendanceList.add(attendance30);

        attendanceList.add(new Attendance(2.2f,"jk",45));
        attendanceList.forEach(n-> System.out.println(n.getPercentage()+" "+n.getStudentName()+" "+n.getTotalClassAttended()  ));
    }
}
