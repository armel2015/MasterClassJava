package JavaDesignPatterns.Structuration.Decorator.ComposantConcret;

import JavaDesignPatterns.Structuration.Decorator.ComposantAbstrait.ComposantGraphiqueVehicule;

public class VueVehicule implements ComposantGraphiqueVehicule {
    @Override
    public void affiche() {
        System.out.println("Affiche du véhicule");
    }
}
