package nl.streeksoft.novi;

public class Voter extends Person  {
    private Candidate votesFor;

    public Voter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void vote(Candidate newCandidate) {
        this.votesFor = newCandidate;
        System.out.println("Stem uitgebracht door: " + lastName + " op " + this.votesFor.getFullName() );
    }
}
