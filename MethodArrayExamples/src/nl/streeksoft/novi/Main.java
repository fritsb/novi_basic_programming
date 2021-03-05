package nl.streeksoft.novi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jan","Jansen", 6);
        Student student2 = new Student("Piet","Bietjes",6);
        Student student3 = new Student("Karel","Kareltjes",8);

        Teacher teacher1 = new Teacher(2001, 102,"Frits", "Bosschert");
        Teacher teacher2 = new Teacher(2002, 102, "Peter","Anema");

        System.out.println( teacher1.getAllDetails() );
        System.out.println( teacher2.getAllDetails() );


        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students);

        for(int i = 0; i < students.size(); i++) {
            Student tmpStudent = students.get(i);
            System.out.println("Student op plek "+i+" is: " + tmpStudent.getFullName()  );
        }

        /*
        ArrayList<String> bakkerStraat = new ArrayList<String>();
        bakkerStraat.add("Familie Pakker");
        bakkerStraat.add(1, "Familie Zansen");
        bakkerStraat.add("Familie Bietjes");

        for(int i = 0; i < bakkerStraat.size(); i++) {
            System.out.println("Bakkerstraat " + i + ": " + bakkerStraat.get(i));
        }

        bakkerStraat.add(1, "Familie Kareltjes");

        //Collections.sort(bakkerStraat, Collections.reverseOrder());
        Collections.sort(bakkerStraat);
        Collections.reverse(bakkerStraat);

        for(int i = 0; i < bakkerStraat.size(); i++) {
            System.out.println("Bakkerstraat " + i + ": " + bakkerStraat.get(i));
        }


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        for(Integer num : numbers) {
            System.out.println("Nummer: " + num);
        }

        numbers.remove(2);

        int count = 0;

        while(numbers.size() > count) {
            System.out.println("Nummer: " + numbers.get(count));
            count++;
        }



        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(numbers);

        Iterator iter = numbers2.iterator();
        while(iter.hasNext()) {
            System.out.println("Nummer: " + iter.next());
        }
*/
/*
        boolean[] lessonActive = {false, false, true};

        // Bovenstaande verzameling op meerdere regels
        boolean[] lesson2 = new boolean[3];
        lesson2[0] = false;
        lesson2[1] = false;
        lesson2[2] = true;

        String[] lessonNames = new String[3];
        lessonNames[0] = "Introductie";
        lessonNames[1] = "Variabelen";
        lessonNames[2] = "Verzamelingen & Methoden";

        // Bovenstaande verzameling op 1 regel:
        String[] lessonNames2 = {"Introductie",  "Variabelen", "Verzamelingen & Methoden"};

        System.out.println("De lengte van de verzameling is: " + lessonActive.length);
        for(int i = 0; i < lessonActive.length; i++ ) {
            if(lessonActive[i] != false) {
                printMsg( helloMsg(i, lessonNames[i]) );
            }
        }



*/
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static String helloMsg(int number, String lessonName) {
        return "Welkom bij de "+(number+1)+"e les: "+lessonName;
    }


}
