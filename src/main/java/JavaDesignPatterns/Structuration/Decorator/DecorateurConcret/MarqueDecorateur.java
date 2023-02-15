package JavaDesignPatterns.Structuration.Decorator.DecorateurConcret;

import JavaDesignPatterns.Structuration.Decorator.ComposantAbstrait.ComposantGraphiqueVehicule;
import JavaDesignPatterns.Structuration.Decorator.Decorateur.Decorateur;

public class MarqueDecorateur extends Decorateur {
    public MarqueDecorateur(ComposantGraphiqueVehicule composant) {
        super(composant);
    }

    protected void afficheLogo(){
        System.out.println("Logo de la marque");
    }

    public void affiche(){
        super.affiche();
        this.afficheLogo();
    }
}
