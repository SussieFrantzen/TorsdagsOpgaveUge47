package Varer;

import java.util.ArrayList;
import java.util.Collection;

public class ScanningSystem {
      private double ean;
    private double pris, bruttoVægt, tilbudværdi;
    private String varerDeklaration, enhed;
    private String prisdateret; // --------------------------undersøg om denne skal have anden enhed da det er dato
    boolean erDetLøsvægtet, enhedGram, enhedMl, tilgaengelig;

    public Collection<ScanningSystem> ScanningsSystemArray = new ArrayList<>();

    AlleVarer alleVarerClas = new AlleVarer();
    AlleTilbud alleTilbudClas= new AlleTilbud();
    Kurv kurv= new Kurv();
    Vare vare = new Vare();

    public ScanningSystem(){

    }

    // metode der kan lave et arraylist/collection over kundens indkøb når det køre igennem scanner
    public static ArrayList<String> scannetKurv = new ArrayList<>();
    public ScanningSystem(double ean, String varerDeklaration, String prisdateret, double pris,
                     boolean erDetLøsvægtet, double bruttoVægt, String enhed,
                     boolean enhedGram, boolean enhedMl, boolean tilgaengelig, double tilbudværdi) {
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
        this.tilbudværdi = tilbudværdi;
    }


    // metode der scanner kundens kurv og sortere inden der skal beregnes pris
    // (boolean der tjekker om varen findes på begge lister og returnerer sandt eller falsk)
    //  der tilføjer varer til kurv ud fra sandt eller falsk.
    // - Hvis sandt henter fra tilbudsvarer samt tilføjer normal pris til arraylist og
    // - falsk tager fra normal liste og til føjer 0kr. I rabat pris


    public boolean VarerFindesPåBeggeLister() { //tilføje en varer til listen
               if (!alleTilbudClas.AlleTilbudArray.toString().contains(vare.getEan())) { // hvis varen ikke er på tilbud listen
            // mangler

            scannetKurv.add(vare.toString() + 0); // skal den tilføje linjen fra Alle vare listen og tilføjer en et index med værdien 0 på tilpudspris plads
            return true;
        } else {
            scannetKurv.add(vare.toString() + alleTilbudClas.getPris()); // skal den tilføje linjen og tilføje tilbudsprisen fra tilbudsprisen
            return false;

        }
    }

    public String toString(){
        return "EAN: "+ ean +" " + "Varebeskrivelse: " + varerDeklaration +" " +" prisdatering: " + prisdateret +
                " " + "pris: " + pris + " "  + "Løsvægt?: " + erDetLøsvægtet+" "  + "Bruttovægt: " + bruttoVægt +
                " " + enhed +" " + " vægtet: " + enhedGram +" " + " flydende: " + enhedMl +" " + "Tilgængelighed: "+ tilgaengelig + tilbudværdi ;
    }

    public void printArraylist() {
        //System.out.println("\u001B[36m");
        scannetKurv.forEach(System.out::println);
    }
    public double getTilbudværdi() {
        return tilbudværdi;
    }


}
