package JavaDesignPatterns.Contruction.FactoryMethod.CreateurConcret;

import JavaDesignPatterns.Contruction.FactoryMethod.CreateurAbstrait.Client;
import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;
import JavaDesignPatterns.Contruction.FactoryMethod.ProduitConcret.CommandeAuComptant;

public class ClientPayantAuComptant extends Client {

    @Override
    protected Commande creeCommande(double montant) {
        return new CommandeAuComptant(montant);
    }
}
