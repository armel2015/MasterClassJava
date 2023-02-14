package JavaDesignPatterns.Structuration.Bridge.ConcreteImplantation;

import JavaDesignPatterns.Structuration.Bridge.Implantation.FormulaireImpl;

import java.util.Scanner;

public class FormAppletImpl implements FormulaireImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dessineTexte(String texte) {
        System.out.println("Applet :" + texte);
    }

    @Override
    public String gereZoneSaisie() {
        return reader.next();
    }
}
