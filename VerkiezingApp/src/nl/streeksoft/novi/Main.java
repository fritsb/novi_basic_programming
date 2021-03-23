package nl.streeksoft.novi;

public class Main {

    public static void main(String[] args) {
        ElectionController ec = new ElectionController();
        ec.prepareElection();
        ec.generateCandidates();
        ec.generateVoters();
        ec.doVoting();
        ec.printVotes();


    }
}
