package JavaDesignPatterns.PatternComposee.ReflectiveVisitor;

import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.Element.Societe;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteMere;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.ElementConcret.SocieteSansFiliale;
import JavaDesignPatterns.PatternComposee.ReflectiveVisitor.VisiteurElement.VisiteurMaillingCommercial;

public class Utilisateur {

    public static void main(String[] args) {
        Societe societe1 = new SocieteSansFiliale("société1", "info@societe1.com", "rue de la société1");
        Societe societe2 = new SocieteSansFiliale("societe2", "info@societe2.com", "rue de la societe2");

        Societe groupe1 = new SocieteMere("groupe1", "info@groupe1.com", "rue du groupe1");
        groupe1.ajouteFiliale(societe1);
        groupe1.ajouteFiliale(societe2);

        Societe societe3 = new SocieteSansFiliale("societe3", "info@societe3.com", "rue de la societe3");
        Societe groupe2 = new SocieteMere("groupe2", "info@groupe2.com", "rue du groupe2");
        groupe2.ajouteFiliale(groupe1);
        groupe2.ajouteFiliale(societe3);

        new VisiteurMaillingCommercial().demarreVisite(groupe2);
    }
}
