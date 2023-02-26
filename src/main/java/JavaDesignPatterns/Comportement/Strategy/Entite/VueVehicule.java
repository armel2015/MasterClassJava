package JavaDesignPatterns.Comportement.Strategy.Entite;

public class VueVehicule {

    protected String description;

    public VueVehicule(String description){
        this.description = description;
    }

    public void dessine(){
        System.out.println(description);
    }
}
