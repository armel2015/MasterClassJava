package JavaDesignPatterns.Structuration.Bridge.Client;

import JavaDesignPatterns.Structuration.Bridge.ClasseConcrete.FormImmatriculationFrance;
import JavaDesignPatterns.Structuration.Bridge.ClasseConcrete.FormImmatriculationLuxembourg;
import JavaDesignPatterns.Structuration.Bridge.ConcreteImplantation.FormAppletImpl;
import JavaDesignPatterns.Structuration.Bridge.ConcreteImplantation.FormHtmlImpl;

public class Utilisateur {

    public static void main(String[] args) {

        FormImmatriculationLuxembourg formulaire1 = new FormImmatriculationLuxembourg(new FormHtmlImpl());
        formulaire1.affiche();

        if(formulaire1.gereSaisie())
            formulaire1.genereDocument();

        System.out.println();

        FormImmatriculationFrance formulaire2 = new FormImmatriculationFrance(new FormAppletImpl());
        formulaire2.affiche();
        if(formulaire2.gereSaisie())
            formulaire2.genereDocument();
    }
}
