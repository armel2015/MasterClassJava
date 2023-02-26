package JavaDesignPatterns.Comportement.Iterator.CollectionConcrete;

import JavaDesignPatterns.Comportement.Iterator.Collection.Catalogue;
import JavaDesignPatterns.Comportement.Iterator.ElementConcret.Vehicule;
import JavaDesignPatterns.Comportement.Iterator.IterateurConcret.IterateurVehicule;

public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule> {

    public CatalogueVehicule() {
        contenu.add(new Vehicule("vehicule bon marche"));
        contenu.add(new Vehicule("petit vehicule bon marche"));
        contenu.add(new Vehicule("vehicule grande qualite"));
    }

    @Override
    protected IterateurVehicule creeIterateur() {
        return new IterateurVehicule();
    }
}
