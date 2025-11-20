package Varer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AlleTilbud {
    private String ean;
    private double pris, antalStk, antalGram, antalMl, bruttoVægt;
    private String varerDeklaration, enhed;
    private String prisdateret; // --------------------------undersøg om denne skal have anden enhed da det er dato
    boolean erDetLøsvægtet, enhedGram, enhedMl, tilgaengelig;
    private Collection<AlleVarer> allevare;
    private Collection<AlleTilbud> alleTilbud = new ArrayList<>();

    public AlleTilbud() {
    }

    public ArrayList<String> AlleTilbudArray = new ArrayList<>();
    //ArrayList konstruktor skal indeholde :int ean, String varerDeklaration,
    // String prisdateret, double pris, boolean ErDetLøsvægtet, double brottoVægt, String enhed,
    // boolean enhedGram, boolean enhedMl, boolean tilgaengelig


    public AlleTilbud(String ean, String varerDeklaration, String prisdateret, double pris,
                      boolean erDetLøsvægtet, double bruttoVægt, String enhed,
                      boolean enhedGram, boolean enhedMl, boolean tilgaengelig) {
        this.ean = ean;
        this.varerDeklaration = varerDeklaration;
        this.prisdateret = prisdateret;
        this.pris = pris;
        this.erDetLøsvægtet = erDetLøsvægtet;
        this.bruttoVægt = bruttoVægt;
        this.enhed = enhed;
        this.enhedGram = enhedGram;
        this.enhedMl = enhedMl;
        this.tilgaengelig = tilgaengelig;
    }

    public void scanTilbud() {
        try {  //
            File fileTilbud = new File("src/Data/tilbud.csv"); // stig til hvor filen findes
            Scanner scanner = new Scanner(fileTilbud); // scanner der læser filen
            if (scanner.hasNextLine()) {
                scanner.nextLine();  //spring til næste linje istedet for at læse den første linje som er header
            }

            while (scanner.hasNextLine()) {  // loop køre igennem så længe der er filer
                String produktlinje = scanner.nextLine(); //  hver linje systemmet læser laver vi til en string der kaldes produktlinje

                String[] produktElement = produktlinje.split(";"); // her bliver indholdet opdelt når der dukker ; i produktlinjen

                AlleTilbud tilbud = new AlleTilbud(
                        produktElement[0], //laver første element i filen om til en int
                        produktElement[1],  // String element
                        produktElement[2], // String element
                        Double.parseDouble(produktElement[3]), //laver fjere element i filen om til en double
                        Boolean.parseBoolean(produktElement[4]), // laver til boolean
                        Double.parseDouble(produktElement[5]), //laver sjette element i filen om til en double
                        produktElement[6],
                        Boolean.parseBoolean(produktElement[7]), // laver til boolean
                        Boolean.parseBoolean(produktElement[8]), // laver til boolean
                        Boolean.parseBoolean(produktElement[9])); // laver til boolean
                AlleTilbudArray.add(tilbud.toString());

            }

            scanner.close(); // lukker scanner

        } catch (
                FileNotFoundException e) {  // hvis der ikke er en korrekt stig til at finde dokumentet vil der blive sendt denne besked
            System.out.println("Fil ikke fundet");
        }
    }


    public String toString(){
        return "EAN: "+ ean +" " + "Varebeskrivelse: " + varerDeklaration +" " +" prisdatering: " + prisdateret +
                " " + "pris: " + pris + " "  + "Løsvægt?: " + erDetLøsvægtet+" "  + "Bruttovægt: " + bruttoVægt +
                " " + enhed +" " + " vægtet: " + enhedGram +" " + " flydende: " + enhedMl +" " + "Tilgængelighed: "+ tilgaengelig;
    }

    public void printArraylist() {
        //System.out.println("\u001B[36m");
        AlleTilbudArray.forEach(System.out::println);
    }

    public double getPris(){
        return (double) pris;
    }


}


