package a07;

import a05.WetterPrinter;
import schimkat.berlin.lernhilfe2017ss.event.Timer;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterTest {
    public static void main(String[] args) {

        WetterAnsicht ansicht1 = new WetterAnsicht();
        WetterAnsicht ansicht2 = new WetterAnsicht();

        WetterModel model1 = new WetterModel();
        WetterModel model2 = new WetterModel();
        model1.addListener(ansicht1);
        model2.addListener(ansicht2);

        WetterEmpfangsZentrale wetterEmpfang2= new WetterEmpfangsZentrale(model2);
        WetterEmpfangsZentrale wetterEmpfang1 = new WetterEmpfangsZentrale(model1);

        WetterPrinter print =new WetterPrinter();

        Timer sonne = new Timer(9000);
        sonne.setActionCommand("SONNIG");
        sonne.addActionListener(wetterEmpfang1);
        sonne.addActionListener(print);

        Timer regen = new Timer(15000);
        regen.setActionCommand("REGEN");
        regen.addActionListener(wetterEmpfang1);
        regen.addActionListener(wetterEmpfang2);
        regen.addActionListener(print);

        Timer wolkig = new Timer(12000);
        wolkig.addActionListener(wetterEmpfang1);
        wolkig.addActionListener(print);
        wolkig.setActionCommand("WOLKIG");

        Timer bedeckt = new Timer(17000);
        bedeckt.addActionListener(wetterEmpfang1);
        bedeckt.addActionListener(wetterEmpfang2);
        bedeckt.addActionListener(print);
        bedeckt.setActionCommand("BEDECKT");

        Timer gewitter = new Timer(20000);
        gewitter.addActionListener(wetterEmpfang1);
        gewitter.addActionListener(print);
        gewitter.setActionCommand("GEWITTER");

        gewitter.start();
        bedeckt.start();
        regen.start();
        wolkig.start();
        sonne.start();
    }
}