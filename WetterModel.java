package a06;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 23.05.2017.
 */
public class WetterModel {
    List<String> list;
    WetterAnsicht w ;
    PropertyChangeSupport support ;

    public WetterModel(){
        this.list = new ArrayList<String>();
        this.w= new WetterAnsicht();
        this.support= new PropertyChangeSupport(this);
        list.add("SONNIG");
        support.addPropertyChangeListener(w);


    }

    public String getWetterZustand(){
        return list.get(list.size()-1);
    public List<String> getWetterListe(){
            return list;
        }


    }
    public void setWetter(String wetterZustand){
        list.add(wetterZustand);
        support.firePropertyChange(new PropertyChangeEvent(this,wetterZustand,getWetterZustand(),list.size()-2));
    }
}
