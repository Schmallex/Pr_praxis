package a05;

import schimkat.berlin.lernhilfe2017ss.event.Timer;

public class WetterPrinterTest {
    public static void main(String[] args) {
        Wetterzustand w = new Wetterzustand();
        WetterPrinter print = new WetterPrinter();
        
        Timer sonne = new Timer(9000);
        sonne.setActionCommand(w.sonne);
        sonne.addActionListener(print);

        Timer wolkig = new Timer(12000);
        wolkig.setActionCommand(w.wolkig);
        wolkig.addActionListener(print);

        Timer regen = new Timer(15000);
        regen.setActionCommand(w.regen);
        regen.addActionListener(print);

        Timer bedeckt = new Timer(17000);
        bedeckt.setActionCommand(w.bedeckt);
        bedeckt.addActionListener(print);    

        Timer gewitter = new Timer(20000);
        gewitter.setActionCommand(w.gewitter);
        gewitter.addActionListener(print);
        
        while (true) {
            sonne.start();
            gewitter.start();
            bedeckt.start();
            regen.start();
            wolkig.start();
        }
    }
}
