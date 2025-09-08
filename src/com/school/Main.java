package com.school;

import com.school.storage.FileStorageService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 1, "Grade 10");
        Student s2 = new Student("Bob", 2, "Grade 11");

        // Create Courses
        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Science");

        // Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getId(), c2.getCourseId(), "Late"));

        // Display records on console
        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // Save data to files
        FileStorageService storage = new FileStorageService();

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);

        storage.saveToFile("students.txt", students);
        storage.saveToFile("courses.txt", courses);
        storage.saveToFile("Attendance_log.txt", attendanceLog);

        System.out.println("\nData saved to files ✅");
    }
}
