package com.school;

public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Course Code: " + code + ", Title: " + title);
    }
}
