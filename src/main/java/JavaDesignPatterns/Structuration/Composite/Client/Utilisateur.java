package JavaDesignPatterns.Structuration.Composite.Client;

import JavaDesignPatterns.Structuration.Composite.Composant.Societe;
import JavaDesignPatterns.Structuration.Composite.Compose.SocieteMere;
import JavaDesignPatterns.Structuration.Composite.Feuille.SocieteSansFiliale;

public class Utilisateur {

    public static void main(String[] args) {
        Societe societe1 = new SocieteSansFiliale();
        societe1.ajouteVehicule();

        Societe societe2 = new SocieteSansFiliale();
        societe2.ajouteVehicule();
        societe2.ajouteVehicule();

        Societe groupe = new SocieteMere();
        groupe.ajouteFiliale(societe1);
        groupe.ajouteFiliale(societe2);
        groupe.ajouteVehicule();
        System.out.println("Coût d'entretien total du groupe : " + groupe.calculeCoutEntretien());
    }
}
