package nl.streeksoft.novi;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SwingExample {
    private String input;
    private String fileInfo;

    public void showInputDialog() {
        input = JOptionPane.showInputDialog("Geef een bestandsnaam op: ");

        System.out.println("Bestandsnaam is: " + input);


    }

    public void showFileContent() {

        try {
            FileInputStream in = new FileInputStream(input);
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Bestand niet gevonden: " + fnfe.getMessage() + " -- "  );
            //fnfe.printStackTrace();
            showMessageDialog("Error!!");
        }
        catch(IOException ioe) {
            System.out.println("Input Output Exception: " + ioe.getMessage());
        }
        catch(Exception e) {
            System.out.println("Exception opgetreden: " + e.getMessage());
        }
        finally {
            System.out.println("Deze code wordt altijd uitgevoerd, zowel bij wel als geen exception.");
        }


    }

    public void showFileInfo() {
        try {
            File file1 = new File(input);
            System.out.println("Bestandsgrootte: " + file1.length());

            if(file1.exists()) {
                //fileInfo = file1.length();
                System.out.println("Bestandsgrootte: " + file1.length());
            }
        }
        catch(Exception e) {
            System.out.println("Exception opgetreden: " + e.getMessage());
        }
    }


    public void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);

    }
}
