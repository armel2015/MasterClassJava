package JavaDesignPatterns.PatternComposee.MultiCastPattern.ExpediteurAbstrait;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.MessageAbstrait.MessageAbstrait;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait.RecepteurAbstrait;

import java.util.ArrayList;
import java.util.List;

public class ExpediteurAbstrait<TMessage extends MessageAbstrait, TRecepteur extends RecepteurAbstrait<TMessage>> {

    protected List<TRecepteur> registre = new ArrayList<TRecepteur>();

    public void ajoute(TRecepteur recepteur){
        registre.add(recepteur);
    }

    public void envoieMultiple(TMessage  message){
        for(TRecepteur recepteur : registre){
            recepteur.recoit(message);
        }
    }
}
