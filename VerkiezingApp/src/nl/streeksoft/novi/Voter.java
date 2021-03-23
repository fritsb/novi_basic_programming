package nl.streeksoft.novi;

public class Voter {
    private String name;
    private boolean hasVoted;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public Voter(String name) {
        this.name = name;
    }
}
