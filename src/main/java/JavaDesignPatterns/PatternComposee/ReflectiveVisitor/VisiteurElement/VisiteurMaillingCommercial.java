package JavaDesignPatterns.PatternComposee.ReflectiveVisitor.VisiteurElement;

import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.Element.Societe;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteMere;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteSansFiliale;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.Visiteur.Visiteur;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.VisiteurConcret.VisiteurSociete;

public class VisiteurMaillingCommercial extends Visiteur implements VisiteurSociete {
    @Override
    public void visite(SocieteSansFiliale societe) {
        System.out.println("Envoi d'un email à " + societe.getNom() + " adresse " + societe.getEmail() + " Proposition commerciale pour votre société");
    }

    @Override
    public void visite(SocieteMere societe) {
        System.out.println("Envoi d'un email à " + societe.getNom() + " adresse " + societe.getEmail() + " Proposition commerciale pour votre groupe");
        System.out.println("Impression d'un courrier à " + societe.getNom() + " adresse " + societe.getAdresse() + " Proposition commerciale pour votre groupe");

        for (Societe filiale : societe.getFiliales())
            this.demarreVisite(filiale);
    }
}
