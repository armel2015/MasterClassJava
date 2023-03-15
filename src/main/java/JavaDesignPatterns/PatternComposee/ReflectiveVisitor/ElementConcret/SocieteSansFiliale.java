package JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret;

import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.Element.Societe;

public class SocieteSansFiliale extends Societe {

    public SocieteSansFiliale(String nom, String email, String adresse) {
        super(nom, email, adresse);
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }
}
