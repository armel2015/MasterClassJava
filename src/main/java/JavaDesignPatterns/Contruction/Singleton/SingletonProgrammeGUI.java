package JavaDesignPatterns.Contruction.Singleton;

public class SingletonProgrammeGUI {

    public static void main(String[] args) {
        //initialisation du vendeur du système
        VendeurDeVehicule vendeurDeVehicule = VendeurDeVehicule.Instance();

        vendeurDeVehicule.setNom("Armel");
        vendeurDeVehicule.setAdresse("67800 Hoenheim");
        vendeurDeVehicule.setEmail("wakspace@gmail.com");

        //affichage des informations du vendeur

        affiche();
    }

    public static void affiche(){
        VendeurDeVehicule vendeurDeVehicule = VendeurDeVehicule.Instance();
        vendeurDeVehicule.afficheInfosVendeur();
    }
}
