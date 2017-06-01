package a08;


import schimkat.berlin.lernhilfe2017ss.graphics.Drawable;
import sun.swing.PrintColorUIResource;

import java.awt.*;

/**
 * Created by Alex on 30.05.2017.
 */
public class Smiley implements Drawable {

    protected int durchmesser;
    protected boolean smile;
    protected double degree;
    protected int x;
    protected int y;
    protected int radius;

    public Smiley(int durchmesser, boolean smile, double degree, int x, int y) {
        this.durchmesser = durchmesser;
        this.smile = smile;
        this.degree = degree;
        this.x = x;
        this.y = y;
        this.radius=durchmesser/2;
    }

    public void draw(Graphics g){
        g.setColor(PrintColorUIResource.PINK);
        g.fillOval(x,y, durchmesser, durchmesser);
        drawEyes(g);
        drawSmile(g);
        drawHat(g);
    }

    public void drawEyes(Graphics g){
        Color c = g.getColor();
        int radius = durchmesser/2;
        int width = radius/2;

        int xLEye = x+ radius/2-radius/8;
        int xREye = x+ radius+ radius/8;
        int yEyes = y+ radius/2;


        double bogenMaß = degree* Math.PI /180;
        int lPupilX =(int) ((xLEye + width/2.5) -Math.cos(bogenMaß)* (radius/8));
        int PupilY = (int)(yEyes+width/2.5 -Math.sin(bogenMaß)* (radius/8));
        int rPupilX =(int) (xREye +width/2.5-Math.cos(bogenMaß)* (radius/8));

        g.setColor(Color.white);
        g.fillOval(xLEye,yEyes,width,width);
        g.fillOval(xREye,yEyes,width,width);

        g.setColor(Color.black);
        g.fillOval(lPupilX,PupilY,width/4,width/4);
        g.fillOval(rPupilX,PupilY,width/4,width/4);

        g.setColor(c);
    }

    public void drawSmile(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.BLACK);

        if(smile){
            g.fillArc(x+radius/2,y+radius,radius,radius/2,180,180);
        }
        else{
            g.fillArc(x+radius/2,y+radius+radius/4,radius,radius/2,360,180);
        }
        g.setColor(c);
    }

    public void drawHat(Graphics g){
        Color c =g.getColor();
        g.setColor(Color.black);
        int startx=x;
        int  starty=y;
        g.fillOval(startx,starty,durchmesser,radius/2);
        g.fillRect(startx+radius/2,starty-radius/2-radius/4,radius,radius);
    }

    public void moveRelativ(int dx,int dy){
        this.x=x+dx;
        this.y=y+dy;
    }

    public void setPosition(int x ,int y){
        this.x=x;
        this.y=y;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }


}
