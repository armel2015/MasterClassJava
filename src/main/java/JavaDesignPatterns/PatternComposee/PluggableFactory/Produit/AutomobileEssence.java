package JavaDesignPatterns.PatternComposee.PluggableFactory.Produit;

import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Automobile;

public class AutomobileEssence extends Automobile {
    @Override
    public void afficheCaracteristique() {
        System.out.println("Automobile à essence de modele : " + modele + "de couleur :" + couleur + "de puissance :" + puissance + " d'espace :" + espace);
    }
}
