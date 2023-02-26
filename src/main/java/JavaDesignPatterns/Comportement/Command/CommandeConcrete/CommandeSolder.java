package JavaDesignPatterns.Comportement.Command.CommandeConcrete;

import JavaDesignPatterns.Comportement.Command.Recepteur.Vehicule;
import JavaDesignPatterns.Contruction.FactoryMethod.Produit.Commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeSolder {

    protected List<Vehicule> vehiculesSoldes = new ArrayList<Vehicule>();
    protected long aujourdhui;
    protected long dureeStock;
    protected double tauxRemise;

    public CommandeSolder(long aujourdhui, long dureeStock, double tauxRemise) {
        this.aujourdhui = aujourdhui;
        this.dureeStock = dureeStock;
        this.tauxRemise = tauxRemise;
    }

    public void solde(List<Vehicule> vehicules){
        vehiculesSoldes.clear();
        for(Vehicule vehicule:vehicules){
            if(vehicule.getDureeStockage(aujourdhui) >= dureeStock){
                vehiculesSoldes.add(vehicule);
            }
        }
        for(Vehicule vehicule:vehiculesSoldes){
                vehicule.modifiePrix(1.0 -tauxRemise);
            }
    }

    public void annule(){
        for(Vehicule vehicule:vehiculesSoldes){
            vehicule.modifiePrix(1.0/ (1.0-tauxRemise));
        }
    }

    public void retablit(){
        for(Vehicule vehicule : vehiculesSoldes){
            vehicule.modifiePrix(1.0 - tauxRemise);
        }
    }
}
