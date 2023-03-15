package JavaDesignPatterns.PatternComposee.CompositeMVC.SujetModele;

import JavaDesignPatterns.PatternComposee.CompositeMVC.ObservateursVueControlleurs.Observateur;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {

    protected List<Observateur> observateurs = new ArrayList<Observateur>();

    public void ajoute(Observateur observateur){
        observateurs.add(observateur);
    }

    public void retire(Observateur observateur){
        observateurs.remove(observateur);
    }

    public void notifie(){
        for (Observateur observateur: observateurs)
            observateur.actualise();
    }
}
