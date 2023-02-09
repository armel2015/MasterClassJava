package JavaDesignPatterns.Contruction.PrototypeEtSingleton.Client;

import JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype.Document;

import java.util.List;

public abstract class Liasse {

    protected List<Document> documents;

    public List<Document> getDocuments(){
        return documents;
    }
}
