package nl.streeksoft.novi;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public void prepareGame() {
        showIntroText();
        ArrayList<Gamer>  gamers = getSpelersNamen();
        printSpelersNamen(gamers);
    }


    public void showIntroText() {
        String spelIntro = "Welkom bij mijn spel! ";
        System.out.println(spelIntro);
    }

    public ArrayList<Gamer> getSpelersNamen() {
        String aantalSpelersText = "Geef het aantal spelers op";
        System.out.println(aantalSpelersText);

        Scanner input = new Scanner(System.in);

        int aantalSpelers = input.nextInt();

        System.out.println("Je wilt spelen met zoveel spelers: " + aantalSpelers);

        ArrayList<Gamer> gamers = new ArrayList<Gamer>();

        for(int i = 0; i < aantalSpelers; i++) {
            System.out.println("Geef gebruikersnaam op van speler " + (i+1));
            Gamer gamer = new Gamer("John","Doe",input.next());

            System.out.println("Geef de leeftijd op van speler " + (i+1));
            gamer.setGamerAge( input.nextInt() );

            System.out.println("Speler "+ (i+1) + " heet " + gamer.getGamerName() + " en is " + gamer.getGamerAge() + " jaar");
            gamer.firstName = "";

            gamers.add(gamer);
        }

        return gamers;
    }

    public void printSpelersNamen(ArrayList<Gamer> gamers) {

        System.out.println("Overzicht van spelers");
        for(int i = 0; i < gamers.size(); i++) {
            Gamer currentGamer = gamers.get(i);
            System.out.println("Speler " + (i + 1) + " heet: " + currentGamer.getGamerDetails() );
        }
    }

}
