package JavaDesignPatterns.Structuration.Facade.Composantes.GestionDocumentaire;

public class ComposantGestionDocument implements GestionDocument{


    @Override
    public String document(int index) {
        return "Document numéro" + index;
    }
}
