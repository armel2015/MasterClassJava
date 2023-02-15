package JavaDesignPatterns.Structuration.Decorator.Decorateur;

import JavaDesignPatterns.Structuration.Decorator.ComposantAbstrait.ComposantGraphiqueVehicule;

public class Decorateur implements ComposantGraphiqueVehicule {

    protected ComposantGraphiqueVehicule composant;

    public Decorateur(ComposantGraphiqueVehicule composant) {
        this.composant = composant;
    }

    @Override
    public void affiche() {
        composant.affiche();
    }
}
