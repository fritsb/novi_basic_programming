package nl.streeksoft.novi;

public class Coach extends Person {
    public int age;

    public Coach(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " heeft de leeftijd " + age;
        /*
        return "Coach{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';*/
    }
}
