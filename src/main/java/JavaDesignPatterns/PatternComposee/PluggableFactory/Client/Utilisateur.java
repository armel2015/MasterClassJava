package JavaDesignPatterns.PatternComposee.PluggableFactory.Client;

import JavaDesignPatterns.PatternComposee.PluggableFactory.FabriqueProduit.FabriqueVehicule;
import JavaDesignPatterns.PatternComposee.PluggableFactory.Produit.AutomobileElectricite;
import JavaDesignPatterns.PatternComposee.PluggableFactory.Produit.ScooterEssence;
import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Scooter;

public class Utilisateur {

    public static void main(String[] args) {
        Automobile protoAutomobileStandardBleu = new AutomobileElectricite();
        protoAutomobileStandardBleu.setCouleur("bleu");
        protoAutomobileStandardBleu.setModele("standard");

        Scooter protoScooterClassicRouge = new ScooterEssence();
        protoScooterClassicRouge.setModele("classic");
        protoScooterClassicRouge.setCouleur("rouge");

        FabriqueVehicule fabrique = new FabriqueVehicule();
        fabrique.setPrototypeAutomobile(protoAutomobileStandardBleu);
        fabrique.setPrototypeScooter(protoScooterClassicRouge);

        Automobile auto = fabrique.creeAutomobile();
        auto.afficheCaracteristique();

        Scooter scooter = fabrique.creeScooter();
        scooter.afficheCaracteristiques();
    }
}
