package JavaDesignPatterns.PatternComposee.PluggableFactory.FabriqueProduit;

import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Automobile;
import JavaDesignPatterns.PatternComposee.PluggableFactory.ProduitAbstrait.Scooter;

public class FabriqueVehicule {

    protected Automobile prototypeAutomobile;
    protected Scooter prototypeScooter;

    public FabriqueVehicule() {
        this.prototypeAutomobile = null;
        this.prototypeScooter = null;
    }

    public FabriqueVehicule(Automobile prototypeAutomobile, Scooter prototypeScooter) {
        this.prototypeAutomobile = prototypeAutomobile;
        this.prototypeScooter = prototypeScooter;
    }

    public Automobile creeAutomobile(){
        if(prototypeAutomobile == null){
            return null;
        }
        return prototypeAutomobile.duplique();
    }

    public Scooter creeScooter(){
        if(prototypeScooter == null){
            return null;
        }

        return prototypeScooter.duplique();
    }

    public Automobile getPrototypeAutomobile() {
        return prototypeAutomobile;
    }

    public void setPrototypeAutomobile(Automobile prototypeAutomobile) {
        this.prototypeAutomobile = prototypeAutomobile;
    }

    public Scooter getPrototypeScooter() {
        return prototypeScooter;
    }

    public void setPrototypeScooter(Scooter prototypeScooter) {
        this.prototypeScooter = prototypeScooter;
    }
}
