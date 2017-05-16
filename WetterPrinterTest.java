package a05;

import schimkat.berlin.lernhilfe2015ss.event.Timer;

public class WetterPrinterTest {
	public static void main(String[] args) {
		while(true){
			Wetterzustand w = new Wetterzustand();
			WetterPrinter print = new WetterPrinter();
			WetterPrinter printe = new WetterPrinter();
			
			Timer sonne = new Timer(1);
			sonne.addActionListener(printe);
			sonne.setActionCommand(w.sonne);
			
			Timer gewitter = new Timer(18);
			gewitter.addActionListener(print);
			gewitter.setDelay(20000);
			gewitter.setActionCommand(w.gewitter);
			
			Timer bedeckt = new Timer(10);
			bedeckt.addActionListener(print);
			bedeckt.setDelay(250000);
			bedeckt.setActionCommand(w.bedeckt);
			
			Timer regen = new Timer(14);
			regen.addActionListener(print);
			regen.setDelay(300000);
			regen.setActionCommand(w.regen);
			
			Timer wolkig = new Timer(25);
			wolkig.addActionListener(print);
			wolkig.setDelay(350000);
			wolkig.setActionCommand(w.wolkig);
			
			sonne.start();
			sonne.setDelay(1500);
			gewitter.start();
			bedeckt.start();
			regen.start();
			wolkig.start();
			
		}
	
	}

}
