package JavaDesignPatterns.PatternComposee.MultiCastPattern.Expediteur;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.Message.MessageGeneral;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait.Employe;


import java.util.ArrayList;
import java.util.List;

public class DirectionGenerale {

    protected ExpediteurGeneral expediteurGeneral = new ExpediteurGeneral();

    public void envoieMessage(){
        List<String> contenu  = new ArrayList<String>();
        contenu.add("Informations générales");
        contenu.add("Informations spécifiques");

        MessageGeneral message = new MessageGeneral(contenu);
        expediteurGeneral.envoieMultiple(message);
    }

    public void ajouteRecepteurGeneral(Employe recepteur){
        expediteurGeneral.ajoute(recepteur);
    }
}
