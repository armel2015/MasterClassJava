package JavaDesignPatterns.Contruction.FactoryMethod.ProduitConcret;

import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;

public class CommandeAuComptant extends Commande {

    public CommandeAuComptant(double montant) {
        super(montant);
    }

    @Override
    public boolean valide() {
        return true;
    }

    @Override
    public void paye() {
        System.out.println("Le paiement de la commande au comptant de : "+ montant+" est effectué");
    }
}
