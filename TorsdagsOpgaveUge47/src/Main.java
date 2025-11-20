import Util.TestUI;
import Varer.AlleTilbud;
import Varer.AlleVarer;
import Varer.Kurv;
import Varer.ScanningSystem;

public class Main {
    public static void main(String[] args) {

        //Test:
        //AlleTilbud alleTilbud = new AlleTilbud();
        //alleTilbud.ScanTilbud();
        //alleTilbud.printArraylist();
        TestUI tui = new TestUI();

        AlleVarer alleVarer = new AlleVarer();
        alleVarer.ScanVarer();
       // alleVarer.printArraylist();

        Kurv kurv = new Kurv();
        kurv.tilføjTilKurv();
       // kurv.printArraylist();

        ScanningSystem scanningSystem = new ScanningSystem();
        scanningSystem.VarerFindesPåBeggeLister();
        scanningSystem.printArraylist();
    }
}