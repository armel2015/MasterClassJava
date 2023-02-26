package JavaDesignPatterns.Comportement.Iterator.Collection;

import JavaDesignPatterns.Comportement.Iterator.Element.Element;
import JavaDesignPatterns.Comportement.Iterator.Iterateur.Iterateur;

import java.util.ArrayList;
import java.util.List;

public abstract class Catalogue<TElement extends Element, TIterateur extends Iterateur<TElement>> {

    protected List<TElement> contenu = new ArrayList<TElement>();

    protected abstract TIterateur creeIterateur();

    public TIterateur recherche(String motCleRequete){
        TIterateur resultat = creeIterateur();
        resultat.setMotCleRequete(motCleRequete, contenu);
        return resultat;
    }
}
