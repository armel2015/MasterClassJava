package JavaDesignPatterns.Comportement.Mediator.ElementConcret;

import JavaDesignPatterns.Comportement.Mediator.Element.Controle;

import java.util.Scanner;

public class ZoneSaisie  extends Controle {

    public ZoneSaisie(String nom) {
        super(nom);
    }

    Scanner reader  = new Scanner(System.in);
    @Override
    public void saisie() {
        System.out.println("Saisie de :" +nom);
        setValeur(reader.nextLine());
        this.modifie();
    }
}
