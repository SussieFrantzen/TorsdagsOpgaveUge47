package Varer;

import java.util.ArrayList;
import java.util.Collection;

public class Vare {

    private String ean;
    private double pris, bruttoVægt;
    private String varerDeklaration, enhed, prisdateret;
    boolean erDetLøsvægtet, enhedGram, enhedMl, tilgaengelig;
    public ArrayList<Vare>vare = new ArrayList<>();

    public Vare(){

    }
    public Vare(String ean, String varerDeklaration, String prisdateret, double pris,
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

    // get metoder:

    public String getEan(){
        return ean;
    }

    public String getVarerDeklaration(){
        return varerDeklaration;
    }

    public String getPrisdateret(){
        return prisdateret;
    }

    public double getPris(){
        return (double) pris;
    }

    public boolean getErDetLøsvægetet(){
        return erDetLøsvægtet;
    }

    public double getBruttoVægt(){
        return (double) bruttoVægt;
    }
    public String getEnhed(){
        return enhed;
    }

    public boolean getEnhedGram(){
        return enhedGram;
    }

    public boolean getEnhedMl(){
        return enhedMl;
    }

    public boolean getTilgaengelig(){
        return tilgaengelig;
    }


    public String toString(){
        return "EAN: "+ ean +" " + "Varebeskrivelse: " + varerDeklaration +" " +" prisdatering: " + prisdateret +
                " " + "pris: " + pris + " "  + "Løsvægt?: " + erDetLøsvægtet+" "  + "Bruttovægt: " + bruttoVægt +
                " " + enhed +" " + " vægtet: " + enhedGram +" " + " flydende: " + enhedMl +" " + "Tilgængelighed: "+ tilgaengelig;
    }

}
