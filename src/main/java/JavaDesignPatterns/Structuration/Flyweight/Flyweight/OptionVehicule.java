package JavaDesignPatterns.Structuration.Flyweight.Flyweight;

public class OptionVehicule {

    protected  String nom;
    protected String description;
    protected int prixStandard;

    public OptionVehicule(String nom) {
        this.nom = nom;
        this.description = "Description de " + nom;
        this.prixStandard = 100;
    }

    public void affiche(int prixDeVente){
        System.out.println("Option");
        System.out.println("Nom : " + nom);
        System.out.println(description);
        System.out.println("Prix standard : " + prixStandard);
        System.out.println("Prix de vente : " + prixDeVente);
    }
}
