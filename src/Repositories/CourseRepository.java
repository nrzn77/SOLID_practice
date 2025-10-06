package Repositories;

import management.Course;

import java.lang.classfile.Interfaces;
import java.util.List;

public interface CourseRepository {
    public Course getCourseById(String courseId);
    public Course getCourseByName(String courseName);
    public List<Course> getAllCourses();

    public void saveCourse(Course course);
    public void deleteCourse(Course course);
    public boolean courseExists(String courseId);
}
