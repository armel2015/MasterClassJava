package JavaDesignPatterns.Comportement.Memento;

import JavaDesignPatterns.Comportement.Memento.Memento.Memento;
import JavaDesignPatterns.Comportement.Memento.ObjetOrigine.ChariotOption;
import JavaDesignPatterns.Comportement.Memento.ObjetOrigine.OptionVehicule;

public class Utilisateur {

    public static void main(String[] args) {
        Memento memento;

        OptionVehicule option1 = new OptionVehicule("Sièges en cuir");
        OptionVehicule option2 = new OptionVehicule("Accoudoirs");
        OptionVehicule option3 = new OptionVehicule("Sièges sportifs");

        option1.ajouteOptionIncompatible(option3);
        option2.ajouteOptionIncompatible(option3);

        ChariotOption chariotOption = new ChariotOption();
        chariotOption.ajouteOption(option1);
        chariotOption.ajouteOption(option2);
        chariotOption.affiche();

        memento = chariotOption.ajouteOption(option3);
        chariotOption.affiche();
        chariotOption.annule(memento);
        chariotOption.affiche();
    }
}
