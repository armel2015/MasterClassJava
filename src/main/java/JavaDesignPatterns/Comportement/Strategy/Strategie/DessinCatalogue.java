package JavaDesignPatterns.Comportement.Strategy.Strategie;

import JavaDesignPatterns.Comportement.Strategy.Entite.VueVehicule;

import java.util.List;

public interface DessinCatalogue {

    void dessine(List<VueVehicule> contenu);
}
