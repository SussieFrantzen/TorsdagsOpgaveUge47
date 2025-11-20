package Util;

import Varer.AlleTilbud;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

/*
    public void scanVareListe(String stigTilFil, String ArrayName) {
        File fil = new File(stigTilFil); // stig til hvor filen findes
        try {
            Scanner scanner = new Scanner(fil); // scanner der læser filen
            if (scanner.hasNextLine()) {
                scanner.nextLine();  //spring til næste linje istedet for at læse den første linje som er header

                while (scanner.hasNextLine()) {  // loop køre igennem så længe der er filer
                    String produktlinje = scanner.nextLine(); //  hver linje systemmet læser laver vi til en string der kaldes produktlinje

                    String[] produktElement = produktlinje.split(";"); // her bliver indholdet opdelt når der dukker ; i produktlinjen

                    ArrayName.add(new (
                            produktElement[0], //laver første element i filen om til en int
                            produktElement[1],  // String element
                            produktElement[2], // String element
                            Double.parseDouble(produktElement[3]), //laver fjere element i filen om til en double
                            Boolean.parseBoolean(produktElement[4]), // laver til boolean
                            Double.parseDouble(produktElement[5]), //laver sjette element i filen om til en double
                            produktElement[6],
                            Boolean.parseBoolean(produktElement[7]), // laver til boolean
                            Boolean.parseBoolean(produktElement[8]), // laver til boolean
                            Boolean.parseBoolean(produktElement[9]))); // laver til boolean

                }


            } scanner.close(); // lukker scanner
        } catch (FileNotFoundException e) {
            System.out.println("fil ikke fundet");
        }
    }

 */
}