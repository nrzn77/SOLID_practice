package management;

public class Teacher extends Person {
    private String Subject;
    private double Salary;

    public Teacher(String firstName, String lastName, String email, String age, String Subject, Double Salary) {
        super(firstName, lastName, email, age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getFirstName() + ", " + getLastName() + ",subject: " + getSubject() + ", salary " + getSalary());
    }
}
