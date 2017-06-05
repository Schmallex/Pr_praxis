package a08;

import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

/**
 * Created by Alex on 31.05.2017.
 */
public class Smiletest {
    public static void main (String[] args){
        DirtyPainter paint = new DirtyPainter();
        DirtyPainter paint2 = new DirtyPainter();
        DirtyPainter paint3 = new DirtyPainter();

        Smiley smile = new Smiley(250,false,180,150,150);
        Smiley smile2 = new Smiley(250,true,0,150,150);
        Smiley smile3 =new Smiley(300,true,360,200,150);

        paint2.add(smile2);
        paint.add(smile);
        paint3.add(smile3);

        paint3.showDrawing();
        paint2.showDrawing();
        paint.showDrawing();


    }
}