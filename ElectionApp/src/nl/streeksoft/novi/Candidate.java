package nl.streeksoft.novi;

public class Candidate extends Person {
    private Party currentParty;
    private boolean isPartyLeader = false;
    private int position = -1;

    public Candidate(Party currentParty, int position, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.currentParty = currentParty;
        this.position = position;
    }

    public void talk() {
        System.out.println("Kandidaat "+super.lastName+"  van de partij " + currentParty.name + " praat veel");
    }

    public boolean isPartyLeader() {
        if(position != -1 && position == 1) {
            isPartyLeader = true;
        }
        else {
            isPartyLeader = false;
        }

        return isPartyLeader;
    }

    public void setCurrentParty(Party newParty) {
        this.currentParty = newParty;
    }

    public Party getCurrentParty() {
        return this.currentParty;
    }

    public void setPosition(int newPosition) {
        position = newPosition;
    }

    public int getPosition() {
        return this.position;
    }

}
