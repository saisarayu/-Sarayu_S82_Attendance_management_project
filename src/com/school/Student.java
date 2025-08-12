public class Student {
    private static int nextStudentIdCounter = 1; 
    private int studentId;
    private String name;


    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name);
    }
}
