package nl.streeksoft.novi;


import nl.streeksoft.elections.*;

public class Election {
    private Candidate rutte;
    private Party vvd;
    private Party cda;


    public void prepareCandidates() {
        vvd = new Party();
        vvd.name = "VVD";
        cda = new Party();
        cda.name = "CDA";

        rutte = new Candidate(vvd, 1, "Mark", "Rutte", 54);
        rutte.talk();
        rutte.setCurrentParty(cda);
        System.out.println("Kandidaat toegevoegd: " + rutte.getFullName() );

    }

    public void prepareVoters() {


        Voter frits = new Voter("Frits","Bosschert",35);
        frits.setFirstName("F");
        frits.setLastName("Bosschert");
        frits.vote(rutte);

        System.out.println("Stemmer toegevoegd: " + frits.getFullName() );
    }

    public void prepareLocations() {
        ElectionLocation location = new ElectionLocation();
    }

}
