package a03;

import schimkat.berlin.lernhilfe2015ss.tree.QadTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeFactory {
    public static void main(String[] args) {
        try{
            QadTree baum =createTree("C:/java.project/PR2PRAXIS/data/Baum.txt");
            QadTree baume =buildTree();
            baum.showInGUI();
            baume.showInGUI();
        }
        catch (Exception e){
            System.err.print(e);
        }
    }

    public static QadTree buildTree(){
        String[] s ={"Bob","Bobby","Bobbert","Bobbelia","Bobbasti","Barbara","Konnel","Komrad","Lama"};
        QadTree tree = new QadTree(s[0]);
        tree.addChild(s[0],s[1]);
        tree.addChild(s[0],s[2]);
        tree.addChild(s[1],s[3]);
        tree.addChild(s[1],s[4]);
        tree.addChild(s[2],s[5]);
        tree.addChild(s[2],s[6]);
        tree.addChild(s[3],s[7]);
        tree.addChild(s[3],s[8]);
        return tree;
        }

    public static QadTree createTree(String path)throws Exception{
        String[] lines = readLines(path);
        return createTree(lines);
    }

    public static String[] readLines(String path)throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(new File(path)));
        ArrayList<String> list = new ArrayList<>();
        for(String s ;(s=in.readLine()) != null;){
            if(!s.equals("")){
                list.add(s);
            }
        }
        in.close();
        String[] strings = new String[list.size()];
        for(int i =0;i<list.size();i++){
            strings[i]=list.get(i);
        }
        return strings;
        }

    public static QadTree createTree(String[] array)throws Exception{
        QadTree tree = new QadTree(array[0]);
        for (int i = 1;i< array.length;i++){
            Scanner linescan = new Scanner(array[i]);
            String comp = linescan.next();
            while(linescan.hasNext()) {
                tree.addChild(comp,linescan.next());
            }
            linescan.close();
        }
        return tree;
    }
}

