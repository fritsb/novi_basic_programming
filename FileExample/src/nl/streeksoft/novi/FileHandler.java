package nl.streeksoft.novi;

import java.io.*;

public class FileHandler {
    private String fileName;
    private boolean append;

    public FileHandler(String fileName, boolean append) {
        this.fileName = fileName;
        this.append = append;

    }

    public static void writeStaticData(String data) {
        try {
            File dataFile = new File("default.txt");
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
            bw.close();

        }
        catch(Exception e) {
            System.out.println("Exception at static write data method" + e.getMessage());

        }

    }


    public void writeData(String data)  {

        try {
            File dataFile = new File(fileName);
            if(dataFile.exists()) {
                System.out.println("Bestand met naam " + fileName + " bestaat" );
            }
            if(dataFile.isFile()) {
                System.out.println("Bestand met naam " + fileName + " is een bestand" );
            }
            if(dataFile.isDirectory()) {
                System.out.println("Bestand met naam " + fileName + " is een directory");
            }
            if(dataFile.length() == 0) {
                System.out.println("Bestand met naam " + fileName + "  is leeg");
            }
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(data);
            bw.newLine();
            bw.close();

        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Bestand is niet toegangelijk. ");
            System.out.println(fnfe.getMessage());
        }
        catch(IOException ioe) {
            System.out.println("Input Ouput Exception!. ");
            System.out.println(ioe.getMessage());
        }
        catch(Exception ex) {
            System.out.println("Andere error!. ");
            System.out.println(ex.getMessage());
        }
    }

    public void readData() {

        try {
            File dataFile =  new File(fileName);
            FileReader fr = new FileReader(dataFile);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            int counter = 0;
            while(line != null) {
                counter++;

                switch(counter) {
                    case 1:
                        System.out.println("Naam:" + line);
                        break;
                    case 2:
                        System.out.println("Leeftijd:" + line);
                        break;
                    case 3:
                        System.out.println("Studie:" + line);
                        break;
                    default:
                        System.out.println("Overige:" + line);
                }
                line = br.readLine();
            }
            br.close();
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Bestand is niet toegangelijk. ");
            System.out.println(fnfe.getMessage());
        }
        catch(IOException ioe) {
            System.out.println("Input Ouput Exception!. ");
            System.out.println(ioe.getMessage());
        }
        catch(Exception ex) {
            System.out.println("Andere error!. ");
            System.out.println(ex.getMessage());
        }


    }

    public void readDataOld() {

        try {
            String bestandsnaam = "data.txt";
            FileInputStream fis = new FileInputStream(bestandsnaam);
            boolean eof = false; // eof = end of file
            while(!eof) {
                int counter = fis.read();
                if(counter == -1) {
                    eof = true;
                }
                else {
                    System.out.print("Data: " + counter);

                }
                fis.close();
            }

        }
        catch (Exception ex) {

        }


    }

}
