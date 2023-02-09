package JavaDesignPatterns.Contruction.Builder.VoitureExemple.Directeur;

import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurAbstrait.ConstructeurLiasseVehicule;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit.Liasse;

public class Vendeur {
    protected ConstructeurLiasseVehicule constructeur;

    public Vendeur(ConstructeurLiasseVehicule constructeur) {
        this.constructeur = constructeur;
    }

    public Liasse construit(String nomClient){
        constructeur.construitBondeCommande(nomClient);
        constructeur.construitDemandeImmatriculation(nomClient);
        Liasse liasse = constructeur.resultat();
        return liasse;
    }
}
