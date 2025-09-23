public class AttendanceRecord {
    private Student student;
    private Course course;
    private String status; // e.g., "Present", "Absent"

    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

   public void displayRecord() {
    System.out.println("Student ID: " + student.getID() +
                       " | Course ID: " + course.getCourseID() +
                       " | Status: " + status);
}


    // For saving to file
    public String toDataString() {
        return student.getId() + "," + course.getCourseId() + "," + status;
    }
}
