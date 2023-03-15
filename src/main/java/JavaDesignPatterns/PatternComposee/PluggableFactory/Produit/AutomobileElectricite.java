package JavaDesignPatterns.PatternComposee.PluggableFactory.Produit;

import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Automobile;

public class AutomobileElectricite extends Automobile {
    @Override
    public void afficheCaracteristique() {
        System.out.println("Automobile électricite de modèle : " + modele + "de couleur :" + couleur + "de puissance :" + puissance + " d'espace :" + espace);
    }
}
