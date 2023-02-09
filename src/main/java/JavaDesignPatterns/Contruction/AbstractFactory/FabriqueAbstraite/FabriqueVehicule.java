package JavaDesignPatterns.Contruction.AbstractFactory.FabriqueAbstraite;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;

public interface FabriqueVehicule {

    Automobile creeAutomobile(String modele, String couleur, int puissance, double espace);

    Scooter creeScooter(String modele, String couleur, int puissance);

}
