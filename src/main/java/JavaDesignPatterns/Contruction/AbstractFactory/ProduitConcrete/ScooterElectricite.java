package JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;

public class ScooterElectricite extends Scooter {

    public ScooterElectricite(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Scooter électrique de modele : "+ modele + " \n de couleur : " + couleur + "\n de puissance : " +
                puissance );
    }
}
