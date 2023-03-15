package JavaDesignPatterns.PatternComposee.ReflectiveVisitor.VisiteurConcret;

import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteMere;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteSansFiliale;

public interface VisiteurSociete {
    void visite(SocieteSansFiliale societe);
    void visite(SocieteMere societe);
}
