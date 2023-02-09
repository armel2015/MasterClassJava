package JavaDesignPatterns.Contruction.PrototypeEtSingleton.PrototypeConcret;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype.Document;

public class DemandeImmatriculation extends Document {
    @Override
    public void imprime() {
        System.out.println("Imprime la demande d'immatriculation "+ contenu);
    }

    @Override
    public void affiche() {
        System.out.println("Affiche la demande d'immatriculation "+ contenu);
    }
}
