package JavaDesignPatterns.Comportement.State.Etat;

import JavaDesignPatterns.Comportement.State.MachineEtat.Commande;
import JavaDesignPatterns.Comportement.State.MachineEtat.Produit;

public abstract class EtatCommande {

    protected Commande commande;

    public EtatCommande(Commande commande) {
        this.commande = commande;
    }

    public abstract void ajouteProduit(Produit produit);

    public abstract void efface();

    public abstract void retireProduit(Produit produit);

    public abstract EtatCommande etatSuivant();
}
