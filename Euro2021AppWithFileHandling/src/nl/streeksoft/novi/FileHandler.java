package nl.streeksoft.novi;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private String fileName;
    private File myFile;

    public FileHandler(String fileName) {
        this.fileName = fileName;
        myFile = new File(this.fileName);

    }

    public void saveData(ArrayList<Person> persons) {
        try {
            FileWriter fw = new FileWriter(myFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Person person: persons) {
                bw.write(person.toString());
                bw.newLine();
            }
            bw.close();
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Bestand niet gevonden: " + fnfe.getMessage());
        }
        catch(Exception ex) {
            System.out.println("Fout bij opslaan van data" + ex.getMessage());
        }
    }

    public String readData() {
        String tmpString = "";
        String tmpLine;
        try {
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);


            while((tmpLine = br.readLine()) != null) {
                tmpString += tmpLine + "\n\r";
            }
        }
        catch(Exception ex) {

        }

        return tmpString;
    }

}
