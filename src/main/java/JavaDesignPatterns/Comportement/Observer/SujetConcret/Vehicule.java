package JavaDesignPatterns.Comportement.Observer.SujetConcret;

import JavaDesignPatterns.Comportement.Observer.Sujet.Sujet;

public class Vehicule  extends Sujet {

    protected String description;
    protected Double prix;

    public String getDescription() {
        return description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setDescription(String description) {
        this.description = description;
        this.notifie();
    }

    public void setPrix(Double prix) {
        this.prix = prix;
        this.notifie();
    }
}
