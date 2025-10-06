package management;

import utilities.IDGenerator;

public class Student extends Person {
    private final String studentID;
    private static int studentNumber = 0;

    public Student(String firstName, String lastName, String email, String age) {
        super(firstName, lastName, email, age);
        this.studentID = IDGenerator.generateID(++studentNumber);
    }

    public String getStudentID() {
        return studentID;
    }


    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + getStudentID();
    }


}
