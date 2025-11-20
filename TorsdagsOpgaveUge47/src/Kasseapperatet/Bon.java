package Kasseapperatet;

import Varer.Kurv;
import Varer.ScanningSystem;
import Varer.Vare;

public class Bon {
    //Printer varedeklaration, pris
    ScanningSystem scanningSystem = new ScanningSystem();
    Vare vare = new Vare();
    Kurv kurv = new Kurv();
    public void bon() {
        System.out.println("----- VAREINFO -----");
        for (Vare vare : kurv.getKurv()) {
            System.out.println("Vare: " + vare.getVarerDeklaration());
            System.out.println("Pris: " + vare.getPris());
            System.out.println();
        }
    }

}
