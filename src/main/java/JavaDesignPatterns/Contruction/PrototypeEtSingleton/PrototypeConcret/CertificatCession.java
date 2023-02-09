package JavaDesignPatterns.Contruction.PrototypeEtSingleton.PrototypeConcret;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype.Document;

public class CertificatCession extends Document {
    @Override
    public void imprime() {
        System.out.println("Imprime le certificat de cession "+ contenu);
    }

    @Override
    public void affiche() {
        System.out.println("Affiche me certificat de session " + contenu);
    }
}
