package JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurConcret;

import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurAbstrait.ConstructeurLiasseVehicule;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit.LiasseHtml;

public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule {

    public ConstructeurLiasseVehiculeHtml() {
        liasse = new LiasseHtml();
    }

    @Override
    public void construitBondeCommande(String nomClient) {
        String document;
        document = "<HTML> Bon de commande client : " + nomClient + "</HTML>";
        liasse.ajouteDocument(document);
    }

    @Override
    public void construitDemandeImmatriculation(String nomDemandeur) {
        String document;
        document = "<HTML> Demande d'immatriculation Demandeur : " + nomDemandeur + "</HTML>";
        liasse.ajouteDocument(document);
    }
}
