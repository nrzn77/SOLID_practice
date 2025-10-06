package management;

public class Student extends Person {
    private String StudentID;
    private String Courses;

    public Student(String firstName, String lastName, String email, String age, String StudentID, String Courses ){
        super(firstName, lastName, email, age);
        this.StudentID = StudentID;
        this.Courses = Courses;
    }

    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getCourses() {
        return Courses;
    }
    public void setCourses(String Courses) {
        this.Courses = Courses;
    }

    @Override
    public void display() {
        System.out.println("Student ID: " + getStudentID()+"  Name: " + getFirstName()+" " + getLastName());
        System.out.println("Courses: " + getCourses());
    }


}
