package com.company;

public class Course {

    private String courseName;
    private String courseNumber;
    private String roomNumber;





    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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