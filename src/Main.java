import management.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Managements managements = new Managements();
        Teacher T1 = new Teacher("A", "B","a@gmail.com","34","Math", 12900.34);
        Student S1 = new Student("C","D","c@gmail.com","19","213","math");
        Student S2 = new Student("N","M","n@gmail.com","21","230","math");


        managements.addPerson(S1);
        managements.addPerson(S2);
        managements.addPerson(T1);


        Courses C1= new Courses("Physics", T1);
        C1.addStudent(S1);
        C1.addStudent(S2);

        managements.ShowAllPeople();
        C1.Coursedetailsprint();
    }
}