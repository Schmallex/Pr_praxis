package a10;


import javax.swing.*;
import java.awt.*;


/**
 * Created by Alex on 17.06.2017.
 */
public class FirstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley");
        Container cont = frame.getContentPane();

        cont.setLayout(new BorderLayout());
        SmileyModel model = new SmileyModel(50, false, 50, 50, 50);
        FirstSmileyPanel panel = new FirstSmileyPanel(model);
        cont.add(panel, BorderLayout.CENTER);

        SmileZentrale zent = new SmileZentrale(model);
        ActionPrinter print = new ActionPrinter();

        model.addPropertyChangeListener(panel);
        model.addPropertyChangeListener(print);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);


        Timer frown = new Timer(9000, zent);
        frown.setActionCommand("false");
        frown.addActionListener(print);

        Timer happy = new Timer(6000, zent);
        happy.setActionCommand("true");
        happy.addActionListener(print);

        Timer degree = new Timer(5000, zent);
        degree.setActionCommand("150");
        degree.addActionListener(print);

        Timer degrees = new Timer(8000, zent);
        degrees.setActionCommand("300");
        degrees.addActionListener(print);

        happy.start();
        frown.start();
        degree.start();
        degrees.start();

    }
}
