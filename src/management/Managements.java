package management;
import java.util.ArrayList;
import java.util.List;

public class Managements {
    private List<Person> People;

    public Managements() {
        People = new ArrayList<>();
    }
    public void addPerson(Person person) {
        People.add(person);
    }

    public void ShowAllPeople() {
        for (Person person : People) {
            person.display();
        }
    }
}
