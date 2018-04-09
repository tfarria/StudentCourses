package com.company;

public class Student {
    private String firstName;
    private String lastName;

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
}
//    Create an application to accept the name of ONE institution.
//
//        Extend the application to accept user input as follows:
//        Course Name
//        Course Number
//        Room Number
//        for as many courses as a user wants to enter.
//        The user should be asked after entering these details if he/she wants to enter more courses.
//        When the user says no, display the name of the institution, as well as the list of courses that are available to that institution.