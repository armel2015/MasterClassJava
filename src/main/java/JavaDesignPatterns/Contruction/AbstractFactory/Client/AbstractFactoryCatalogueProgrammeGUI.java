package JavaDesignPatterns.Contruction.AbstractFactory.Client;

import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait.Scooter;
import JavaDesignPatterns.Contruction.AbstractFactory.FabriqueConcrete.FabriqueVehiculeElectriciteImpl;
import JavaDesignPatterns.Contruction.AbstractFactory.FabriqueConcrete.FabriqueVehiculeEssenceImpl;
import JavaDesignPatterns.Contruction.AbstractFactory.FabriqueAbstraite.FabriqueVehicule;

import java.util.Scanner;

public class AbstractFactoryCatalogueProgrammeGUI {

    public static int nbAutos = 3;
    public static int nbScooters = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FabriqueVehicule fabrique;

        Automobile[] automobiles = new Automobile[nbAutos];
        Scooter[] scooters = new Scooter[nbScooters];
        System.out.println("Voulez-vous utiliser des vehicules électriques (1) ou à essence (2) : ");
        String choix = scanner.next();
        if("1".equals(choix)){
            fabrique = new FabriqueVehiculeElectriciteImpl();
        }else {
            fabrique = new FabriqueVehiculeEssenceImpl();
        }
        for(int index = 0; index < nbAutos; index++){
            automobiles[index] = fabrique.creeAutomobile("Standard", "jaune", 6+index, 3.2);
        }
        for (int index = 0; index < nbScooters; index++){
            scooters[index] = fabrique.creeScooter("classic", "rouge", 2+index);
        }
        for (Automobile automobile: automobiles){
            automobile.afficheCaracteristiques();
        }
        for (Scooter scooter: scooters){
            scooter.afficheCaracteristiques();
        }
    }
}
