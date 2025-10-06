package Controllers;

import Repositories.CourseListRepository;
import Repositories.CourseRepository;
import management.Course;

import java.util.List;

public class CourseController {
    private final CourseRepository courseRepository = new CourseListRepository();

    public Course getCourseById(String courseId) {
        return courseRepository.getCourseById(courseId);
    }

    public Course getCourseByName(String courseName) {
        return courseRepository.getCourseByName(courseName);
    }

    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    public void saveCourse(Course course) {
        courseRepository.saveCourse(course);
    }

    public void deleteCourse(Course course) {
        courseRepository.deleteCourse(course);
    }

    public boolean courseExists(String courseId) {
        return courseRepository.courseExists(courseId);
    }

}