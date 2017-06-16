package a10;



import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by Alex on 30.05.2017.
 */
public class SmileyModel  {

    protected int durchmesser;
    protected boolean smile;
    protected double degree;
    protected int x;
    protected int y;
    protected int radius;
    private PropertyChangeSupport support;

    public SmileyModel(int durchmesser, boolean smile, double degree, int x, int y) {
        this.durchmesser = durchmesser;
        this.smile = smile;
        this.degree = degree;
        this.x = x;
        this.y = y;
        this.radius = durchmesser / 2;
        this.support=new PropertyChangeSupport((this));
    }


    public void addPropertyChangeListener(PropertyChangeListener listen) {
        support.addPropertyChangeListener(listen);
    }

    public void removePropertyChangeListener(FirstSmileyPanel view) {
        support.removePropertyChangeListener(view);
    }

    protected void zustandAendern(Object parameter) {
        support.firePropertyChange("MODEL_UPDATE", "EVENT",parameter);
    }

    public void moveRelativ(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
        zustandAendern(smile);
    }

    public void setDegree(double degree) {
        this.degree = degree;
        zustandAendern(degree);
    }


    public boolean getSmile() {
        return smile;
    }

    public double getDegree() {
        return degree;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDurchmesser(){
        return durchmesser;
    }


}
