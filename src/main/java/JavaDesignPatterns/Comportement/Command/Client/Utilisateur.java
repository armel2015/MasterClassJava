package JavaDesignPatterns.Comportement.Command.Client;

import JavaDesignPatterns.Comportement.Command.Appelant.Catalogue;
import JavaDesignPatterns.Comportement.Command.CommandeConcrete.CommandeSolder;
import JavaDesignPatterns.Comportement.Command.Recepteur.Vehicule;

public class Utilisateur {

    public static void main(String[] args) {
        Vehicule vehicule1 = new Vehicule("A01", 1, 1000.0);
        Vehicule vehicule2 = new Vehicule("A11", 6, 2000.0);
        Vehicule vehicule3 = new Vehicule("Z03", 2, 3000.0);

        Catalogue catalogue = new Catalogue();
        catalogue.ajoute(vehicule1);
        catalogue.ajoute(vehicule2);
        catalogue.ajoute(vehicule3);
        System.out.println("Affichage du catalogue initial");
        catalogue.affiche();

        CommandeSolder commandeSolder =  new CommandeSolder(10, 5, 0.1);
        catalogue.lanceCommandeSolder(commandeSolder);
        System.out.println("Affichage du catalogue après exécution de la premiere commande de solde");
        catalogue.affiche();

        System.out.println();
        commandeSolder = new CommandeSolder(10, 5, 0.5);
        catalogue.lanceCommandeSolder(commandeSolder);
        System.out.println("Affichage du catalogue après exécution de la deuxième commande de solde");
        catalogue.affiche();
        System.out.println();

        catalogue.annuleCommandeSolder(1);
        System.out.println("Affichage du catalogue après annulation de la premiere commande de solde");
        catalogue.affiche();
        System.out.println();

        catalogue.retablitCommandeSolder(1);
        System.out.println("Affichage du catalogue après retablissement de la premiere commande de solde");
        catalogue.affiche();
        System.out.println();
    }
}
