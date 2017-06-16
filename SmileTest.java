package a09;
import schimkat.berlin.lernhilfe2017ss.event.Timer;
import utils.ActionPrinter;

/**
 * Created by Alex on 06.06.2017.
 */
public class SmileTest {
    public static void main(String[] args) {
        SmileyModel model = new SmileyModel(50,false,50,50,50);


        SmileyView view = new SmileyView(model);
        SmileyView view2 = new SmileyView(model);

        model.addPropertyChangeListener(view);
        model.addPropertyChangeListener(view2);

        SmileZentrale zent = new SmileZentrale(model);

        ActionPrinter print = new ActionPrinter();

        Timer frown = new Timer(9000);
        frown.setActionCommand("false");
        frown.addActionListener(zent);
        frown.addActionListener(print);

        Timer happy = new Timer(6000);
        happy.setActionCommand("true");
        happy.addActionListener(zent);
        happy.addActionListener(print);

        Timer degree = new Timer(5000);
        degree.setActionCommand("150");
        degree.addActionListener(zent);
        degree.addActionListener(print);

        Timer degrees = new Timer(8000);
        degrees.setActionCommand("300");
        degrees.addActionListener(zent);
        degrees.addActionListener(print);

        happy.start();
        frown.start();
        degree.start();
        degrees.start();

    }
}
