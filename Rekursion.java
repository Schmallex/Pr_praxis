package a02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rekursion {

    public static void main(String[] args) {
        try{
            test();
            File f = new File("C:/java.project/PR2PRAXIS/data/test.txt");
            test(f);
        }
        catch(Exception e){
            System.err.print(e);}
    }

    public static void test(){
        int[] i = createArrayDirectFrom("1 2 3 4 5 6 7 8 9 10 11 12 13");
        for(int u =1;u<=i.length;u++){
            System.out.println(indexOfRecursive(u,i));
        }
    }

    public static void test(File dir)throws  Exception{
        Scanner in = new Scanner(dir);
        int i[] = createArray(in);
        System.out.println(indexOfStandard(25,i));
        System.out.println(indexOfRecursive(25,i));
    }

    public static int[] createArray(Scanner in) {
        List<Integer> list =new ArrayList<Integer>();
        while(in.hasNextInt()){
            list.add(in.nextInt());
        }
        return createFromList(list);
    }

    public static int[] createArrayDirectFrom(String StringWithNumbers) {
        List<Integer> list =new ArrayList<Integer>();
        Scanner in = new Scanner(StringWithNumbers);
        while(in.hasNextInt()){
            list.add(in.nextInt());
        }
        in.close();
        return createFromList(list);
    }

    public static int[] createFromList(List<Integer> list){
        int[] i = new int[list.size()];
        for(int c = 0;c< list.size();c++){
            i[c]=list.get(c);
        }
        return i;
    }

    public static int[] createArray(String file)throws Exception {
        return createArray(new Scanner(new File(file)));
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int indexOfStandard(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfRecursive(int number,int[] array) {
        if (array ==null){
            return -1;
        }
        else {
            return indexOfRecursiv(number,array,0,array.length-1);
        }
    }

    public static int indexOfRecursiv(int number, int[] array, int startIndex, int endIndex) {
        int mid = startIndex+((endIndex - startIndex) / 2);
        if (number == array[mid]) {
            return mid;
        }
        if (number < array[0]|| number >array[array.length-1]){
            return -1;
        }
        if (number <= array[mid]&& number >= array[startIndex] ) {
            return indexOfRecursiv(number, array, startIndex,mid);
        }
        if (number == array[endIndex]){
            return endIndex;
        }
        else {
            return indexOfRecursiv(number, array,mid, endIndex);
        }
    }
}

