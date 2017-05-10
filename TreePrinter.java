package a04;

import a03.TreeFactory;
import schimkat.berlin.lernhilfe2015ss.tree.QadTree;
import schimkat.berlin.lernhilfe2015ss.tree.QadTreeWalker;

import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.tree.TreeNode;


public class TreePrinter {
    public static void main(String[] args) {
        try{
            PrintWriter oute = new PrintWriter(System.out);
            PrintWriter out = new PrintWriter("I://test.txt");
            QadTree tree = TreeFactory.buildTree();
            Iterator<TreeNode> iterator = QadTreeWalker.preorderIterator(tree);
            out.println();
            printTree(iterator,oute,10,true);
            printTree(tree,out,10);
        }
        catch(Exception e) {

        }
    }

    public static void printTree(Iterator<TreeNode> iterator, PrintWriter out) {
        while (iterator.hasNext()) {
            out.println(iterator.next());
        }
    }

    public static void printTree(Iterator<TreeNode> iterator, PrintWriter out, int width, boolean skipLeafs) {
        while (iterator.hasNext()) {
            TreeNode node = iterator.next();
            if (skipLeafs) {
                if (node.isLeaf()) {
                    continue;
                }
            }
            Enumeration<String> enu = node.children();
           String s =(String.format("%-"+width+"s",node));
            while(enu.hasMoreElements()){
                String g =(String.format("%-"+width+"s",enu.nextElement()));
                s= s+g;
            }
            out.println(s);
            out.flush();
        }
    }

    public static void printTree(QadTree tree, PrintWriter out, int width) {
        Iterator<TreeNode> iterator = QadTreeWalker.preorderIterator(tree);
        TreeNode node = iterator.next();
        out.println(node.toString());
        Iterator<TreeNode> iteratore = QadTreeWalker.preorderIterator(tree);
        printTree(iteratore,out,width,true);
    }
}

