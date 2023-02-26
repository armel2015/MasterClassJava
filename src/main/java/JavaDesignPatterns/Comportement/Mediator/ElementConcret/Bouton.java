package JavaDesignPatterns.Comportement.Mediator.ElementConcret;

import JavaDesignPatterns.Comportement.Mediator.Element.Controle;

import java.util.Scanner;

public class Bouton  extends Controle {

    Scanner reader = new Scanner(System.in);

    public Bouton(String nom) {
        super(nom);
    }

    @Override
    public void saisie() {
        System.out.println("Désirez-vous activer le bouton " + nom + " ?");
        String response = reader.nextLine();
        if(response.equals("oui"))
            this.modifie();
    }
}
