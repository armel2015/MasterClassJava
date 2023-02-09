package JavaDesignPatterns.Contruction.FactoryMethod.CreateurConcret;

import JavaDesignPatterns.Contruction.FactoryMethod.CreateurAbstrait.Client;
import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;
import JavaDesignPatterns.Contruction.FactoryMethod.ProduitConcret.CommandeAvecCredit;

public class ClientPayantACredit extends Client {
    @Override
    protected Commande creeCommande(double montant) {
        return new CommandeAvecCredit(montant);
    }
}
