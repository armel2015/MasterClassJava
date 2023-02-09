package JavaDesignPatterns.Contruction.AbstractFactory.FabriqueConcrete;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;
import JavaDesignPatterns.Contruction.AbstractFactory.FabriqueAbstraite.FabriqueVehicule;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete.AutomobileElectricite;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitConcrete.ScooterElectricite;

public class FabriqueVehiculeElectriciteImpl implements FabriqueVehicule {

    @Override
    public Automobile creeAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileElectricite(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creeScooter(String modele, String couleur, int puissance) {
        return new ScooterElectricite(modele, couleur, puissance);
    }
}
