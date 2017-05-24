package a06;

import a05.WetterPrinter;
import schimkat.berlin.lernhilfe2017ss.event.Timer;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterTest {
    public static void main(String[] args) {
        WetterEmpfangsZentrale w = new WetterEmpfangsZentrale();
        WetterPrinter print =new WetterPrinter();

        Timer sonne = new Timer(9000);
        sonne.setActionCommand("SONNIG");
        sonne.addActionListener(w);
        sonne.addActionListener(print);

        Timer regen = new Timer(15000);
        regen.setActionCommand("REGEN");
        regen.addActionListener(w);
        regen.addActionListener(print);

        Timer wolkig = new Timer(12000);
        wolkig.addActionListener(w);
        wolkig.addActionListener(print);
        wolkig.setActionCommand("WOLKIG");

        Timer bedeckt = new Timer(17000);
        bedeckt.addActionListener(w);
        bedeckt.addActionListener(print);
        bedeckt.setActionCommand("BEDECKT");

        Timer gewitter = new Timer(20000);
        gewitter.addActionListener(w);
        gewitter.addActionListener(print);
        gewitter.setActionCommand("GEWITTER");

        gewitter.start();
        bedeckt.start();
        regen.start();
        wolkig.start();
        sonne.start();


    }
}
