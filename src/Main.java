import management.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Jon", "Doe","a@gmail.com","34", 12900.34);
        Student S1 = new Student("Jon","Snow","c@gmail.com","19");
        Student S2 = new Student("Jon","Moe","n@gmail.com","21");

        Course Physics = new Course("Physics","phy-001");
        Course Chemistry = new Course("Chemistry","chem-001");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(T1);

    }
}