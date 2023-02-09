package JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurAbstrait;

import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit.Liasse;

public abstract class ConstructeurLiasseVehicule {

    protected Liasse liasse;

    public abstract void construitBondeCommande(String nomClient);
    public abstract void construitDemandeImmatriculation(String nomDemandeur);

    public Liasse resultat(){
        return liasse;
    }
}
