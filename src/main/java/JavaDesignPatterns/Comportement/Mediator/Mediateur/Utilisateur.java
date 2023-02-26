package JavaDesignPatterns.Comportement.Mediator.Mediateur;

import JavaDesignPatterns.Comportement.Mediator.ElementConcret.Bouton;
import JavaDesignPatterns.Comportement.Mediator.ElementConcret.PopupMenu;
import JavaDesignPatterns.Comportement.Mediator.ElementConcret.ZoneSaisie;
import JavaDesignPatterns.Comportement.Mediator.MediateurConcret.Formulaire;

public class Utilisateur {

    public static void main(String[] args) {
        Formulaire formulaire = new Formulaire();

        formulaire.ajouteControle(new ZoneSaisie("Nom"));
        formulaire.ajouteControle(new ZoneSaisie("Prenom"));

        PopupMenu menu = new PopupMenu("Coemprunteur");

        menu.ajouteOption("sans coemprunteur");
        menu.ajouteOption("avec coemprunteur");

        formulaire.ajouteControle(menu);
        formulaire.setMenuCoemprunteur(menu);

        Bouton bouton = new Bouton("OK");
        formulaire.ajouteControle(bouton);
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Nom du coemprunteur"));
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Prenom du coemprunteur"));

        formulaire.saisie();
    }
}
