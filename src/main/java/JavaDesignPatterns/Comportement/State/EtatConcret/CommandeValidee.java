package JavaDesignPatterns.Comportement.State.EtatConcret;

import JavaDesignPatterns.Comportement.State.Etat.EtatCommande;
import JavaDesignPatterns.Comportement.State.MachineEtat.Commande;
import JavaDesignPatterns.Comportement.State.MachineEtat.Produit;

public class CommandeValidee extends EtatCommande {

    public CommandeValidee(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {}
    @Override
    public void retireProduit(Produit produit) {}

    @Override
    public void efface() {
        commande.getProduits().clear();
    }
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeLivree(commande);
    }
}
