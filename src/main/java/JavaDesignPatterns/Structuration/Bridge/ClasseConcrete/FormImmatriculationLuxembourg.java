package JavaDesignPatterns.Structuration.Bridge.ClasseConcrete;

import JavaDesignPatterns.Structuration.Bridge.ClasseAbstraite.FormulaireImmatriculation;
import JavaDesignPatterns.Structuration.Bridge.Implantation.FormulaireImpl;

public class FormImmatriculationLuxembourg extends FormulaireImmatriculation {

    public FormImmatriculationLuxembourg(FormulaireImpl formulaire) {
        super(formulaire);
    }

    @Override
    protected boolean controleSaisie(String plaque) {
        return plaque.length() == 5;
    }
}
