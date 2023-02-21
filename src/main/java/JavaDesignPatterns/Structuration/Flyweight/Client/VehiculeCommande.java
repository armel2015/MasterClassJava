package JavaDesignPatterns.Structuration.Flyweight.Client;

import JavaDesignPatterns.Structuration.Flyweight.FabriqueFlyweight.FabriqueOption;
import JavaDesignPatterns.Structuration.Flyweight.Flyweight.OptionVehicule;

import java.util.ArrayList;
import java.util.List;

public class VehiculeCommande {

    protected List<OptionVehicule> options = new ArrayList<OptionVehicule>();
    protected List<Integer> prixDeVenteOptions = new ArrayList<Integer>();

    public void ajouteOptions(String nom, int prixDeVente, FabriqueOption fabriqueOption){
        options.add(fabriqueOption.getOption(nom));
        prixDeVenteOptions.add(prixDeVente);
    }

    public void afficheOptions(){
        int index, taille;
        taille = options.size();
        for(index = 0; index < taille; index++){
            options.get(index).affiche(prixDeVenteOptions.get(index));
            System.out.println();
        }
    }
}
