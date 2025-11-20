package Varer;

import java.util.ArrayList;
import java.util.Collection;

public class Kurv {
    private Collection<AlleVarer> kurv;
    public Collection<Vare> kurvArraylist = new ArrayList<>();

    public Kurv() {
    }

    public Kurv(ArrayList<String> kurvArraylist) {
    }


    public void tilføjTilKurv() {
        kurvArraylist.add(new Vare("5707196315349", "Mou Hyldebærsuppe, 1000 GR / Danmark",
                "2025-11-01", 44.95, false, 1000, "g",
                false, false, true));

        kurvArraylist.add(new Vare("5772739448785", " Hverdags Honning Flydende, 350 GR / Danmark",
                "2025-11-12", 37.31, false, 350, "g", false,
                false, true));
    }



    public String getKurv(){
        return kurvArraylist.toString();
    }

    public void printArraylist() {
        //System.out.println("\u001B[36m");
        kurvArraylist.forEach(System.out::println);
    }

}


    /*   private String ean;
       private double pris, antalStk, antalGram, antalMl, bruttoVægt;
       private String varerDeklaration, enhed;
       private String prisdateret; // --------------------------undersøg om denne skal have anden enhed da det er dato
       boolean erDetLøsvægtet, enhedGram, enhedMl, tilgaengelig;

       }

       public Kurv(String ean, String varerDeklaration, String prisdateret, double pris,
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

     */



   /* public String toString(){
        return "EAN: "+ ean +" " + "Varebeskrivelse: " + varerDeklaration +" " +" prisdatering: " + prisdateret +
                " " + "pris: " + pris + " "  + "Løsvægt?: " + erDetLøsvægtet+" "  + "Bruttovægt: " + bruttoVægt +
                " " + enhed +" " + " vægtet: " + enhedGram +" " + " flydende: " + enhedMl +" " + "Tilgængelighed: "+ tilgaengelig;
    }



    public String getEan(){
        return ean;
    }
     */