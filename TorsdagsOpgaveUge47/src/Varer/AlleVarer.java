package Varer;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.*;

public class AlleVarer {
    /* denne klasse læser filen for alle vare og giver hvert felt i linjen en type.
      */
    public static Map<String, Vare> alleVareIndlaeses() {
        Map<String, Vare> map = new HashMap<>();
        {
            try {
                File alleVareFil = new File("src/Data/varer.csv"); // stig til hvor filen findes
                Scanner scanner = new Scanner(alleVareFil); // scanner der læser filen

                    if (scanner.hasNextLine()) {
                    scanner.nextLine();  //spring til næste linje istedet for at læse den første linje som er header
                }
                while (scanner.hasNextLine()){
                    String filLinje = scanner.nextLine();
                    String[] delElement = filLinje.split(";");

                    String ean = delElement[0]; //laver første element i filen om til en int
                    String varerDeklaration = delElement[1];  // String element
                    String prisdateret = delElement[2]; // String element
                    double pris = Double.parseDouble(delElement[3]); //laver fjere element i filen om til en double
                    boolean erDetLøsvægtet = Boolean.parseBoolean(delElement[4]); // laver til boolean
                    double bruttoVægt = Double.parseDouble(delElement[5]); //laver sjette element i filen om til en double
                    String enhed = delElement[6];
                    boolean enhedGram = Boolean.parseBoolean(delElement[7]); // laver til boolean
                    boolean enhedMl = Boolean.parseBoolean(delElement[8]); // laver til boolean
                    boolean tilgaengelig = Boolean.parseBoolean(delElement[9]); // laver til boolean

                    Vare vare = new Vare(ean,varerDeklaration,prisdateret,pris,erDetLøsvægtet,
                            bruttoVægt,enhed,enhedGram,enhedMl,tilgaengelig);

                    map.put(ean,vare);

                } scanner.close(); // lukker scanner

            } catch (
                    FileNotFoundException e) {  // hvis der ikke er en korrekt stig til at finde dokumentet vil der blive sendt denne besked
                System.out.println("Fil ikke fundet");
            }
            return map;
        }
    }

}
