package nl.streeksoft.novi;

import java.util.*;

public class ElectionController {
    private ArrayList<Candidate> candidates;
    private ArrayList<Voter> voters;
    private ArrayList<Vote> votes = new ArrayList<Vote>();
    private Election2021 currentElection;

    public void prepareElection() {
        this.currentElection = new Election2021("Tweede Kamer Verkiezingen", 2021);
    }

    public void generateCandidates() {
        // Meerdere objecten van type Candidate aanmaken, daarna stop ik ze in de ArrayList

        Party vvd = new Party("VVD");
        Party d66 = new Party("D66");
        Party pvv = new Party("PVV");
        Party cda = new Party("CDA");

        Candidate rutte = new Candidate("Rutte");
        rutte.setPosition(1);
        rutte.setCurrentParty(vvd);

        Candidate kaag = new Candidate("Kaag");
        kaag.setPosition(1);
        kaag.setCurrentParty(d66);

        Candidate wilders = new Candidate("Wilders");
        wilders.setPosition(1);
        wilders.setCurrentParty(pvv);

        Candidate hoekstra = new Candidate("Hoekstra");
        hoekstra.setPosition(1);
        hoekstra.setCurrentParty(cda);

        candidates = new ArrayList<Candidate>();
        candidates.add(rutte);
        candidates.add(kaag);
        candidates.add(wilders);
        candidates.add(hoekstra);
    }

    public void generateVoters() {
        // Meerdere objecten van type Voter aanmaken, daarna stop ik ze in de ArrayList

        Voter frits = new Voter("frits");
        Voter klaas = new Voter("klaas");
        Voter piet = new Voter("piet");

        voters = new ArrayList<Voter>();
        voters.add(frits);
        voters.add(klaas);
        voters.add(piet);
    }

    public void doVoting() {

        // Loop door de lijst van voters
        for(int i = 0; i < this.voters.size(); i++) {
            System.out.println("Overzicht van kandidaten:");
            printCandidates();

            Voter tmpVoter = voters.get(i);
            System.out.println("Welkom " + tmpVoter.getName());

            Scanner scan = new Scanner(System.in);
            boolean incorrect = true;
            int candidate = 0;

            while(incorrect) {
                System.out.println("Geef aan op welke kandidaat u stemt: ");
                candidate = scan.nextInt();

                if (candidate > this.candidates.size() || candidate < 1) {
                    System.out.println("Ongeldige invoer! Probeer opnieuw!");
                }
                else {
                    incorrect = false;
                }
            }

            System.out.println("Kandidaat met nummer " + candidate + " geselecteerd");
            Candidate tmpCandidate = getCandidate(candidate-1);

            Vote currentVote = new Vote(tmpVoter, tmpCandidate);
            votes.add(currentVote);

        }
    }

    public Candidate getCandidate(int position) {
        return this.candidates.get(position);
    }

    public void printCandidates() {
        for(int i = 0; i < this.candidates.size(); i++) {
            Candidate currentCandidate = this.candidates.get(i);
            System.out.println("Kandidaat " + (i+1) + ": " + currentCandidate.getName() );
        }

    }

    public void printVotes() {
        for(int i = 0; i < this.votes.size(); i++ ) {
            System.out.println(this.votes.get(i));
        }
    }


}
