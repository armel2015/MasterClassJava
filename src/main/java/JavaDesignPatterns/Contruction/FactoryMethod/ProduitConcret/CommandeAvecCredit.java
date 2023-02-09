package JavaDesignPatterns.Contruction.FactoryMethod.ProduitConcret;

import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;

public class CommandeAvecCredit extends Commande {

    public CommandeAvecCredit(double montant) {
        super(montant);
    }

    @Override
    public boolean valide() {
        return ((montant >= 1000.00) && (montant <= 5000.00));
    }

    @Override
    public void paye() {
        System.out.println("Le paiement de la commande au credit de : "+ montant + "est effectué.");
    }
}
