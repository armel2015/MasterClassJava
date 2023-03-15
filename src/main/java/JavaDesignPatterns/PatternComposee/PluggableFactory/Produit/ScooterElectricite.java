package JavaDesignPatterns.PatternComposee.PluggableFactory.Produit;

import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Scooter;

public class ScooterElectricite extends Scooter {
    @Override
    public void afficheCaracteristiques() {
        System.out.println("Scooter electrique de modele : " + modele + "de couleur :" + couleur + "de puissance :" + puissance);
    }
}
