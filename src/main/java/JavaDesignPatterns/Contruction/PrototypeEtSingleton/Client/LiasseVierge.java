package JavaDesignPatterns.Contruction.PrototypeEtSingleton.Client;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype.Document;

import java.util.ArrayList;

public class LiasseVierge extends Liasse{

    private static LiasseVierge _instance = null;

    private LiasseVierge(){
        documents = new ArrayList<Document>();
    }

    public static LiasseVierge Instance(){
        if(_instance == null)
            _instance = new LiasseVierge();

        return _instance;
    }

    public void ajoute(Document document){
        documents.add(document);
    }

    public void retire(Document document){
        documents.remove(document);
    }
}
