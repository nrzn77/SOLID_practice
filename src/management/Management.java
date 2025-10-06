package management;
import java.util.ArrayList;
import java.util.List;

public class Management {
    private final List<Person> people;

    public Management() {
        people = new ArrayList<>();
    }
    public void addPerson(Person person) {
        people.add(person);
    }

    public void ShowAllPeople() {
        for (Person person : people) {
            person.display();
        }
    }
}
