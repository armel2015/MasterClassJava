package JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Scooter à essence de modele : "+ modele + " \n de couleur : " + couleur + "\n de puissance : " +
                puissance);
    }
}
