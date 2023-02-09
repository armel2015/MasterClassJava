package JavaDesignPatterns.Contruction.Singleton;


public class VendeurDeVehicule {

    protected String nom;
    protected String adresse;
    protected String email;

    private static VendeurDeVehicule _instance = null;

    private VendeurDeVehicule(){};

    public static VendeurDeVehicule Instance(){
        if(_instance == null)
            _instance = new VendeurDeVehicule();
        return _instance;
    }

    public void afficheInfosVendeur(){
        System.out.println("Nom : "+ nom);
        System.out.println("Adresse : "+ adresse);
        System.out.println("Email : "+ email);
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
