package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Student> info = new ArrayList<>();
        ArrayList<Course> myCourses = new ArrayList<>();
        Course school;
        Institution institution = new Institution();







        Student person = new Student();
        System.out.println("Enter your First Name : ");
        person.setFirstName(keyboard.nextLine());

        System.out.println("Enter your Last Name : ");
        person.setLastName(keyboard.nextLine());
        info.add(person);

        System.out.println("Institution Name : " );
        institution.setInstitutionName(keyboard.nextLine());



        do {
             school = new Course();
            System.out.println("Enter your Course Name : ");
            school.setCourseName(keyboard.nextLine());

            System.out.println("Enter your Course Number : ");
            school.setCourseNumber(keyboard.nextLine());

            System.out.println("Enter your Room Number: ");
            school.setRoomNumber(keyboard.nextLine());
            myCourses.add(school);




            System.out.println("Would you like to enter another Course");
            String answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("No")  || answer.equalsIgnoreCase("N"))
                stop=true;


        }while (!stop);


        for (Student eachStudent : info){
            System.out.println("Institution Name : " +" "+ institution.getInstitutionName());
            System.out.println("                 ");
            System.out.println("Student Name :");
            System.out.println("                       ");
            System.out.println(person.getFirstName()+" "+ person.getLastName());
            System.out.println("               ");
        }


        for (Course eachCourse : myCourses){

            System.out.println("             ");
            System.out.println("Course  Name : ");
            System.out.println("                             ");
            System.out.println(eachCourse.getCourseName());
            System.out.println("                    ");
            System.out.println("Course Number : ");
            System.out.println("                    ");
            System.out.println(eachCourse.getCourseNumber());
            System.out.println("Room Number : ");
            System.out.println("                   ");
            System.out.println(eachCourse.getRoomNumber());


        }


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