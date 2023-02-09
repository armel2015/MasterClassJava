package JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit;

import java.util.ArrayList;
import java.util.List;

public abstract class Liasse {
    //protected car destiné à au moins 1 héritage vu que la classe est abstraite
    protected List<String> contenu = new ArrayList<String>();


    public abstract void ajouteDocument(String document);
    public abstract void imprime();
}
