package Repositories;

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

public class StudentCourseListRepository {
    private final List<Pair<String, String>> studentCourseList;

    public StudentCourseListRepository() {
        studentCourseList = new ArrayList<>();
    }

    public void enrollStudentToCourse(String studentId, String courseId) {
        studentCourseList.add(
                new Pair<String, String>(courseId, studentId)
        );
    }
    public void unenrollStudentToCourse(String studentId, String courseId) {
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
