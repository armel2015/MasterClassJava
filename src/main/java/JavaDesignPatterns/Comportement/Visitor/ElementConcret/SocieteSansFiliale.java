package JavaDesignPatterns.Comportement.Visitor.ElementConcret;

import JavaDesignPatterns.Comportement.Visitor.Element.Societe;
import JavaDesignPatterns.Comportement.Visitor.Visiteur.Visiteur;

public class SocieteSansFiliale extends Societe {
    public SocieteSansFiliale(String nom, String email, String adresse) {
        super(nom, email, adresse);
    }


    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }

    @Override
    public void accepteVisiteur(Visiteur visiteur) {
        visiteur.visite(this);
    }
}
