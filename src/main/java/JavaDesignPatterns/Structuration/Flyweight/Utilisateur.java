package JavaDesignPatterns.Structuration.Flyweight;

import JavaDesignPatterns.Structuration.Flyweight.Client.VehiculeCommande;
import JavaDesignPatterns.Structuration.Flyweight.FabriqueFlyweight.FabriqueOption;

public class Utilisateur {

    public static void main(String[] args) {
        FabriqueOption fabrique = new FabriqueOption();

        VehiculeCommande vehicule = new VehiculeCommande();
        vehicule.ajouteOptions("Air bag", 80, fabrique);
        vehicule.ajouteOptions("direction assistée", 90, fabrique);
        vehicule.ajouteOptions("vitres électriques", 85, fabrique);

        vehicule.afficheOptions();
    }
}
