package JavaDesignPatterns.Comportement.Command.Appelant;

import JavaDesignPatterns.Comportement.Command.CommandeConcrete.CommandeSolder;
import JavaDesignPatterns.Comportement.Command.Recepteur.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    protected List<Vehicule> vehiculesStock = new ArrayList<Vehicule>();
    protected List<CommandeSolder> commandes = new ArrayList<CommandeSolder>();

    public void lanceCommandeSolder(CommandeSolder commande){
        commandes.add(0, commande);
        commande.solde(vehiculesStock);
    }

    public void annuleCommandeSolder(int ordre){
        commandes.get(ordre).annule();
    }

    public void retablitCommandeSolder(int ordre){
        commandes.get(ordre).retablit();
    }

    public void ajoute(Vehicule vehicule){
        vehiculesStock.add(vehicule);
    }

    public void affiche(){
        for (Vehicule vehicule: vehiculesStock){
            vehicule.affiche();
        }
    }
}
