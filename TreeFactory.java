package a03;

import schimkat.berlin.lernhilfe2015ss.tree.QadTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Alex on 03.05.2017.
 */
public class TreeFactory {
    public static void main(String[] args) {
        try{
            QadTree baum =createTree("I://Treetest.txt");
            //QadTree baum =buildTree();
            baum.showInGUI();

        }
        catch (Exception e){
            System.err.print(e);
        }
    }

    public static QadTree buildTree(){
        QadTree tree = new QadTree("Bob");
        tree.addChild("Bob","2,1");
        tree.addChild("Bob","2,2");
        tree.addChild("2,1","3,1");
        tree.addChild("2,1","3,2");
        tree.addChild("2,2","3,3");
        tree.addChild("2,2","3,4");
        tree.addChild("3,1","4,1");
        tree.addChild("3,1","4,2");
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

    public static QadTree createTree(String[] array){
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

