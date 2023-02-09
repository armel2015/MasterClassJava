package JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurConcret;

import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurAbstrait.ConstructeurLiasseVehicule;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit.LiassePdf;

public class ConstructeurLiasseVehiculePdf extends ConstructeurLiasseVehicule {

    public ConstructeurLiasseVehiculePdf() {
        liasse = new LiassePdf();
    }

    @Override
    public void construitBondeCommande(String nomClient) {
        String document;
        document = "<PDF> Bon de commande client : " + nomClient + "</PDF>";
        liasse.ajouteDocument(document);
    }

    @Override
    public void construitDemandeImmatriculation(String nomDemandeur) {
        String document;
        document = "<PDF> Demande d'immatriculation Demandeur : " + nomDemandeur + "</PDF>";
        liasse.ajouteDocument(document);
    }
}
