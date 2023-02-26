package JavaDesignPatterns.Comportement.Strategy.Entite;

import JavaDesignPatterns.Comportement.Strategy.Strategie.DessinCatalogue;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {

    protected List<VueVehicule> contenu  = new ArrayList<VueVehicule>();
    protected DessinCatalogue dessin;

    public VueCatalogue(DessinCatalogue dessin) {
        this.dessin = dessin;
        contenu.add(new VueVehicule("vehicule bon marche"));
        contenu.add(new VueVehicule("vehicule spacieux"));
        contenu.add(new VueVehicule("vehicule rapide"));
        contenu.add(new VueVehicule("vehicule confortable"));
        contenu.add(new VueVehicule("vehicule sportif"));
    }

    public void dessine(){
        dessin.dessine(contenu);
    }
}
