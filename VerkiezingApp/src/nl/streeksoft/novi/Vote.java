package nl.streeksoft.novi;

public class Vote {
    private Voter voter;
    private Candidate candidate;
    private boolean correctVote = false;

    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }

    public Voter getVoter() {
        return voter;
    }

    public void setVoter(Voter voter) {
        this.voter = voter;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public boolean getCorrectVote() {
        if(voter != null && candidate != null) {
            this.correctVote = true;
        }
        else {
            this.correctVote = false;
        }
        return this.correctVote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "voter=" + voter.getName() +
                ", candidate=" + candidate.getName() +
                ", correctVote=" + this.getCorrectVote() +
                '}';
    }
}
