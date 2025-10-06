package management;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private String courseID;
    private String name;

    public Course(String courseID, String name) {
        this.courseID = courseID;
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return getName() + ": " + getCourseID();
    }

}
