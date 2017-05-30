
package a07;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 23.05.2017.
 */

public class WetterModel {

    private List<String> list;
    private PropertyChangeSupport support ;

    public WetterModel(){
        this.list = new ArrayList<String>();
        this.support= new PropertyChangeSupport(this);
        list.add(WetterZustand.SONNIG.name());
    }

    public void addListener (WetterAnsicht ansicht){
        support.addPropertyChangeListener(ansicht);
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