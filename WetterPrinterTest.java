package a05;

import schimkat.berlin.lernhilfe2017ss.event.Timer;

public class WetterPrinterTest {
    public static void main(String[] args) {
        Wetterzustand w = new Wetterzustand();
        WetterPrinter print = new WetterPrinter();

        Timer sonne = new Timer(50);
        sonne.addActionListener(print);
        sonne.setDelay(9000);
        sonne.setActionCommand(w.sonne);

        Timer wolkig = new Timer(25);
        wolkig.addActionListener(print);
        wolkig.setDelay(12000);
        wolkig.setActionCommand(w.wolkig);

        Timer regen = new Timer(14);
        regen.addActionListener(print);
        regen.setDelay(15000);
        regen.setActionCommand(w.regen);

        Timer bedeckt = new Timer(10);
        bedeckt.addActionListener(print);
        bedeckt.setDelay(17000);
        bedeckt.setActionCommand(w.bedeckt);

        Timer gewitter = new Timer(18);
        gewitter.addActionListener(print);
        gewitter.setDelay(20000);
        gewitter.setActionCommand(w.gewitter);
        while (true) {
            sonne.start();
            gewitter.start();
            bedeckt.start();
            regen.start();
            wolkig.start();
        }
    }
}
