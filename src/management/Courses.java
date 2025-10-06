package management;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class Courses {
    private String Name;
    private final Teacher Teacher;
    private List<Student> Students;

    public Courses(String Name, Teacher Teacher) {
        this.Name = Name;
        this.Teacher = Teacher;
        this.Students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        Students.add(s);
    }


    public void Coursedetailsprint(){
        System.out.println("Teacher: " + Teacher.getFirstName()+" "+Teacher.getLastName());
        System.out.println("Students: " );

        for (Student student : Students) {
            System.out.println(student.getFirstName()+" "+student.getLastName()+"-");
        }
    }

}
