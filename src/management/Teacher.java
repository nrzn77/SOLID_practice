package management;

public class Teacher extends Person {
    private double Salary;

    public Teacher(String firstName, String lastName, String email, String age, Double Salary) {
        super(firstName, lastName, email, age);
        this.Salary = Salary;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary " + getSalary();
    }
}
