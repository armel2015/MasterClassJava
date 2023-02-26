package JavaDesignPatterns.Comportement.ChainOfResponsability.GestionnairesConcrete;

import JavaDesignPatterns.Comportement.ChainOfResponsability.Gestionnaire.ObjetBase;

public class Modele extends ObjetBase {

    protected String description;
    protected String nom;

    public Modele(String description, String nom) {
        this.description = description;
        this.nom = nom;
    }

    @Override
    protected String getDescription() {
        if(description != null){
            return "Modèle " + nom + " : " + description;
        }else {
            return null;
        }
    }
}
