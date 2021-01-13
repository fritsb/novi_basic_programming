package nl.streeksoft.novi;

public class Gamer extends Person {
    private String gamerName;
    private int gamerAge;

    public Gamer(String firstName, String lastName, String newName) {
        super("John", "Doe");
        this.gamerName = newName;
        this.firstName = "";
    }

    public void setGamerName(String newName) {
        this.gamerName = newName;
    }

    public String getGamerName() {
        return this.gamerName;
    }

    public void setGamerAge(int newAge) {
        this.gamerAge = newAge;
    }

    public int getGamerAge() {
        return this.gamerAge;
    }

    public String getGamerDetails() {
        return super.getFirstName() + " " + super.getLastName() + "( " + this.getGamerName() + ", " + this.getGamerAge() + " )";
    }

}
