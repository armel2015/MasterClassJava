package JavaDesignPatterns.Contruction.AbstractFactory.FabriqueConcrete;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;
import JavaDesignPatterns.Contruction.AbstractFactory.FabriqueAbstraite.FabriqueVehicule;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete.AutomobileEssence;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete.ScooterEssence;

public class FabriqueVehiculeEssenceImpl implements FabriqueVehicule {

    @Override
    public Automobile creeAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileEssence(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creeScooter(String modele, String couleur, int puissance) {
        return new ScooterEssence(modele, couleur, puissance);
    }
}
