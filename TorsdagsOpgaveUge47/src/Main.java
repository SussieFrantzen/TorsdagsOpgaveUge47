import Kasseapperatet.Bon;
import Util.TestUI;
import Varer.AlleTilbud;
import Varer.AlleVarer;
import Varer.Kurv;
import Varer.ScanningSystem;

public class Main {
    public static void main(String[] args) {

      //test
        Bon bon = new Bon();
        AlleVarer alleVarer= new AlleVarer();
        AlleTilbud alleTilbud= new AlleTilbud();
        Kurv kurv = new Kurv();
        ScanningSystem scanningSystem= new ScanningSystem();

        alleVarer.alleVareIndlaeses();
        alleTilbud.scanTilbud();
        kurv.tilføjTilKurv();

        bon.bon();
       //  kurv.printDeklarationOgPris();
    }
}