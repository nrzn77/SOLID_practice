package Controllers;

import Repositories.StudentCourseListRepository;
import Repositories.StudentCourseRepository;

import java.util.List;

public class StudentCourseController {
    private final StudentCourseRepository studentCourseRepository = new StudentCourseListRepository();

    public void enrollStudentToCourse(String studentId, String courseId){
        studentCourseRepository.enrollStudentToCourse(studentId, courseId);
    }
    public void unenrollStudentFromCourse(String studentId, String courseId){
        studentCourseRepository.unenrollStudentFromCourse(studentId, courseId);
    }
    public List<String> getCoursesForStudent(String studentId){
        return studentCourseRepository.getCoursesForStudent(studentId);
    }
}
