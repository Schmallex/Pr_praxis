package a07;

import a05.WetterPrinter;
import a07.WetterModel;
import schimkat.berlin.lernhilfe2017ss.event.Timer;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterTestEnum {
    public static void main(String[] args) {

        WetterAnsicht ansicht1 = new WetterAnsicht();
        WetterAnsicht ansicht2 = new WetterAnsicht();

        WetterModel model1 = new WetterModel();
        WetterModel model2 = new WetterModel();
        model1.addListener(ansicht1);
        model2.addListener(ansicht2);

        WetterEmpfangsZentrale w2= new WetterEmpfangsZentrale(model2);
        WetterEmpfangsZentrale w = new WetterEmpfangsZentrale(model1);

        WetterPrinter print =new WetterPrinter();

        Timer sonne = new Timer(9000);
        sonne.setActionCommand(WetterZustand.SONNIG.name());
        sonne.addActionListener(w);
        sonne.addActionListener(print);

        Timer regen = new Timer(15000);
        regen.setActionCommand(WetterZustand.REGEN.name());
        regen.addActionListener(w);
        regen.addActionListener(w2);
        regen.addActionListener(print);

        Timer wolkig = new Timer(12000);
        wolkig.addActionListener(w);
        wolkig.addActionListener(print);
        wolkig.setActionCommand(WetterZustand.WOLKIG.name());

        Timer bedeckt = new Timer(17000);
        bedeckt.addActionListener(w);
        bedeckt.addActionListener(w2);
        bedeckt.addActionListener(print);
        bedeckt.setActionCommand(WetterZustand.BEDECKT.name());

        Timer gewitter = new Timer(20000);
        gewitter.addActionListener(w);
        gewitter.addActionListener(print);
        gewitter.setActionCommand(WetterZustand.GEWITTER.name());

        gewitter.start();
        bedeckt.start();
        regen.start();
        wolkig.start();
        sonne.start();
    }
}