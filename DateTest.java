package a01;

import a01.Date;

public class DateTest {
    public static void main(String[] args) {
        try{
            Date d4 = new Date(30,3,1998);
            Date d1 = new Date(32,3,1998);
            Date d2 = new Date (1,2,3001);
            Date d3 = new Date (31,4,2017);
            Date d5 = new Date (30,4,2017);
        }
        catch(IllegalDateException exception){
            System.err.println(exception);
        }
    }
}
