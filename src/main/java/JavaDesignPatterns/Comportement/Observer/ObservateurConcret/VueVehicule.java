package JavaDesignPatterns.Comportement.Observer.ObservateurConcret;

import JavaDesignPatterns.Comportement.Observer.Observateur.Observateur;
import JavaDesignPatterns.Comportement.Observer.SujetConcret.Vehicule;

public class VueVehicule implements Observateur {

    protected Vehicule vehicule;
    protected String texte = "";

    public VueVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
        vehicule.ajoute(this);
        metAjourTexte();
    }

    public void metAjourTexte(){
        texte = "Description " + vehicule.getDescription() +"Prix " + vehicule.getPrix();
    }
    @Override
    public void actualise() {
        metAjourTexte();
        this.redessine();
    }

    public void redessine(){
        System.out.println(texte);
    }
}
