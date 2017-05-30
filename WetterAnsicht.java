package a07;


import schimkat.berlin.lernhilfe2017ss.event.weather.WeatherSymbol;
import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterAnsicht implements PropertyChangeListener {

    private DirtyPainter painter;
    private WeatherSymbol symbol;

    public WetterAnsicht() {
        this.painter = new DirtyPainter();
        this.symbol = new WeatherSymbol(50, 50);
        painter.add(symbol);
        painter.showDrawing();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        String comp = (String) evt.getNewValue();
        if (comp.equals(WetterZustand.SONNIG.name())) {
            symbol.changeToSunny();
            painter.showDrawing();
        }
        if (comp.equals(WetterZustand.WOLKIG.name())) {
            symbol.changeToCloudy();
            painter.showDrawing();
        }
        if (comp.equals(WetterZustand.REGEN.name())) {
            symbol.changeToRain();
            painter.showDrawing();
        }
        if (comp.equals(WetterZustand.GEWITTER.name())) {
            symbol.changeToTempest();
            painter.showDrawing();
        }
        if (comp.equals(WetterZustand.BEDECKT.name())) {
            symbol.changeToOvercast();
            painter.showDrawing();
        }
    }
}