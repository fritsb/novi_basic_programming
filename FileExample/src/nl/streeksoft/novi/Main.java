package nl.streeksoft.novi;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    FileHandler fh = new FileHandler("data.txt", true);
	    String[] answers = {"Edwin","30","HBO"};

	    for(int i = 0; i < answers.length; i++) {
            fh.writeData(answers[i]);
        }
	    fh.readData();

	    FileHandler fh2 = new FileHandler("data1.txt", true);
	    String[] answers2 = {"Arie","25","WO"};

	    for(int i = 0; i < answers2.length; i++) {
            fh2.writeData(answers2[i]);
        }
	    fh2.readData();


    }
}
