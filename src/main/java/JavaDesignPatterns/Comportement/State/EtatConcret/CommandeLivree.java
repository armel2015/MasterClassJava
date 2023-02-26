package JavaDesignPatterns.Comportement.State.EtatConcret;

import JavaDesignPatterns.Comportement.State.Etat.EtatCommande;
import JavaDesignPatterns.Comportement.State.MachineEtat.Commande;
import JavaDesignPatterns.Comportement.State.MachineEtat.Produit;

public class CommandeLivree extends EtatCommande {

    public CommandeLivree(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {}

    @Override
    public void efface() {}

    @Override
    public void retireProduit(Produit produit) {}

    @Override
    public EtatCommande etatSuivant() {
        return this;
    }
}
