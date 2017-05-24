package a06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterEmpfangsZentrale implements ActionListener {
    WetterModel model = new WetterModel();
    public void actionPerformed(ActionEvent e) {
        model.setWetter(e.getActionCommand());

    }
}
