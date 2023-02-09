package JavaDesignPatterns.Contruction.FactoryMethod;

import JavaDesignPatterns.Contruction.FactoryMethod.CreateurAbstrait.Client;
import JavaDesignPatterns.Contruction.FactoryMethod.CreateurConcret.ClientPayantACredit;
import JavaDesignPatterns.Contruction.FactoryMethod.CreateurConcret.ClientPayantAuComptant;
import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;

public class FactoryMethodProgrammeGUI {

    public static void main(String[] args) {

        Client client;
        client = new ClientPayantAuComptant();
        client.nouvelleCommande(6000.00);
        client.nouvelleCommande(500.00);
        System.out.println("Commandes du client 1:");
        for (Commande commande: client.getCommandes()){
            System.out.println(commande.getMontant());
        }

        client = new ClientPayantACredit();
        client.nouvelleCommande(8000.00);
        client.nouvelleCommande(2000);
        client.nouvelleCommande(200);
        System.out.println("Commandes du client 2:");
        for (Commande commande: client.getCommandes()){
            System.out.println(commande.getMontant());
        }

    }
}
