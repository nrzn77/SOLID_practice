import Controllers.CourseController;
import Controllers.StudentCourseController;
import Repositories.CourseListRepository;
import Repositories.StudentCourseListRepository;
import management.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.sql.SQLOutput;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Jon", "Doe","a@gmail.com","34", 12900.34);
        Student S1 = new Student("Jon","Snow","c@gmail.com","19");
        Student S2 = new Student("Jon","Moe","n@gmail.com","21");

        StudentCourseController studentCourseController = new StudentCourseController();
        CourseController courseController = new CourseController();

        courseController.saveCourse(new Course("phy-001", "Physics"));
        courseController.saveCourse(new Course("chem-001", "Chemistry"));
        courseController.saveCourse(new LabCourse("oop-001", "Java","L-102"));
        System.out.println(courseController.getAllCourses());

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(T1);

        System.out.println(courseController.getCourseById("phy-001"));

        studentCourseController.enrollStudentToCourse(S1.getStudentID(), "phy-001");
        studentCourseController.enrollStudentToCourse(S1.getStudentID(), "chem-001");
        studentCourseController.enrollStudentToCourse(S1.getStudentID(), "oop-001");
        studentCourseController.enrollStudentToCourse(S1.getStudentID(), "oop-002");
        studentCourseController.unenrollStudentFromCourse(S1.getStudentID(), "phy-001");

        System.out.println(studentCourseController.getCoursesForStudent(S1.getStudentID()));

        System.out.println(courseController.getCourseByName("Java"));

    }
}