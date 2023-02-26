package JavaDesignPatterns.Comportement.Iterator.ElementConcret;

import JavaDesignPatterns.Comportement.Iterator.Element.Element;

public class Vehicule extends Element {

    public Vehicule(String description) {
        super(description);
    }

    public void affiche(){
        System.out.println("Description du vehicule : " +description);
    }
}
