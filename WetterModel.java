
package a07;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 23.05.2017.
 */

public class WetterModel {

    private List<String> list;
    private WetterAnsicht empfaenger ;
    private PropertyChangeSupport support ;

    public WetterModel(WetterAnsicht ansicht){
        this.list = new ArrayList<String>();
        this.empfaenger= ansicht;
        this.support= new PropertyChangeSupport(this);
        list.add("SONNIG");
        support.addPropertyChangeListener(empfaenger);
    }

    public String getWetterZustand() {
        return list.get(list.size() - 1);
    }

    public List<String> getWetterListe(){
            return list;
    }

    public void setWetter(String wetterZustand){
        support.firePropertyChange("Wetterzustand",getWetterZustand(),wetterZustand);
        list.add(wetterZustand);
    }
}