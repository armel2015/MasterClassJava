package JavaDesignPatterns.PatternComposee.MultiCastPattern;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.Expediteur.DirectionCommerciale;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.Expediteur.DirectionGenerale;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.Recepteur.Administratif;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.Recepteur.Commercial;

public class Utilisateur {

    public static void main(String[] args) {
        DirectionGenerale directionGenerale = new DirectionGenerale();

        DirectionCommerciale directionCommerciale = new DirectionCommerciale();

        Commercial commercial1 = new Commercial("Paul");
        Commercial commercial2 = new Commercial("Henri");

        Administratif administratif = new Administratif("Jeremy");

        directionGenerale.ajouteRecepteurGeneral(commercial1);
        directionGenerale.ajouteRecepteurGeneral(commercial2);
        directionGenerale.ajouteRecepteurGeneral(administratif);

        directionGenerale.envoieMessage();

        directionCommerciale.ajoutRecepteurCommercial(commercial1.getRecepteurCommercial());
        directionCommerciale.ajoutRecepteurCommercial(commercial2.getRecepteurCommercial());

        directionCommerciale.envoieMessages();
    }
}
