package com.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor to get first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    //Ask for department
    private String setDepartment() {
        System.out.println("Enter the department:\n" +
                "(1) For Sales\n" +
                "(2) For Development\n" +
                "(3) For Accounting\n" +
                "(0) For None");
        Scanner input = new Scanner(System.in);
        int deptChoice = input.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567890!@#$%^&*";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            
        }
    }
    //Set mailbox capacity

    //Set the alternate email

    //Change the password
}
