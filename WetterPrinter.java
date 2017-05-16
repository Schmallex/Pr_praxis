package a05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WetterPrinter implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.printf("%-20s %20d %s %-10s%n","Wetternachricht um",e.getWhen()/1000000,"[ms]:",e.getActionCommand());
	}
	
	
}
