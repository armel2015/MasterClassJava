package JavaDesignPatterns.PatternComposee.PluggableFactory.Produit;

import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Scooter;

public class ScooterEssence extends Scooter {
    @Override
    public void afficheCaracteristiques() {
        System.out.println("Scooter essence de modele : " + modele + "de couleur :" + couleur + "de puissance :" + puissance);
    }
}
