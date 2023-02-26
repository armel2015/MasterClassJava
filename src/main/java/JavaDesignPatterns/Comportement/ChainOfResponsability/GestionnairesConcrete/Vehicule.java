package JavaDesignPatterns.Comportement.ChainOfResponsability.GestionnairesConcrete;

import JavaDesignPatterns.Comportement.ChainOfResponsability.Gestionnaire.ObjetBase;

public class Vehicule extends ObjetBase {

    protected String description;

    public Vehicule(String description) {
        this.description = description;
    }

    @Override
    protected String getDescription() {
        return description;
    }
}
