package JavaDesignPatterns.Contruction.PrototypeEtSingleton;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Client.LiasseClient;
import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Client.LiasseVierge;
import JavaDesignPatterns.Contruction.PrototypeEtSingleton.PrototypeConcret.BonDeCommande;
import JavaDesignPatterns.Contruction.PrototypeEtSingleton.PrototypeConcret.CertificatCession;
import JavaDesignPatterns.Contruction.PrototypeEtSingleton.PrototypeConcret.DemandeImmatriculation;

public class PrototypeProgrammeGUI {

    public static void main(String[] args) {

        //initialisation de la liasse vierge

        LiasseVierge liasseVierge = LiasseVierge.Instance();

        liasseVierge.ajoute(new BonDeCommande());
        liasseVierge.ajoute(new CertificatCession());
        liasseVierge.ajoute(new DemandeImmatriculation());

        //création d'une nouvelle liasse pour deux clients
        LiasseClient liasseClient1 = new LiasseClient("Armel");
        LiasseClient liasseClient2 = new LiasseClient("Paul");

        liasseClient1.affiche();
        liasseClient2.affiche();

    }
}
