package a05;

import schimkat.berlin.lernhilfe2017ss.event.Timer;
import schimkat.berlin.lernhilfe2017ss.event.weather.WeatherSymbol;
import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

/**
 * Created by Alex on 21.05.2017.
 */
public class WetterMelderTest {
    public static void main(String[] args) {
        Wetterzustand w = new Wetterzustand();
        DirtyPainter paint = new DirtyPainter();
        WeatherSymbol symbol = new WeatherSymbol(50, 50);
        WetterMelder melder = new WetterMelder(paint, symbol);
        WetterPrinter print = new WetterPrinter();

        Timer sonne = new Timer(9000);
        sonne.addActionListener(melder);
        sonne.addActionListener(print);
        sonne.setActionCommand(w.sonne);

        Timer wolkig = new Timer(12000);
        wolkig.addActionListener(melder);
        wolkig.addActionListener(print);
        wolkig.setActionCommand(w.wolkig);

        Timer regen = new Timer(15000);
        regen.addActionListener(melder);
        regen.addActionListener(print);
        regen.setActionCommand(w.regen);

        Timer bedeckt = new Timer(17000);
        bedeckt.addActionListener(melder);
        bedeckt.addActionListener(print);
        bedeckt.setActionCommand(w.bedeckt);

        Timer gewitter = new Timer(20000);
        gewitter.addActionListener(melder);
        gewitter.addActionListener(print);
        gewitter.setActionCommand(w.gewitter);
        sonne.start();
        gewitter.start();
        bedeckt.start();
        regen.start();
        wolkig.start();
    }
}
