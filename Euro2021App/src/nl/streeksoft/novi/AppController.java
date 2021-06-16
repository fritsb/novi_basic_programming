package nl.streeksoft.novi;

import java.util.ArrayList;

public class AppController {
    Player depay;
    Player stekelenburg;
    Coach fdeBoer;
    ArrayList<Person> hollandTeam;

    public AppController() {
        setupPlayers();
        setupCoach();

        printTeams();

    }

    public void setupPlayers() {
        hollandTeam = new ArrayList<>();

         depay = new Player("Memphis","Depay",9);
         stekelenburg = new Player("Maarten","Stekelenburg", 1);
         Player frenkie = new Player("Frenkie","de Jong",10);

        hollandTeam.add(depay);
        hollandTeam.add(stekelenburg);
        hollandTeam.add(frenkie);

    }

    public void printTeams() {
        for (int i = 0; i < hollandTeam.size(); i++) {
            System.out.println(hollandTeam.get(i));
        }

    }

    public void setupCoach() {
        fdeBoer = new Coach("Frank","de Boer", 50);

        hollandTeam.add(fdeBoer);

        //System.out.println(fdeBoer);
        //System.out.println(depay);
    }
}
