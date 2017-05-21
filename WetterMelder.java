package a05;

import schimkat.berlin.lernhilfe2017ss.event.weather.WeatherSymbol;
import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 21.05.2017.
 */
public class WetterMelder implements ActionListener {
    DirtyPainter painter;
    WeatherSymbol symbol;

    public WetterMelder(DirtyPainter painter, WeatherSymbol weatherSymbol) {
        this.painter = painter;
        this.symbol = weatherSymbol;
        painter.add(symbol);
        painter.showDrawing();
    }

    public void actionPerformed(ActionEvent e) {
        String comp = e.getActionCommand();
        switch (comp) {
            case ("SONNIG"):
                symbol.changeToSunny();
                painter.showDrawing();
                break;
            case ("WOLKIG"):
                symbol.changeToCloudy();
                painter.showDrawing();
                break;
            case ("REGEN"):
                symbol.changeToRain();
                painter.showDrawing();
                break;
            case ("GEWITTER"):
                symbol.changeToTempest();
                painter.showDrawing();
                break;
            case ("BEDECKT"):
                symbol.changeToOvercast();
                painter.showDrawing();
                break;
        }
    }
}
