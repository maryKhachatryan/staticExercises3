package org.example;

public class MainApp {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Max", 2);

        System.out.println("Initial student information: ");
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        Student.changeUniversity("ANAU");

        System.out.println("Updated student information");
        student1.displayStudentInfo();
        student2.displayStudentInfo();

    }
}


