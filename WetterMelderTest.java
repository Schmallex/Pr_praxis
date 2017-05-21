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

        Timer sonne = new Timer(50);
        sonne.addActionListener(melder);
        sonne.setDelay(9000);
        sonne.setActionCommand(w.sonne);

        Timer wolkig = new Timer(25);
        wolkig.addActionListener(melder);
        wolkig.setDelay(12000);
        wolkig.setActionCommand(w.wolkig);

        Timer regen = new Timer(14);
        regen.addActionListener(melder);
        regen.setDelay(15000);
        regen.setActionCommand(w.regen);

        Timer bedeckt = new Timer(10);
        bedeckt.addActionListener(melder);
        bedeckt.setDelay(17000);
        bedeckt.setActionCommand(w.bedeckt);

        Timer gewitter = new Timer(18);
        gewitter.addActionListener(melder);
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
