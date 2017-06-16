package a10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 12.06.2017.
 */
public class SmileZentrale implements ActionListener {
    public SmileyModel smile;

    public SmileZentrale(SmileyModel smile) {
        this.smile = smile;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("false")) {
                smile.setSmile(false);
            } else if (e.getActionCommand().equals("true")) {
                smile.setSmile(true);
            } else {
                smile.setDegree(Double.parseDouble(e.getActionCommand()));
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }

    }
}
