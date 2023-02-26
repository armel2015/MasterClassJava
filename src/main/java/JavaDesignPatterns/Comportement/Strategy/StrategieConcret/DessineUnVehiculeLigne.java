package JavaDesignPatterns.Comportement.Strategy.StrategieConcret;

import JavaDesignPatterns.Comportement.Strategy.Entite.VueVehicule;
import JavaDesignPatterns.Comportement.Strategy.Strategie.DessinCatalogue;

import java.util.List;

public class DessineUnVehiculeLigne implements DessinCatalogue {


    @Override
    public void dessine(List<VueVehicule> contenu) {
        System.out.println("Dessine les véhicules avec un véhicule par ligne");
        for(VueVehicule vueVehicule: contenu){
            vueVehicule.dessine();
            System.out.println();
        }
        System.out.println();
    }
}
