package a10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;

public class ActionPrinter implements ActionListener, PropertyChangeListener {
    public void actionPerformed(ActionEvent e) {
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        System.out.printf("%-30s %7tT : %-10s%n", "ActionEvent um ", time, e.getActionCommand());
    }

    public void propertyChange(PropertyChangeEvent evt) {
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        System.out.printf("%-30s %7tT : %-10s %s %-10s%n", "PropertyChangeEvent um ", time, evt.getPropertyName(), "Ändere alten Value zu ", evt.getNewValue());
    }
}
