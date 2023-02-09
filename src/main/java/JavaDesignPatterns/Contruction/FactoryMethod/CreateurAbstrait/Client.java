package JavaDesignPatterns.Contruction.FactoryMethod.CreateurAbstrait;

import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    protected List<Commande> commandes = new ArrayList<Commande>();
    protected abstract Commande creeCommande(double montant);

    public void nouvelleCommande(double montant){
        Commande commande = this.creeCommande(montant);
        if(commande.valide()){
            commande.paye();
            commandes.add(commande);
        }else {
            System.out.println("Désolé votre command n'est pas valide");
        }
    }

    public List<Commande> getCommandes() {
        return new ArrayList<>(commandes);
    }
}
