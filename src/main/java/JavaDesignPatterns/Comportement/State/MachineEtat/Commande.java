package JavaDesignPatterns.Comportement.State.MachineEtat;

import JavaDesignPatterns.Comportement.State.Etat.EtatCommande;
import JavaDesignPatterns.Comportement.State.EtatConcret.CommandeEnCours;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    protected List<Produit>  produits = new ArrayList<Produit>();
    protected EtatCommande etatCommande;

    public Commande() {
        this.etatCommande = new CommandeEnCours(this);
    }

    public void ajouteProduit(Produit produit){
        etatCommande.ajouteProduit(produit);
    }

    public void retireProduit(Produit produit){
        etatCommande.retireProduit(produit);
    }

    public void efface(){
        etatCommande.efface();
    }

    public void etatSuivant(){
        etatCommande = etatCommande.etatSuivant();
    }

    public List<Produit> getProduits(){
        return produits;
    }

    public void affiche(){
        System.out.println("Contenu de la commande");
        for (Produit produit: produits){
            produit.affiche();
        }
        System.out.println();
    }
}
