package nl.streeksoft.novi;

public class Candidate extends Voter {
    private boolean isPartyLeader = false;
    private int position;
    private Party currentParty;

    public Candidate(String name) {
        super(name);
    }

    public Party getCurrentParty() {
        return currentParty;
    }

    public void setCurrentParty(Party currentParty) {
        this.currentParty = currentParty;
    }

    public boolean isPartyLeader() {
        if(position == 1) {
            isPartyLeader = true;
        }
        return isPartyLeader;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
