package JavaDesignPatterns.Comportement.Memento.GestionEtat;

import JavaDesignPatterns.Comportement.Memento.Memento.Memento;
import JavaDesignPatterns.Comportement.Memento.ObjetOrigine.OptionVehicule;

import java.util.ArrayList;
import java.util.List;

public class MementoImpl implements Memento {

    protected List<OptionVehicule> options = new ArrayList<OptionVehicule>();

    public void setEtat(List<OptionVehicule> options){
        this.options.clear();
        this.options.addAll(options);
    }

    public List<OptionVehicule> getEtat(){
        return options;
    }
}
