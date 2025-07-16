package com.school;

public class Main {
    public static void main(String[] args) {
        // Create array of Students
        Student[] students = {
            new Student("1", "Sarayu S"),
            new Student("2", "Mithra")
        };

        Course[] courses = {
            new Course("CS101", "Data Structures"),
            new Course("CS102", "OOP in Java")
        };

        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayInfo();
        }

        System.out.println("\nCourse Details:");
        for (Course course : courses) {
            course.displayInfo();
        }
    }
}
