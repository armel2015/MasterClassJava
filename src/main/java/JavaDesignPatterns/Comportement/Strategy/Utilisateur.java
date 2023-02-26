package JavaDesignPatterns.Comportement.Strategy;

import JavaDesignPatterns.Comportement.Strategy.Entite.VueCatalogue;
import JavaDesignPatterns.Comportement.Strategy.StrategieConcret.DessineTroisVehiculeLigne;
import JavaDesignPatterns.Comportement.Strategy.StrategieConcret.DessineUnVehiculeLigne;

public class Utilisateur {

    public static void main(String[] args) {
        VueCatalogue vueCatalogue = new VueCatalogue(new DessineTroisVehiculeLigne());
        vueCatalogue.dessine();

        VueCatalogue vueCatalogue2 = new VueCatalogue(new DessineUnVehiculeLigne());
        vueCatalogue2.dessine();
    }
}
