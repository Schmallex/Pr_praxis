package a07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterEmpfangsZentrale implements ActionListener {
    private WetterModel model ;
    public WetterEmpfangsZentrale(WetterModel model){
        this.model = model;
    }

    public void actionPerformed(ActionEvent e) {
        model.setWetter(e.getActionCommand());
    }
}