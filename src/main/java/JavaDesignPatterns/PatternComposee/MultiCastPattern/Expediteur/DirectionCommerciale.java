package JavaDesignPatterns.PatternComposee.MultiCastPattern.Expediteur;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.Message.MessageCommercial;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait.RecepteurCommercial;

public class DirectionCommerciale {

    protected ExpediteurCommercial expediteurCommercial = new ExpediteurCommercial();

    public void envoieMessages(){
        MessageCommercial message = new MessageCommercial("Annonce nouvelle Gamme de produit!");
        expediteurCommercial.envoieMultiple(message);

        message = new MessageCommercial("Annonce suppression modèle");
        expediteurCommercial.envoieMultiple(message);
    }

    public void ajoutRecepteurCommercial(RecepteurCommercial recepteur){
        expediteurCommercial.ajoute(recepteur);
    }
}
