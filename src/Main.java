import Repositories.StudentCourseListRepository;
import management.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Jon", "Doe","a@gmail.com","34", 12900.34);
        Student S1 = new Student("Jon","Snow","c@gmail.com","19");
        Student S2 = new Student("Jon","Moe","n@gmail.com","21");

        Course Physics = new Course("phy-001", "Physics");
        Course Chemistry = new Course("chem-001", "Chemistry");
        LabCourse Java = new LabCourse("OOP-002", "Java","L-102");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(T1);

        System.out.println(Physics);

        StudentCourseListRepository studentCourseListRepository = new StudentCourseListRepository();
        studentCourseListRepository.enrollStudentToCourse(S1.getStudentID(), Physics.getCourseID());
        studentCourseListRepository.enrollStudentToCourse(S1.getStudentID(), Chemistry.getCourseID());
        studentCourseListRepository.enrollStudentToCourse(S1.getStudentID(), Java.getCourseID());
        studentCourseListRepository.unenrollStudentToCourse(S1.getStudentID(), Chemistry.getCourseID());

        System.out.println(studentCourseListRepository.getCoursesForStudent(S1.getStudentID()));

    }
}