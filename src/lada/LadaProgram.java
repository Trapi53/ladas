package lada;

import java.util.Scanner;

public class LadaProgram {

    boolean megfejtes = true;

    private final String arany;
    private final String ezust;
    private final String bronz;

    private final String aranyFelirat = "Én rejtem a kincset!";
    private final String ezustFelirat = "Nem én rejtem a kincset!";
    private final String bronzFelirat = "Az arany hazudik!";

    public LadaProgram() {
        this.arany = "ARANY LÁDA";
        this.ezust = "EZÜST LÁDA";
        this.bronz = "BRONZ LÁDA";
    }

    public void kiir() {
        System.out.println("3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik láda állítása igaz!");
        System.out.println("   " + arany + " " + "            " + ezust + " " + "          " + bronz);
        System.out.println(aranyFelirat + " " + ezustFelirat + " " + bronzFelirat);
    }

    public void megfejtes() {
        Scanner userinput = new Scanner(System.in);
        if (userinput="bronz") {
            megfejtes=true;
        }else{
            megfejtes=false;
        }
    }
}
