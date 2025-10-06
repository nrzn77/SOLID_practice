package Repositories;

import Controllers.CourseController;

import java.util.ArrayList;
import java.util.List;

record Pair<L, R>(L left, R right) {
    Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}

public class StudentCourseListRepository implements StudentCourseRepository {
    private static final List<Pair<String, String>> studentCourseList = new ArrayList<>();
    private final CourseController courseController = new CourseController();


    public void enrollStudentToCourse(String studentId, String courseId) {

        if(!courseController.courseExists(courseId)){
            System.out.println("Course does not exist");
            return;
        }
        studentCourseList.add(
                new Pair<String, String>(courseId, studentId)
        );
    }
    public void unenrollStudentFromCourse(String studentId, String courseId) {
        studentCourseList.remove(
                new Pair<String, String>(courseId, studentId)
        );
    }

    public List<String> getCoursesForStudent(String studentId) {
        List<String> courses = new ArrayList<>();
        studentCourseList.forEach(element -> {
            if (element.right().equals(studentId)) {
                courses.add(element.left());
            }
        });
        return courses;
    }
}
