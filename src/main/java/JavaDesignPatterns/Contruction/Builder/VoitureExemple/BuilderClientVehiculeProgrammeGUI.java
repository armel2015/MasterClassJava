package JavaDesignPatterns.Contruction.Builder.VoitureExemple;

import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurAbstrait.ConstructeurLiasseVehicule;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurConcret.ConstructeurLiasseVehiculeHtml;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.ConstructeurConcret.ConstructeurLiasseVehiculePdf;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Directeur.Vendeur;
import JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit.Liasse;

import java.util.Scanner;

public class BuilderClientVehiculeProgrammeGUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConstructeurLiasseVehicule constructeurLiasseVehicule;

        System.out.println("Voulez-vous construire des liasses HTML (1) ou PDF (2) : ");

        String choix = scanner.next();

        if("1".equals(choix)){
            constructeurLiasseVehicule = new ConstructeurLiasseVehiculeHtml();
        }else {
            constructeurLiasseVehicule = new ConstructeurLiasseVehiculePdf();
        }

        Vendeur vendeur = new Vendeur(constructeurLiasseVehicule);

        Liasse liasse = vendeur.construit("Martin");

        liasse.imprime();
    }
}
