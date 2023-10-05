package org.example;

public class Student {
    private String name;
    private int rollNumber;
    private static String universityName = "Harvard";

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void changeUniversity(String newUniversity) {

        universityName = newUniversity;
    }
    public void displayStudentInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("University name: " + universityName);
    }
}
