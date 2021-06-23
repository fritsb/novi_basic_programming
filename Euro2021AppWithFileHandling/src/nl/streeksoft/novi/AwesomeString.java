package nl.streeksoft.novi;

import java.util.ArrayList;

public class AwesomeString {
    private String myString;
    private ArrayList<Character> myChars;


    public AwesomeString(String myString) {
        this.myString = myString;
    }

    public AwesomeString(char[] myString) {
        myChars = new ArrayList();
        int arrayLength = myString.length;
        for (int i = 0; i < arrayLength; i++) {
            myChars.add(myString[i]);
        }
    }

    public int length() {
        return myString.length();
    }

    public String getMyString() {
        return myString;


    }
    public ArrayList<Character> getMyChars() {
        return this.myChars;
    }






}
