package JavaDesignPatterns.Contruction.PrototypeEtSingleton.Client;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype.Document;

import java.util.ArrayList;
import java.util.List;

public class LiasseClient extends Liasse{

    public LiasseClient(String informations){
        documents = new ArrayList<Document>();
        LiasseVierge laliasseVierge = LiasseVierge.Instance();
        List<Document> documentsVierges = laliasseVierge.getDocuments();

        for (Document document : documentsVierges){
            Document copieDocument = document.duplique();
            copieDocument.remplit(informations);
            documents.add(copieDocument);
        }
    }

    public void affiche(){
        for (Document document : documents){
            document.affiche();
        }
    }

    public void imprime(){
        for (Document document : documents){
            document.imprime();
        }
    }
}
