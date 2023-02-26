package JavaDesignPatterns.Comportement.Mediator.Element;

import JavaDesignPatterns.Comportement.Mediator.MediateurConcret.Formulaire;

public abstract class Controle {

    protected String valeur = "";
    protected Formulaire directeur;
    protected String nom;

    public Controle(String nom) {
        setNom(nom);
    }

    public abstract void saisie();

    protected void modifie(){
        getDirecteur().controleModifie(this);
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void setDirecteur(Formulaire directeur) {
        this.directeur = directeur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getValeur() {
        return valeur;
    }

    public Formulaire getDirecteur() {
        return directeur;
    }

    public String getNom() {
        return nom;
    }
}
