package a01;

public class Date extends Object {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws IllegalDateException {
            this.day = day;
            this.month = month;
            this.year = year;
            checkDate(day,month,year);
    }

    public String toString(){
        return String.format("%02d.%02d.%04d",day,month,year);
    }

    public boolean checkDate(int day,int month,int year) throws IllegalDateException {
        if (month < 1 || month > 12) {
            throw new IllegalDateException("for "+toString()+ " The month " + month + " is not in the valid range of 1-12");
        }
        if (month % 2 == 0) {
            if (!(day >= 1 && day <= 30)) {
                throw new IllegalDateException("for "+toString()+ " The day " + day + " is not in the valid range 1-30");
            }
        } else {
            if (!(day >= 1 && day <= 31)) {
                throw new IllegalDateException("for "+toString()+ " The day " + day + " is not in the valid range 1-31");
            }
        }
        if (year < 0 || year > 3000) {
            throw new IllegalDateException("for "+toString()+ " The Year " + year + " is not in the valid range 0-3000");
        }
        return true;
    }
}
