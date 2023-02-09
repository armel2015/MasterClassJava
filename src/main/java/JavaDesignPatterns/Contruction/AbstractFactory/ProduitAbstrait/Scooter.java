package JavaDesignPatterns.Contruction.AbstractFactory.ProduitAbstrait;

public abstract class Scooter {

    //protected car les classes filles peuvent y accéder car c'est une classe abstraite destinée à un héritage
    protected String modele;
    protected String couleur;
    protected int puissance;

    public Scooter(String modele, String couleur, int puissance) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
    }
    public abstract void afficheCaracteristiques();
}
