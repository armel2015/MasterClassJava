package JavaDesignPatterns.Comportement.ChainOfResponsability.Gestionnaire;

public abstract class ObjetBase {

    protected ObjetBase suivant;

    private String descriptionParDefaut(){
        return "description par defaut";
    }

    protected abstract String getDescription();

    public String donneDescription(){
        String resultat;
        resultat = this.getDescription();
        if(resultat != null){
            return resultat;
        }
        if(suivant != null){
            return suivant.donneDescription();
        }else {
            return this.descriptionParDefaut();
        }
    }

    public void setSuivant(ObjetBase suivant){
        this.suivant = suivant;
    }
}
