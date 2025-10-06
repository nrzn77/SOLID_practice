package Repositories;

import java.util.List;

public interface StudentCourseRepository {
    public void enrollStudentToCourse(String studentId, String courseId);
    public void unenrollStudentFromCourse(String studentId, String courseId);
    public List<String> getCoursesForStudent(String studentId);
}
