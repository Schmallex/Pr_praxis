package a09;



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


    public void addPropertyChangeListener(SmileyView view) {
        support.addPropertyChangeListener(view);
    }

    public void removePropertyChangeListener(SmileyView view) {
        support.removePropertyChangeListener(view);
    }

    protected void zustandAendern() {
        support.firePropertyChange("MODEL_UPDATE", "EVENT","EVENTE");
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
        zustandAendern();
    }

    public void setDegree(double degree) {
        this.degree = degree;
        zustandAendern();
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
