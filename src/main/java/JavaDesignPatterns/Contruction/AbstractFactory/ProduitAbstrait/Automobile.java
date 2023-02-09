package JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait;

public abstract class Automobile {

    //protected car les classes filles peuvent y accéder car c'est une classe abstraite destinée à un héritage
    protected String modele;
    protected String couleur;
    protected int puissance;
    protected double espace;

    public Automobile(String modele, String couleur, int puissance, double espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }

    public abstract void afficheCaracteristiques();

}
