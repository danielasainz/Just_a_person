package com.sainz.objectsandclasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Enter your first name");
        p.setFirstName(scan.nextLine());
        System.out.print("Enter your last name");
        p.setLastName(scan.nextLine());
        System.out.print("Enter your email address");
        p.setEmailAddress(scan.nextLine());
        System.out.print("Enter your phone number");
        p.setPhoneNumber(scan.nextLine());
        System.out.print(p.whatIsMyName());
    }
}



