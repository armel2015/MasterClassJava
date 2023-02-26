package JavaDesignPatterns.Comportement.Visitor.Visiteur;

import JavaDesignPatterns.Comportement.Visitor.ElementConcret.SocieteMere;
import JavaDesignPatterns.Comportement.Visitor.ElementConcret.SocieteSansFiliale;


public interface Visiteur {

    void visite(SocieteSansFiliale societe);
    void visite(SocieteMere societe);
}
