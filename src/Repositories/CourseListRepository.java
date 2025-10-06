package Repositories;

import management.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseListRepository implements CourseRepository {
    private static final List<Course> courses = new ArrayList<>();

    public Course getCourseById(String courseId){
        for (Course course : courses) {
            if(course.getCourseID().equals(courseId)){
                return course;
            }

        }
        return null;
    }

    public Course getCourseByName(String courseName){
        for (Course course : courses) {
            if(course.getName().equals(courseName)){
                return course;
            }
        }
        return null;

    }

    public List<Course> getAllCourses(){
        return courses;
    }

    public void saveCourse(Course course){
        courses.add(course);
        System.out.println("Course added successfully");
    }

    public void deleteCourse(Course course){
        courses.remove(course);
    }
    public boolean courseExists(String courseId){
        for (Course course : courses) {
            if(course.getCourseID().equals(courseId)){
                return true;
            }
        }
        return false;
    }

}
