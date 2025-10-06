package management;

import utilities.EmailVerifier;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String age;

    public Person(String firstName, String lastName, String email, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(email);
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(EmailVerifier.verifyEmail(email)){
            this.email = email;
        }
        else {
            this.email = null;
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public abstract void display();
}
