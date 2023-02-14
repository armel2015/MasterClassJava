package JavaDesignPatterns.Structuration.Bridge.ClasseAbstraite;

import JavaDesignPatterns.Structuration.Bridge.Implantation.FormulaireImpl;

public abstract class FormulaireImmatriculation {

    protected String contenu;
    protected FormulaireImpl implantation;

    public FormulaireImmatriculation (FormulaireImpl formulaire){
        this.implantation = formulaire;
    }

    public void affiche(){
        implantation.dessineTexte("numéro de la plaque existante : ");
    }

    public void genereDocument(){
        implantation.dessineTexte("Demande d'immatriculation");
        implantation.dessineTexte("numéro de plaque : " + contenu);
    }

    public boolean gereSaisie(){
        contenu = implantation.gereZoneSaisie();
        return this.controleSaisie(contenu);
    }

    protected abstract boolean controleSaisie(String plaque);
}
