package JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Automobile;

public class AutomobileEssence extends Automobile {

    public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Automobile à essence de modele : "+ modele + " \n de couleur : " + couleur + "\n de puissance : " +
                puissance +  " \n d'espace : " + espace);
    }
}
