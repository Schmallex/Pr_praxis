package a05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WetterPrinter implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		Date time =cal.getTime();
		System.out.printf("%-20s %7tT : %-10s%n","Wetternachricht um",time,e.getActionCommand());
	}
}
