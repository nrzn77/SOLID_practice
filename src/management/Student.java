package management;

public class Student extends Person {
    private String studentID;
    private String courses;

    public Student(String firstName, String lastName, String email, String age, String studentID, String courses) {
        super(firstName, lastName, email, age);
        this.studentID = studentID;
        this.courses = courses;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String StudentID) {
        this.studentID = StudentID;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String Courses) {
        this.courses = Courses;
    }

    @Override
    public void display() {
        System.out.println("Student ID: " + getStudentID() + "  Name: " + getFirstName() + " " + getLastName());
        System.out.println("Courses: " + getCourses());
    }


}
