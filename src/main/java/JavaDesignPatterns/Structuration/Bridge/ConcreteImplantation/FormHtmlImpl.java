package JavaDesignPatterns.Structuration.Bridge.ConcreteImplantation;

import JavaDesignPatterns.Structuration.Bridge.Implantation.FormulaireImpl;

import java.util.Scanner;

public class FormHtmlImpl implements FormulaireImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dessineTexte(String texte) {
        System.out.println("HTML : " + texte);
    }

    @Override
    public String gereZoneSaisie() {
        return reader.next();
    }
}
