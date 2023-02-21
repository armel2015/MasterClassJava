package JavaDesignPatterns.Structuration.Flyweight.FabriqueFlyweight;

import JavaDesignPatterns.Structuration.Flyweight.Flyweight.OptionVehicule;

import javax.management.openmbean.OpenDataException;
import java.util.Map;
import java.util.TreeMap;

public class FabriqueOption {
    protected Map<String, OptionVehicule> options = new TreeMap<String, OptionVehicule>();

    public OptionVehicule getOption(String nom){
        OptionVehicule resultat;

        if(options.containsKey(nom)){
            return options.get(nom);
        }else {
            resultat = new OptionVehicule(nom);
            options.put(nom, resultat);
        }
        return resultat;
    }
}
