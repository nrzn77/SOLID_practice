package management;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private String name;
    private final Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }


    public void printCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("\tTeacher: " + teacher.getFirstName() + " " + teacher.getLastName());
        System.out.println("\tStudents: ");

        for (Student student : students) {
            System.out.println("\t\t" + student.getFirstName() + " " + student.getLastName() + "-");
        }
    }

}
