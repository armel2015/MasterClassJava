package JavaDesignPatterns.Structuration.Decorator.DecorateurConcret;

import JavaDesignPatterns.Structuration.Decorator.ComposantAbstrait.ComposantGraphiqueVehicule;
import JavaDesignPatterns.Structuration.Decorator.Decorateur.Decorateur;

public class ModeleDecorateur extends Decorateur {

    public ModeleDecorateur(ComposantGraphiqueVehicule composant) {
        super(composant);
    }

    protected void afficheInfosTechnique(){
        System.out.println("Informations techniques du modèle");
    }

    public void affiche(){
        super.affiche();
        this.afficheInfosTechnique();
    }
}
