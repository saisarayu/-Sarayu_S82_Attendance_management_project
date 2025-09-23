import java.util.*;

public class Main {

    // Display directory using polymorphism
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails(); // Runtime polymorphism in action
        }
    }

    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student(1, "Alice", "CS");
        Student s2 = new Student(2, "Bob", "IT");

        // Create Teachers
        Teacher t1 = new Teacher(101, "Dr. Smith", "Computer Science");
        Teacher t2 = new Teacher(102, "Prof. Johnson", "Information Technology");

        // Create Staff
        Staff staff1 = new Staff(201, "Mr. Brown", "Administration");

        // Store in polymorphic list
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(staff1);

        // Polymorphic display
        displaySchoolDirectory(schoolPeople);

        // Create Courses
        Course c1 = new Course(501, "Data Structures");
        Course c2 = new Course(502, "Database Systems");

        // Attendance Records
        AttendanceRecord r1 = new AttendanceRecord(s1, c1, "Present");
        AttendanceRecord r2 = new AttendanceRecord(s2, c2, "Absent");

        System.out.println("\n--- Attendance Log ---");
        r1.displayRecord();
        r2.displayRecord();

        // Save only Students to file
        List<Student> studentsOnly = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentsOnly.add((Student) p);
            }
        }

        FileStorageService.saveData(studentsOnly, "students.txt");
    }
}
