package JavaDesignPatterns.Comportement.ChainOfResponsability.Client;

import JavaDesignPatterns.Comportement.ChainOfResponsability.Gestionnaire.ObjetBase;
import JavaDesignPatterns.Comportement.ChainOfResponsability.GestionnairesConcrete.Marque;
import JavaDesignPatterns.Comportement.ChainOfResponsability.GestionnairesConcrete.Modele;
import JavaDesignPatterns.Comportement.ChainOfResponsability.GestionnairesConcrete.Vehicule;

public class Utilisateur {
    public static void main(String[] args) {
        ObjetBase vehicule1  = new Vehicule("Auto++ KT500 Véhicule d'occasion en bon état");
        System.out.println("******V1*******");
        System.out.println(vehicule1.donneDescription());


        ObjetBase modele1 = new Modele("KT400", "Le vehicule spacieux et confortable");
        ObjetBase  vehicule2 = new Vehicule(null);
        vehicule2.setSuivant(modele1);
        System.out.println("*******V2******");
        System.out.println(vehicule2.donneDescription());


        ObjetBase marque1 = new Marque("Auto++", "la marque des autos", "de grande qualité");
        ObjetBase modele2 = new Modele("KT700", null);
        modele2.setSuivant(marque1);
        ObjetBase vehicule3 =  new Vehicule(null);
        vehicule3.setSuivant(modele2);
        System.out.println("*******V3******");
        System.out.println(vehicule3.donneDescription());

        ObjetBase vehicule4 = new Vehicule(null);
        System.out.println("******V4*******");
        System.out.println(vehicule4.donneDescription());
    }
}
