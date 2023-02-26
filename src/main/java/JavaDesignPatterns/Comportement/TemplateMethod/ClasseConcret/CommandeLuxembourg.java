package JavaDesignPatterns.Comportement.TemplateMethod.ClasseConcret;

import JavaDesignPatterns.Comportement.TemplateMethod.ClasseAbstraite.Commande;

public class CommandeLuxembourg extends Commande {

    @Override
    protected void calculeTva() {
        montantTva = montantHt * 0.15;
    }
}
