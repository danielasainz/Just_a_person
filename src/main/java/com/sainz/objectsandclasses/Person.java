package com.sainz.objectsandclasses;


public class Person {
    public static void main(String[] args) {

    }

    //It's great to meet you (first name + last name)! Can I call you (firstname)?
    //Your phone number is (phone number), and your e-mail address is (e-mail address).

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public String whatIsMyName()

    {
        return "It's great to meet you " + getFirstName() + " " + getLastName()
        + "! Can I call you " +getFirstName() + "?\n" + "Your phone number is " + getPhoneNumber() + ",\n" +
                "and your email address is " + getEmailAddress() + ".\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
