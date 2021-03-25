package nl.streeksoft.novi;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Klaas", 55);
        Student student2 = new Student("Jan", 55);
        Student s3 = new Student("Piet", 33);
        Student s4 = new Student("Galid", 44);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student2);
        students.add(student1);
        students.add(s3);
        students.add(s4);

        for(int i = 0; i < students.size(); i++) {
            System.out.println("Student: "+ students.get(i));
        }

        Collections.sort(students);

        for(int i = 0; i < students.size(); i++) {
            System.out.println("Student: "+ students.get(i));
        }

        Collections.reverse(students);
        for(int i = 0; i < students.size(); i++) {
            System.out.println("Student: "+ students.get(i));
        }

    }
}
