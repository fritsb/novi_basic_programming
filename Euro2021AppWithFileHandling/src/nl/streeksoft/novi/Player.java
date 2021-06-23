package nl.streeksoft.novi;

public class Player extends Person {
    public int number;

    public Player(String newFirstName, String newLastName, int newNumber) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " heeft rugnummer " + number;

        /*return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                '}';
 */   }
}
