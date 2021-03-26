package nl.streeksoft.novi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Frits","Bosschert",35);
        Person person2 = new Person("Piet","Biet",22);
        Person person3 = new Person("Klaas","Vaak", 100 );
        Person person4 = new Person("Jan","Janssen",22);

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        System.out.println("Volgorde VOOR de sortering");
        for(Person p : persons) {
            System.out.println("Persoon " + p.getFullName() + " - leeftijd: " + p.getAge() );
        }

        Collections.sort(persons);

        System.out.println("Volgorde NA de sortering");
        for(int i = 0; i < persons.size(); i++) {
            Person tmpPerson = persons.get(i);
            System.out.println("Persoon " + tmpPerson.getFullName() + " - leeftijd: " + tmpPerson.getAge() );
        }



        Election election2021 = new Election();
        election2021.prepareCandidates();
        election2021.prepareVoters();

    }
}
