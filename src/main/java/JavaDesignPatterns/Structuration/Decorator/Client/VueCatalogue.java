package JavaDesignPatterns.Structuration.Decorator.Client;

import JavaDesignPatterns.Structuration.Decorator.ComposantConcret.VueVehicule;
import JavaDesignPatterns.Structuration.Decorator.DecorateurConcret.MarqueDecorateur;
import JavaDesignPatterns.Structuration.Decorator.DecorateurConcret.ModeleDecorateur;

public class VueCatalogue {

    public static void main(String[] args) {
        VueVehicule vueVehicule = new VueVehicule();
        ModeleDecorateur modeleDecorateur = new ModeleDecorateur(vueVehicule);
        MarqueDecorateur marqueDecorateur = new MarqueDecorateur(modeleDecorateur);

        marqueDecorateur.affiche();
    }
}
