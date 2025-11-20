package Varer;

import java.util.ArrayList;
import java.util.Collection;

/*
            Denne klasse danner konstruktor for de 2 colletions af varer og tilbud.
            Ved ikke om den bliver nødvendig efter de 2 klasser er kommet op og køre.


 */


public class VareTmp {
    private int ean;
    private double pris, antalStk, antalGram, antalMl, brottoVægt;
    private String varerDeklaration, enhed;
    private String prisdateret; // --------------------------undersøg om denne skal have anden enhed da det er dato
    boolean ErDetLøsvægtet, enhedGram, enhedMl, tilgaengelig ;
    private Collection<AlleVarer> allevare;
    private Collection<AlleTilbud> alleTilbud;

// Der skal laves 2 collections en for alleVarer og en for tilbudsVarer

    private Collection<AlleVarer> alleVarer = new ArrayList<>();
    private Collection<AlleTilbud> alleTilbuds = new ArrayList<>();


    /* For at jeg kan lave min kontruktor skal jeg vide hvad den skal indeholde.
    Derfor har jeg taget et udsnit af vare-filen og adskilt den så det var lettere at se opdelingen
    og få forståelse for hvordan infoen er bygget op:

     EAN Nr.;         varerDeklaration;                            priceDate;      price;      isBudgetBrand;  ( quantity;   unit;)    isWeighted;    isBio;    isAvailable
     8000500279823;   Kinder Kalender Hus, 234 GR / Polen;         2023-11-08;     110.0;      false;           234;          g;        false;       false;    true

     */
    public VareTmp(int ean, String varerDeklaration, String prisdateret, double pris, boolean ErDetLøsvægtet, double brottoVægt, String enhed, boolean enhedGram, boolean enhedMl, boolean tilgaengelig){
        this.ean = ean;
        this.varerDeklaration = varerDeklaration;
        this.pris = pris;
        this.enhed = enhed;
        this.ErDetLøsvægtet = ErDetLøsvægtet;
        this.brottoVægt = brottoVægt;
        this.enhedGram = enhedGram;
        this.enhedMl = enhedMl;
        this.tilgaengelig =tilgaengelig;
        this.antalStk = antalStk;
        this.antalGram = antalGram;
        this.antalMl = antalMl;
    }


    // ikke sikker denne skal bruges var en del af første tanke
    public VareTmp(int antalStk, String varerDeklaration, double pris ){  // denne streng tager kun udgangspunkt i mængden af varer i stk. varebeskrivelse og pris
        this.antalStk = antalStk;
        this.varerDeklaration = varerDeklaration;
        this.pris = pris;
    }


}
