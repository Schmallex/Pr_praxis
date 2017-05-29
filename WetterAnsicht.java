package a07;


import schimkat.berlin.lernhilfe2017ss.event.weather.WeatherSymbol;
import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterAnsicht implements PropertyChangeListener {

    private DirtyPainter painter ;
    private WeatherSymbol symbol ;

    public WetterAnsicht(){
        this.painter= new DirtyPainter();
        this.symbol = new WeatherSymbol(50,50);
        painter.add(symbol);
        painter.showDrawing();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        String comp = (String)evt.getNewValue();
        switch (comp) {
            case "SONNIG":
                symbol.changeToSunny();
                painter.showDrawing();
                break;
            case "WOLKIG":
                symbol.changeToCloudy();
                painter.showDrawing();
                break;
            case "REGEN":
                symbol.changeToRain();
                painter.showDrawing();
                break;
            case "GEWITTER":
                symbol.changeToTempest();
                painter.showDrawing();
                break;
            case "BEDECKT":
                symbol.changeToOvercast();
                painter.showDrawing();
                break;
        }
    }
}