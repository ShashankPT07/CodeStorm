package com.xworkz.Job.external;

import com.xworkz.Job.dto.Job;

public class JobRunner {
    public static void main(String[] args) {
        Job jobDetails = new Job();
        jobDetails.setDesignation("Software Engineer");
        String job = jobDetails.getDesignation();
        System.out.println("Job Designation: " + job);
    }
}