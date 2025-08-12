import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student students[] = new Student[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            students[i] = new Student(sc.nextLine());
        }

        Course courses[] = new Course[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name for course " + (i + 1) + ": ");
            courses[i] = new Course(sc.nextLine());
        }

        System.out.println("\n=== Student Details ===");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("\n=== Course Details ===");
        for (Course c : courses) {
            c.displayDetails();
        }

        sc.close();
    }
}
