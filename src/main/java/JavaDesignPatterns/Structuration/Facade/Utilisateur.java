package JavaDesignPatterns.Structuration.Facade;

import JavaDesignPatterns.Structuration.Facade.La_facade.WebServiceAuto;
import JavaDesignPatterns.Structuration.Facade.La_facade.WebServiceAutoImpl;

import java.util.List;

public class Utilisateur {

    public static void main(String[] args) {
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();

        System.out.println(webServiceAuto.document(0));
        System.out.println(webServiceAuto.document(1));
        List<String> resultats = webServiceAuto.chercheVehicules(6000, 1000);

        if (resultats.size() > 0){
            System.out.println("Véhicule(s) dont le prix est compris" + "entre 5000 et 7000");
            for (String resultat: resultats){
                System.out.println(" " +resultat);
            }
        }
    }
}
