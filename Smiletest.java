package a08;

import schimkat.berlin.lernhilfe2017ss.graphics.DirtyPainter;

/**
 * Created by Alex on 31.05.2017.
 */
public class Smiletest {
    public static void main (String[] args){
        DirtyPainter paint = new DirtyPainter();
        DirtyPainter paint2 = new DirtyPainter();
        Smiley smile = new Smiley(250,false,180,150,150);
        Smiley smile2 = new Smiley(250,true,90,150,150);
        paint2.add(smile2);
        paint.add(smile);
        paint2.showDrawing();
        paint.showDrawing();


    }
}
