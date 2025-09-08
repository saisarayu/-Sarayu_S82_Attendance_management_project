package com.school;

import com.school.storage.Storable;

public class Student extends Person implements Storable {
    private static int nextStudentIdCounter = 1;
    private String gradeLevel;

    // Constructor
    public Student(String name, int studentId, String gradeLevel) {
        super(name, studentId);  
        this.gradeLevel = gradeLevel;
    }

    // Auto-increment constructor (optional, if you want IDs to auto-generate)
    public Student(String name, String gradeLevel) {
        super(name, nextStudentIdCounter++);
        this.gradeLevel = gradeLevel;
    }

    // Getters
    public int getId() {
        return studentId; // comes from Person
    }

    public String getName() {
        return name; // comes from Person
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    // Setters
    public int setId(int id) {
        this.studentId = id;
        return id;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // Implement Storable method
    @Override
    public String toDataString() {
        return studentId + "," + name + "," + gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "', gradeLevel='" + gradeLevel + "'}";
    }
}
